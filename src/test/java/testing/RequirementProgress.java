package testing;

import com.google.common.collect.ArrayListMultimap;
import hxasjc.swgoh.Comlink;
import hxasjc.swgoh.ComlinkBuilder;
import hxasjc.swgoh.GameDataItems;
import hxasjc.swgoh.enums.*;
import hxasjc.swgoh.model.*;
import legacy.GsonTest;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Instant;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.UnaryOperator;

import static testing.CommonUtil.*;

@SuppressWarnings("unused")
public class RequirementProgress {
    public static UnaryOperator<String> LINK_ESCAPE = s -> StringUtils.replaceEachRepeatedly(s, new String[]{"\u0026", "\u003d"}, new String[]{"&", "="});
    public static Map<String, Integer> RELIC_MAP = Map.ofEntries(
            Map.entry("GLEVENT_PREREQ_RELIC_01", 1),
            Map.entry("GLEVENT_PREREQ_RELIC_02", 2),
            Map.entry("GLEVENT_PREREQ_RELIC_03", 3),
            Map.entry("GLEVENT_PREREQ_RELIC_04", 4),
            Map.entry("GLEVENT_PREREQ_RELIC_05", 5),
            Map.entry("GLEVENT_PREREQ_RELIC_06", 6),
            Map.entry("GLEVENT_PREREQ_RELIC_07", 7),
            Map.entry("GLEVENT_PREREQ_RELIC_08", 8),
            Map.entry("GLEVENT_PREREQ_RELIC_09", 9),
            Map.entry("GLEVENT_PREREQ_RELIC_10", 10));

    public static void main(String[] args) throws IOException {
        Instant start = Instant.now();

        Comlink comlink = new ComlinkBuilder().comlinkUrl(new URL("http://192.168.1.14:3200")).build();

        GsonTest.Localisation localisation = GsonTest.getLocalisation();
        File dir = new File("X:\\jq");
        String myAllyCode = "859981154";
        JourneyCharacter character = JourneyCharacter.STARKILLER;

        String camAllyCode = "757674731";

        //generateRequirementsSpreadsheet(localisation, dir, myAllyCode, JourneyCharacter.values());
        //generateRequirementsSpreadsheet(localisation, dir, camAllyCode, JourneyCharacter.values());

        PlayerProfile profile = comlink.getPlayerFromAllyCode(myAllyCode);

        //System.out.println(getJourneyCharacterRequirements(JourneyCharacterSelectionMode.ALL, JourneyCharacter.STARKILLER));
        ArrayListMultimap<String, JourneyCharacterRequirementLevels> levels = getJourneyCharacterRequirements(JourneyCharacterSelectionMode.SELECT, JourneyCharacter.DARTHREVAN, JourneyCharacter.JEDIKNIGHTREVAN, JourneyCharacter.DARTHMALAK);
        getPlayerOwnedLevels(profile, levels);
        System.out.println("\nlevels:");
        System.out.println(levels);

        System.out.println(Test.calculateDurationFrom(start));
    }

    public static String getReqIdFromLink(String s) {
        //String link = LINK_ESCAPE.apply(s);
        String[] segments = s.split("=");
        return segments[segments.length - 1];
    }

    public static class JourneyCharacterRequirementLevels {
        public String unitId;
        public JourneyCharacterRequirementCriteria criteria;
        public int requiredLevel = 0;
        public int ownedLevel = 0;

        public JourneyCharacterRequirementLevels setUnitId(String unitId) {
            this.unitId = unitId;
            return this;
        }

        public JourneyCharacterRequirementLevels setCriteria(JourneyCharacterRequirementCriteria criteria) {
            this.criteria = criteria;
            return this;
        }

        public JourneyCharacterRequirementLevels setRequiredLevel(int requiredLevel) {
            this.requiredLevel = requiredLevel;
            return this;
        }

        public JourneyCharacterRequirementLevels setOwnedLevel(int ownedLevel) {
            this.ownedLevel = ownedLevel;
            return this;
        }

        public JourneyCharacterRequirementLevels setRequiredLevelOrMax(int requiredLevel) {
            this.requiredLevel = Math.max(this.requiredLevel, requiredLevel);
            return this;
        }

        public JourneyCharacterRequirementLevels setOwnedLevelOrMax(int ownedLevel) {
            this.ownedLevel = Math.max(this.ownedLevel, ownedLevel);
            return this;
        }

