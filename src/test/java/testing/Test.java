package testing;

import com.google.common.collect.HashMultimap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import hxasjc.swgoh.Comlink;
import hxasjc.swgoh.ComlinkBuilder;
import hxasjc.swgoh.enums.ItemType;
import hxasjc.swgoh.model.*;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Test {
    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    public static final UnaryOperator<String> VER_REPLACE = (s) -> StringUtils.replace(s, ":", "!");

    public static void main(String[] args) throws IOException {
        Instant start = Instant.now();

        try {
            Comlink comlink = new ComlinkBuilder().comlinkUrl(new URL("http://192.168.1.14:3200")).build();
            MetaData metaData = comlink.getMetadata();
            String ver = metaData.getLatestGamedataVersion();
            //GameEventsList events = comlink.getEvents();
            //System.out.println(GSON.toJson(metaData));

            //System.out.println(metaData);

            //System.out.println(GSON.toJson(events));


            //GameData gameData = comlink.getGameData(ver);

            File dir = new File("X:\\jq");

            GameData gameData;

            File file = new File(dir, "swgoh-data-%s.json".formatted(VER_REPLACE.apply(ver)));
            if (file.exists()) {
                System.out.println("yes");
                gameData = GSON.fromJson(new JsonReader(new FileReader(file)), GameData.class);
            } else {
                System.out.println("no");
                gameData = comlink.getGameData(ver);
            }




            //challengeRewards(gameData);
            //unitIdMultiMap(gameData, dir, ver);
            specialUnitIds(gameData, dir, ver);

            System.out.println(calculateDurationFrom(start));
        } catch (Throwable throwable) {
            System.out.println(calculateDurationFrom(start));

            throw  throwable;
        }
    }

    private static void challengeRewards(GameData gameData) {
        for (Challenge challenge : gameData.getChallenge()) {
            for (BucketItem reward : challenge.getReward()) {
                if (reward.getType() == ItemType.PLAYERPORTRAIT || reward.getType() == ItemType.PLAYERTITLE) {
                    System.out.printf("%s: %s%n", challenge.getId(), reward.getId());
                }
            }
        }
    }

    private static void unitIdMultiMap(GameData gameData, File dir, String ver) throws IOException {
        HashMultimap<String, String> multimap = HashMultimap.create();
        File file = new File(dir, "swgoh-units-%s.json".formatted(VER_REPLACE.apply(ver)));

        for (UnitDef unit : gameData.getUnits()) {
            String[] strings = unit.getId().split(":");
            multimap.put(strings[0], strings[1]);
        }

        FileUtils.writeStringToFile(file, GSON.toJson(multimap.asMap()), StandardCharsets.UTF_8);
        System.out.println(multimap);
    }

    private static void specialUnitIds(GameData gameData, File dir, String ver) throws IOException {
        List<String> remove = Arrays.asList("ONE_STAR", "TWO_STAR", "THREE_STAR", "FOUR_STAR", "FIVE_STAR", "SIX_STAR", "SEVEN_STAR");
        HashMultimap<String, String> multimap = HashMultimap.create();
        File file = new File(dir, "swgoh-units-special-%s.json".formatted(VER_REPLACE.apply(ver)));

        for (UnitDef unit : gameData.getUnits()) {
            String[] strings = unit.getId().split(":");
            /*if (strings.length == 2) {
                if (!remove.contains(strings[1])) {
                    multimap.put(strings[0], strings[1]);
                }
            } else {
                System.out.println(unit.getId());
            }*/

            switch (strings.length) {
                case 1 -> multimap.put(strings[0], "");
                case 2 -> {
                    if (!remove.contains(strings[1])) {
                        multimap.put(strings[0], strings[1]);
                    }
                }
                default -> System.out.println(unit.getId());
            }
        }

        FileUtils.writeStringToFile(file, GSON.toJson(multimap.asMap()), StandardCharsets.UTF_8);
    }

    public static double calculateDurationFrom(Instant start) {
        Instant end = Instant.now();
        long duration = end.toEpochMilli() - start.toEpochMilli();
        return (double) duration / 1000;
    }
}
