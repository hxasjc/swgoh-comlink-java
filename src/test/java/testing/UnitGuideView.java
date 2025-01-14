package testing;

import hxasjc.swgoh.Comlink;
import hxasjc.swgoh.ComlinkBuilder;
import hxasjc.swgoh.GameDataItems;
import hxasjc.swgoh.model.MetaData;
import hxasjc.swgoh.payloads.GameDataPayload;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Instant;

public class UnitGuideView {
    public static void main(String[] args) throws IOException {
        Instant start = Instant.now();

        File dir = new File("X:\\jq");
        Comlink comlink = new ComlinkBuilder().comlinkUrl(new URL("http://192.168.1.14:3200")).build();
        MetaData metaData = comlink.getMetadata();
        String ver = metaData.getLatestGamedataVersion();

        GameDataItems[] items = new GameDataItems[]{GameDataItems.UNIT_GUIDE_DEFINITIONS, GameDataItems.REQUIREMENTS, GameDataItems.CHALLENGE, GameDataItems.CAMPAIGN_DEFINITIONS};
        String json = comlink.sendRequest("data", new GameDataPayload().setVersion(ver).setItems(items).build());
        FileUtils.writeStringToFile(new File(dir, "swgoh-ugd.json"), json, StandardCharsets.UTF_8);

        System.out.println(Test.calculateDurationFrom(start));
    }
}