        @Override
        public String toString() {
            return "JourneyCharacterRequirementLevels{" +
                    "unitId='" + unitId + '\'' +
                    ", criteria=" + criteria +
                    ", requiredLevel=" + requiredLevel +
                    ", ownedLevel=" + ownedLevel +
                    '}';
        }
    }

    public enum JourneyCharacterSelectionMode {
        ALL,
        SELECT
    }

    public enum JourneyCharacter {
        GLAHSOKATANO,
        GLLEIA,
        JEDIKNIGHTCAL,
        JARJARBINKS,
        DOCTORAPHRA,
        JABBATHEHUTT,
        GRANDINQUISITOR,
        STARKILLER,
        CAPITALEXECUTOR,
        CAPITALPROFUNDITY,
        CAPITALLEVIATHAN,
        LORDVADER,
        JEDIMASTERKENOBI,
        GRANDMASTERLUKE,
        SITHPALPATINE,
        SUPREMELEADERKYLOREN,
        GLREY,
        THEMANDALORIANBESKARARMOR,
        R2D2_LEGENDARY,
        BB8,
        REYJEDITRAINING,
        GRANDMASTERYODA,
        EMPERORPALPATINE,
        GRANDADMIRALTHRAWN,
        CAPITALCHIMAERA,
        C3POLEGENDARY,
        COMMANDERLUKESKYWALKER,
        JEDIKNIGHTLUKE,
        HANSOLO,
        MILLENNIUMFALCON,
        CHEWBACCALEGENDARY,
        JEDIKNIGHTREVAN,
        DARTHREVAN,
        DARTHMALAK,
        GENERALKENOBI,
        PADMEAMIDALA,
        GENERALSKYWALKER,
        MANDALORBOKATAN,
        BAYLANSKOLL,
        DARTHTRAYA,
        HOTHLEIA,
        IMPERIALPROBEDROID,
        WATTAMBOR,
        KIADIMUNDI,
        THIRDSISTER;

        @Deprecated
        public final String name = "";
        @Deprecated
        public final String[] challenges = new String[1];
    }

    // TODO: 2025-01-12 implement GP criteria
    public enum JourneyCharacterRequirementCriteria {
        STAR,
        GEAR,
        RELIC
    }

