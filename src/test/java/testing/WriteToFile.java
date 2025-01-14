package testing;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import hxasjc.swgoh.Comlink;
import hxasjc.swgoh.ComlinkBuilder;
import hxasjc.swgoh.model.GameData;
import hxasjc.swgoh.model.MetaData;
import hxasjc.swgoh.payloads.old.GameDataPayload;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.function.UnaryOperator;

public class WriteToFile {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    private static final boolean OVERWRITE = false;

    public static void main(String[] args) throws IOException {
        UnaryOperator<String> verReplace = (s) -> StringUtils.replace(s, ":", "!");

        Instant start = Instant.now();

        File dir = new File("X:\\jq");

        Comlink comlink = new ComlinkBuilder().comlinkUrl(new URL("http://192.168.1.14:3200")).build();

        MetaData metaData = comlink.getMetadata();
        String ver = metaData.getLatestGamedataVersion();

        File file = new File(dir, "swgoh-data-%s.json".formatted(verReplace.apply(ver)));
        if (file.exists() && !OVERWRITE) {
            System.out.println("exists");
        } else {
            GameData gameData = comlink.getGameData(new GameDataPayload.Builder().version(ver).enums(true).includePveUnits(true).build());
            FileUtils.writeStringToFile(file, GSON.toJson(gameData), StandardCharsets.UTF_8);
        }

        System.out.println(Test.calculateDurationFrom(start));
    }
}
