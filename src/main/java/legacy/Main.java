package legacy;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

import static org.apache.commons.lang.StringUtils.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File titles = new File("X:\\jq\\playertitle.txt");
        Scanner scanner = new Scanner(titles);

        String line;
        int limit = 2400;
        int count = 0;

        HashMap<String, TitleInfo> titleMap = new HashMap<>();

        while (scanner.hasNextLine() && count < limit) {
            line = scanner.nextLine();
            String[] arr = getStrings(line);
            Pair<String, String> pair = new Pair<>(arr[0], arr[1]);

            //System.out.println(pair);

            String key = null;
            if (pair.key().endsWith("SHORT_DESC")) {
                key = StringUtils.substringBetween(pair.key, "PLAYERTITLE_", "_SHORT_DESC");
                titleMap.computeIfAbsent(key, s -> new TitleInfo()).shortDesc = pair.value();
            } else if (pair.key.endsWith("NAME")) {
                key = StringUtils.substringBetween(pair.key, "PLAYERTITLE_", "_NAME");
                titleMap.computeIfAbsent(key, s -> new TitleInfo()).name = pair.value();
            } else if (pair.key.endsWith("_DESC")) {
                key = StringUtils.substringBetween(pair.key, "PLAYERTITLE_", "_DESC");
                titleMap.computeIfAbsent(key, s -> new TitleInfo()).desc = pair.value();
            }

            count++;
        }

        titleMap.forEach((s, titleInfo) -> {
            if (titleInfo.descContains("Conquest Pass")) {
                titleInfo.source = TitleSource.CONQUEST;
            } else if (titleInfo.descContains("guild exchange")) {
                titleInfo.source = TitleSource.GUILD_EXCHANGE;
            } else if (titleInfo.descContains("hard feat")) {
                titleInfo.source = TitleSource.CONQUEST_FEAT;
            } else if (titleInfo.descContains("hoth")) {
                titleInfo.source = TitleSource.TERRITORY_BATTLE;
            } else if (titleInfo.descEndsWith("feat.") || titleInfo.descEndsWith("feat")) {
                titleInfo.source = TitleSource.GA_FEAT;
            } else if (titleInfo.descContains("territory war")) {
                titleInfo.source = TitleSource.TERRITORY_WAR;
            } else if (titleInfo.descContains("prestigious quests")) {
                titleInfo.source = TitleSource.PRESTIGIOUS_QUEST;
            } else if (titleInfo.descContains("star forge")) {
                titleInfo.source = TitleSource.EPIC_CONFRONTATION;
            } else if (titleInfo.descContains("mythic tier iii")) {
                titleInfo.source = TitleSource.MYTHIC_EVENT;
            } else if (titleInfo.descContains("clash on kamino")) {
                titleInfo.source = TitleSource.CLASH_ON_KAMINO;
            } else if (titleInfo.descContains("May the 4th")) {
                titleInfo.source = TitleSource.MAY_4TH;
            } else if (titleInfo.descContains("marquee")) {
                titleInfo.source = TitleSource.MARQUEE_EVENT;
            } else if (
                    s.startsWith("GLSLKR_QUEST") ||
                            s.startsWith("SEE_QUEST") ||
                            s.startsWith("LV_QUEST") ||
                            s.startsWith("GLAHSOKA_QUEST") ||
                            s.startsWith("JMK_QUEST") ||
                            s.startsWith("JMLS_QUEST") ||
                            s.startsWith("GLREY_QUEST") ||
                            s.startsWith("JABBA_QUEST") ||
                            s.startsWith("GLLEIA_QUEST"))
            {
                titleInfo.source = TitleSource.GALACTIC_LEGEND;
            } else if (titleInfo.descContains("episode pass")) {
                titleInfo.source = TitleSource.EPISODE_PASS;
            }

            try {
                if (titleInfo.source == null && titleInfo.name != null) {
                    titleInfo.source = switch (titleInfo.name) {
                        case "Patron" -> TitleSource.DEFAULT;
                        case "Blademaster" -> TitleSource.GA_FEAT;
                        default -> switch (s) {
                            case "EXHIBITION_A", "LOYAL_FRIEND", "HERMIT_YODA", "ACROSS_THE_STARS", "TO_ME_SHE_IS_ROYALTY" -> TitleSource.OTHER;
                            case "GLKYLOREN_EVENT", "GLKENOBI_EVENT", "GLREY_EVENT", "GLPALP_EVENT", "GLLORDVADER_EVENT", "LEIA_EVENT", "GLLUKE_EVENT", "JABBA_EVENT" -> TitleSource.GALACTIC_LEGEND;
                            case "CHALLENGER" -> TitleSource.QUEST;
                            case "SQUADCAPTAIN" -> TitleSource.SQUAD_ARENA;
                            case "RANCORWRANGLER", "SITHSMITER", "TANKTAMER", "NABOO_RAID", "NABOO_RAID_VICTORY", "PITFIGHTER" -> TitleSource.RAID;
                            case "HOLOTABLEHERO", "HEAD_CLANKER", "SHADOW_APPRENTICE", "MANDO", "JEDI_GENERAL", "VODE_AN_VANGUARD" -> TitleSource.GAME_ANNIVERSARY;
                            case "SEASON001_KYBER_RANK02_10", "SEASON001_CHROMIUM_ALL", "SEASON001_KYBER_RANK01", "SEASON001_BRONZIUM_ALL", "SEASON001_CARBONITE_ALL", "SEASON001_KYBER_11PLUS", "SEASON001_AURODIUM_ALL" -> TitleSource.GA_LEAGUE;
                            case "JARJARBINKS", "SENATOR", "GRAND_INQUISITOR", "SHADOW_HUNTER" -> TitleSource.LEGENDARY_EVENT;
                            case "USURPER", "GENERALOFTHE501ST", "BAYLANSKOLL" -> TitleSource.EPIC_CONFRONTATION;
                            case "RED_BLADE", "HIGH_MAGISTRATE", "ORDER_OF_INQUISITORS" -> TitleSource.MAY_4TH;
                            case "INQUISITORIUS", "SEPARATIST_COMMANDER", "WARMACHINE" -> TitleSource.TERRITORY_BATTLE;
                            case "DOCTORAPHRA" -> TitleSource.LEGACY_EVENT;
                            case "SHIPCAPTAIN" -> TitleSource.FLEET_ARENA;
                            case "GAC_SHADOW" -> TitleSource.GA_FEAT;
                            case "EXECUTOR_QUEST", "PROFUNDITY_QUEST" -> TitleSource.FLEET_EVENT;
                            default -> {
                                System.out.println(new Pair<>(s, titleInfo));
                                yield  null;
                            }
                        };

                    };
                }
            } catch (Throwable throwable) {
                throw new RuntimeException(String.valueOf(new Pair<>(s, titleInfo)), throwable);
            }
        });

        //System.out.println(titleMap);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        //System.out.println(gson.toJson(titleMap.entrySet().stream().sorted((o1, o2) -> o1.getValue().name.compareToIgnoreCase(o2.getValue().name)).collect(Collectors.toList())));
        ArrayList<Map.Entry<String, TitleInfo>> list = new ArrayList<>(titleMap.entrySet());
        List<TitleInfo> newList = list.stream()
                .map(Map.Entry::getValue)
                .filter(titleInfo -> titleInfo.name != null)
                .sorted((o1, o2) -> o1.name.compareToIgnoreCase(o2.name))
                .collect(Collectors.toList());
        System.out.println(gson.toJson(newList));

        /*Map<String, TitleInfo> map = new HashMap<>();
        Set<Map.Entry<String, TitleInfo>> set = titleMap.entrySet().stream().filter(stringTitleInfoEntry -> stringTitleInfoEntry.getValue().source == null).collect(Collectors.toSet());
        set.forEach(entry -> map.put(entry.getKey(), entry.getValue()));

        System.out.println(gson.toJson(map));*/
    }

    public static String[] getStrings(String s) {
        String[] result = new String[2];
        String[] arr = s.split(": ");
        result[0] = removeStart(removeEnd(removeEnd(arr[0], "\""), "\","), "\"");
        result[1] = removeStart(removeEnd(removeEnd(arr[1], "\""), "\","), "\"");

        return result;
    }

    public record Pair<K,V>(K key, V value) {}

    public static class TitleInfo {
        public String name, desc, shortDesc;
        public TitleSource source;

        public boolean descContains(String s) {
            return containsIgnoreCase(desc, s) || containsIgnoreCase(shortDesc, s);
            //return desc.contains(s) || shortDesc.contains(s);
        }

        public boolean descEndsWith(String s) {
            return endsWithIgnoreCase(desc, s) || endsWithIgnoreCase(shortDesc, s);
        }

        @Override
        public String toString() {
            return "TitleInfo{" +
                    "name='" + name + '\'' +
                    ", desc='" + desc + '\'' +
                    ", shortDesc='" + shortDesc + '\'' +
                    '}';
        }
    }

    public enum TitleSource {
        CLASH_ON_KAMINO,
        CONQUEST,
        CONQUEST_FEAT,
        DEFAULT,
        EPISODE_PASS,
        GALACTIC_LEGEND,
        GAME_ANNIVERSARY,
        GA_FEAT,
        GUILD_EXCHANGE,
        MYTHIC_EVENT,
        OTHER,
        PRESTIGIOUS_QUEST,
        TERRITORY_BATTLE,
        TERRITORY_WAR,
        MAY_4TH,
        QUEST,
        MARQUEE_EVENT,
        SQUAD_ARENA,
        RAID,
        GA_LEAGUE,
        LEGENDARY_EVENT,
        EPIC_CONFRONTATION,
        LEGACY_EVENT,
        FLEET_EVENT,
        FLEET_ARENA
    }
}