    // TODO: 2025-01-12 check all possible requirement options (qust, eca mandatory units, eca categories) instead of just 1
    public static ArrayListMultimap<String, JourneyCharacterRequirementLevels> getJourneyCharacterRequirements(JourneyCharacterSelectionMode mode, JourneyCharacter... characters) throws IOException {
        String[] charIds;

        if (mode == JourneyCharacterSelectionMode.ALL) {
            characters = JourneyCharacter.values();
        }

        charIds = new String[characters.length];

        for (int i = 0; i < characters.length; i++) {
            charIds[i] = characters[i].toString();
        }

        ArrayListMultimap<String, JourneyCharacterRequirementLevels> journeyCharacterRequirementMap = ArrayListMultimap.create();

        QuadConsumer<String, String, JourneyCharacterRequirementCriteria, Integer> applyToMap = (s, s2, journeyCharacterRequirementCriteria, integer) -> {
            List<JourneyCharacterRequirementLevels> list = journeyCharacterRequirementMap.get(s);
            JourneyCharacterRequirementLevels levels = null;

            for (JourneyCharacterRequirementLevels requirementLevels : list) {
                if (requirementLevels.unitId.equals(s2) && requirementLevels.criteria.equals(journeyCharacterRequirementCriteria)) {
                    levels = requirementLevels;
                    break;
                }
            }

            if (levels == null) {
                levels = new JourneyCharacterRequirementLevels().setUnitId(s2).setCriteria(journeyCharacterRequirementCriteria);
                journeyCharacterRequirementMap.put(s, levels);
            }

            levels.setRequiredLevelOrMax(integer);
        };

        Comlink comlink = new ComlinkBuilder().comlinkUrl(new URL("http://192.168.1.14:3200")).build();
        GameData gameData = comlink.getGameData(false, GameDataItems.CHALLENGE, GameDataItems.REQUIREMENTS, GameDataItems.UNIT_GUIDE_DEFINITIONS, GameDataItems.CAMPAIGN_DEFINITIONS);
        GameData unitData = comlink.getGameData(false, GameDataItems.UNIT_DEFINITIONS);

        for (UnitGuideDefinition unitGuideDefinition : gameData.getUnitGuideDefinition()) {
            if (ArrayUtils.contains(charIds, unitGuideDefinition.getUnitBaseId())) {
                System.out.println("found " + unitGuideDefinition.getUnitBaseId());

                String activationRequirementId = unitGuideDefinition.getAdditionalActivationRequirementId();

                if (activationRequirementId.length() > 0) {
                    // TODO: 2025-01-12 check which other characters use quests in a way other than GLs and newer chars
                    System.out.println("quest based");

                    Requirement activationRequirement = null;
                    for (Requirement requirement : gameData.getRequirement()) {
                        if (requirement.getId().equals(activationRequirementId)) {
                            activationRequirement = requirement;
                            break;
                        }
                    }

                    ArrayList<String> reqChallenges = new ArrayList<>();

                    for (RequirementItem requirementItem : Objects.requireNonNull(activationRequirement).getRequirementItem()) {
                        if (requirementItem.getType() == RequirementType.CHALLENGEREQUIREMENT) {
                            reqChallenges.add(requirementItem.getId());
                        }
                    }

                    while (reqChallenges.remove("player-level-up85")) {
                    }

                    for (Challenge challenge : gameData.getChallenge()) {
                        if (reqChallenges.contains(challenge.getId())) {
                            for (ChallengeTask task : challenge.getTask()) {
                                //journeyCharacterRequirementMap.put(unitGuideDefinition.getUnitBaseId(), new JourneyCharacterRequirement(getReqIdFromLink(task.getActionLinkDef().getLink()), task.getDescKey()));
                                journeyCharacterRequirementMap.put(
                                        unitGuideDefinition.getUnitBaseId(),
                                        getRequiredCriteriaLevel(getReqIdFromLink(task.getActionLinkDef().getLink()), task.getDescKey())
                                );
                            }
                        }
                    }
                } else {
                    System.out.println("eca digging");

                    CampaignElementIdentifier campaignElementIdentifier = unitGuideDefinition.getCampaignElementIdentifier();
                    CombatType combatType = getCampaignNode(gameData, campaignElementIdentifier).getCombatType();

                    ArrayList<EntryCategoryAllowed> allowedEntryCategories = getCampaignElementAllowedCategories(gameData, campaignElementIdentifier);

                    if (campaignElementIdentifier.getCampaignId().equals("EVENTS")) {
                        for (EntryCategoryAllowed category : allowedEntryCategories) {
                            Pair<JourneyCharacterRequirementCriteria, Integer> pair = getRequiredCriteriaLevelFromECA(category);

                            if (category.getMandatoryRosterUnit().length > 0) {
                                for (MandatoryRosterUnit rosterUnit : category.getMandatoryRosterUnit()) {
                                    applyToMap.apply(
                                            unitGuideDefinition.getUnitBaseId(),
                                            rosterUnit.getId(),
                                            pair.key(),
                                            pair.value()
                                    );
                                }
                            } else {
                                // TODO: 2025-01-12 filter out irrelevent char variants (eg. *_SPEEDERBIKERAID or units from events

                                for (String s : category.getCategoryId()) {
                                    System.out.println(s);
                                    for (UnitDef unitDef : unitData.getUnitsByCategory(s)) {
                                        if (unitDef.isObtainable() && unitDef.getCombatType().equals(combatType)) {
                                            System.out.println(unitDef.getBaseId());
                                            applyToMap.apply(
                                                    unitGuideDefinition.getUnitBaseId(),
                                                    unitDef.getBaseId(),
                                                    pair.key(),
                                                    pair.value()
                                            );
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return journeyCharacterRequirementMap;
    }

    public static Pair<JourneyCharacterRequirementCriteria, Integer> getRequiredCriteriaLevelFromECA(EntryCategoryAllowed entryCategoryAllowed) {
        RelicTier relicTier = entryCategoryAllowed.getMinimumRelicTier();
        UnitTier unitTier = entryCategoryAllowed.getMinimumUnitTier();
        Rarity rarity = entryCategoryAllowed.getMinimumUnitRarity();

        JourneyCharacterRequirementCriteria criteria;

        if (relicTier.ordinal() > 1) {
            criteria = JourneyCharacterRequirementCriteria.RELIC;
        } else if (unitTier.ordinal() > 1) {
            criteria = JourneyCharacterRequirementCriteria.GEAR;
        } else {
            criteria = JourneyCharacterRequirementCriteria.STAR;
        }

        int level = switch (criteria) {
            case STAR -> rarity.friendlyValue();
            case GEAR -> unitTier.friendlyValue();
            case RELIC -> relicTier.friendlyValue();
        };

        return new Pair<>(criteria, level);
    }

    public static JourneyCharacterRequirementLevels getRequiredCriteriaLevel(String id, String level) {
        JourneyCharacterRequirementLevels jcrl = new JourneyCharacterRequirementLevels();
        String[] strings = level.split("_");
        if (strings[0].endsWith("EVENT") && strings[1].equals("PREREQ")) {
            jcrl.unitId = id;

            switch (strings[2]) {
                case "RELIC" -> jcrl.criteria = JourneyCharacterRequirementCriteria.RELIC;
                case "STAR" -> jcrl.criteria = JourneyCharacterRequirementCriteria.STAR;
                case "GEAR" -> jcrl.criteria = JourneyCharacterRequirementCriteria.GEAR;
            }

            jcrl.requiredLevel = Math.max(jcrl.requiredLevel, Integer.parseInt(strings[3]));

            return jcrl;
        } else {
            throw new IllegalArgumentException(); // TODO: 2025-01-12 more specific error message
        }
    }

    public static void getPlayerOwnedLevels(PlayerProfile profile, ArrayListMultimap<String, JourneyCharacterRequirementLevels> levels) {
        levels.asMap().forEach((id, reqs) -> {
            for (JourneyCharacterRequirementLevels req : reqs) {
                for (Unit unit : profile.getRosterUnit()) {
                    if (req.unitId.equals(getBaseIdFromDefId(unit.getDefinitionId()))) {
                        req.ownedLevel = switch (req.criteria) {
                            case RELIC -> Math.max(unit.getRelic().getCurrentTier().ordinal() - 2, 0);
                            case STAR -> unit.getCurrentRarity().ordinal();
                            case GEAR -> unit.getCurrentTier().ordinal();
                        };
                    }
                }
            }
        });
    }

    public static ArrayList<EntryCategoryAllowed> getCampaignElementAllowedCategories(GameData gameData, CampaignElementIdentifier campaignElementIdentifier) {
        ArrayList<EntryCategoryAllowed> list = new ArrayList<>();

        if (campaignElementIdentifier.getCampaignMissionId().length() > 0) {
            list.add(CommonUtil.getCampaignNodeMission(gameData, campaignElementIdentifier).getEntryCategoryAllowed());
        } else {
            /*CampaignNodeDifficultyGroup difficultyGroup = getCampaignNodeDifficultyGroup(gameData, campaignElementIdentifier);
            System.out.println(difficultyGroup);
            for (CampaignNode node : difficultyGroup.getCampaignNode()) {
                EntryCategoryAllowed e = node.getEntryCategoryAllowed();
                System.out.println(e);
                list.add(e);
            }*/

            for (CampaignNodeMission mission : CommonUtil.getCampaignNode(gameData, campaignElementIdentifier).getCampaignNodeMission()) {
                list.add(mission.getEntryCategoryAllowed());
            }
        }

        return list;
    }

    public static String getBaseIdFromDefId(String s) {
        return s.split(":")[0];
    }

    @Deprecated
    public static void generateRequirementsSpreadsheet(GsonTest.Localisation localisation, File dir, String allyCode, JourneyCharacter... journeyCharacters) throws IOException {
        UnaryOperator<String> getLocalisation = s -> localisation.data.getOrDefault(s, s);
        UnaryOperator<String> getBaseIdFromDefId = s -> s.split(":")[0];

        String ver = "0.36.0:Bxtvmnh4SZmN2IskL8GIbw";
        Comlink comlink = new ComlinkBuilder().comlinkUrl(new URL("http://192.168.1.14:3200")).build();
        //GameData gameData = comlink.getLatestGameData(new GameDataPayload.Builder().enums(true));
        //GameData gameData = getGameDataUsingCache(ver, dir, comlink);
        GameData gameData = comlink.getGameData(true, GameDataItems.CHALLENGE);
        PlayerProfile profile = comlink.getPlayerFromAllyCode(allyCode);
        String playerName = profile.getName();

        File output = new File(dir, "requirements-%s.xlsx".formatted(playerName));

        XSSFWorkbook workbook = new XSSFWorkbook();

        CellStyle headerStyle = workbook.createCellStyle();
        XSSFFont headerFont = workbook.createFont();
        //headerFont.setFontName("Arial");
        //headerFont.setFontHeight(16);
        headerFont.setBold(true);
        headerStyle.setFont(headerFont);

        HashMap<JourneyCharacter, JourneyCharacterStats> journeyCharacterStats = new HashMap<>();
        BiConsumer<JourneyCharacter, String> addReq = (journey, req) -> journeyCharacterStats.getOrDefault(journey, new JourneyCharacterStats()).requirements.add(req);
        BiConsumer<JourneyCharacter, Integer> addReqRelics = (journey, relics) -> journeyCharacterStats.getOrDefault(journey, new JourneyCharacterStats()).totalRelicLevels += relics;
        BiConsumer<JourneyCharacter, Integer> addOwnedRelics = (journey, relics) -> journeyCharacterStats.getOrDefault(journey, new JourneyCharacterStats()).ownedRelicLevels += relics;

        for (JourneyCharacter character : journeyCharacters) {
            ArrayList<ChallengeTask> charTasks = new ArrayList<>();
            ArrayList<String> reqs = new ArrayList<>();

            for (Challenge challenge : gameData.getChallenge()) {
                if (ArrayUtils.contains(character.challenges, challenge.getId())) {
                    for (ChallengeTask task : challenge.getTask()) {
                        String reqId = getReqIdFromLink(task.getActionLinkDef().getLink());

                        if (RELIC_MAP.containsKey(task.getDescKey())) {
                            charTasks.add(task);
                            reqs.add(reqId);
                        } else {
                            System.out.println(task);
                        }
                    }
                }
            }

            HashMap<String, RelicTier> playerRelicMap = new HashMap<>();

            //get relic levels from player profile
            //System.out.println(profile);
            //System.out.println(Arrays.toString(profile.getRosterUnit()));
            for (Unit unit : profile.getRosterUnit()) {
                if (reqs.contains(getBaseIdFromDefId.apply(unit.getDefinitionId()))) {
                    playerRelicMap.put(getBaseIdFromDefId.apply(unit.getDefinitionId()), unit.getRelic().getCurrentTier());
                }
            }

            Sheet sheet = workbook.createSheet(character.name);

            {
                Row row = sheet.createRow(0);

                Cell cell = row.createCell(0);
                cell.setCellValue("Unit Name");
                cell.setCellStyle(headerStyle);

                cell = row.createCell(1);
                cell.setCellValue("Required Relic Level");
                cell.setCellStyle(headerStyle);

                cell = row.createCell(2);
                cell.setCellValue("Current Relic Level");
                cell.setCellStyle(headerStyle);

                // TODO: 2025-01-09 add 2 more columns for ship stars required/owned
            }

            int rowId = 1;

            for (ChallengeTask task : charTasks) {
                Row row = sheet.createRow(rowId);

                String name = getLocalisation.apply(task.getNameKey());
                Cell cell = row.createCell(0);
                cell.setCellValue(name);

                int reqRelic = RELIC_MAP.get(task.getDescKey());
                cell = row.createCell(1);
                cell.setCellValue(reqRelic);

                try {
                    RelicTier tier = playerRelicMap.getOrDefault(getReqIdFromLink(task.getActionLinkDef().getLink()), RelicTier.RELICLOCKED);
                    int relic = Math.max(0, tier.ordinal() - 2);

                    cell = row.createCell(2);
                    cell.setCellValue(relic);
                } catch (Exception e) {
                    System.out.println(playerRelicMap);
                    System.out.println(getReqIdFromLink(task.getActionLinkDef().getLink()));
                }

                rowId++;
            }

            // TODO: 2025-01-09 add total row showing total required relic levels, total completed relic levels and % complete
        }

        FileOutputStream outputStream = new FileOutputStream(output);
        workbook.write(outputStream);
        workbook.close();
    }

    public static class JourneyCharacterStats {
        public ArrayList<String> requirements;
        public int totalRelicLevels;
        public int ownedRelicLevels;

        public double avgRelicPerReq() {
            return (double) totalRelicLevels / requirements.size();
        }

        public ArrayList<String> getRequirements() {
            return requirements;
        }

        public JourneyCharacterStats setRequirements(ArrayList<String> requirements) {
            this.requirements = requirements;
            return this;
        }

        public int getTotalRelicLevels() {
            return totalRelicLevels;
        }

        public JourneyCharacterStats setTotalRelicLevels(int totalRelicLevels) {
            this.totalRelicLevels = totalRelicLevels;
            return this;
        }

        public int getOwnedRelicLevels() {
            return ownedRelicLevels;
        }

        public JourneyCharacterStats setOwnedRelicLevels(int ownedRelicLevels) {
            this.ownedRelicLevels = ownedRelicLevels;
            return this;
        }
    }
}
