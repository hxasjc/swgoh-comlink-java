package hxasjc.swgoh;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import hxasjc.swgoh.model.GameData;
import hxasjc.swgoh.model.GameEventsList;
import hxasjc.swgoh.model.MetaData;
import hxasjc.swgoh.model.PlayerProfile;
import hxasjc.swgoh.payloads.MetadataPayload;
import hxasjc.swgoh.payloads.PlayerPayload;
import hxasjc.swgoh.payloads.RequestPayload;
import hxasjc.swgoh.payloads.old.GameDataPayload;
import okhttp3.*;

import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

// TODO: 2025-01-12 implement file caching
public class Comlink {
    public static final MediaType JSON = MediaType.get("application/json");

    private final OkHttpClient httpClient = new OkHttpClient.Builder().connectTimeout(0, TimeUnit.SECONDS).build();
    private final HttpUrl url;
    private final Gson gson = new GsonBuilder().create();

    Comlink(URL url) {
        this.url = HttpUrl.get(url);
    }

    public String getMetrics() throws IOException {
        return sendRequest("metrics", null);
    }

    // TODO: 2025-01-09 readyz - broken? seems to always return 404

    // TODO: 2025-01-09 livez - broken? seems to always return 404

    // TODO: 2025-01-09 enums - still need to do the mapping (Map<String, Map<String, Integer>>?)

    // TODO: 2025-01-09 data - finish mapping GameData; figure out items parameter

    public GameData getGameData(boolean includePveUnits, GameDataItems... items) throws IOException {
        MetaData metaData = getMetadata();
        String ver = metaData.getLatestGamedataVersion();
        RequestPayload payload = new hxasjc.swgoh.payloads.GameDataPayload()
                .setVersion(ver)
                .setIncludePveUnits(includePveUnits)
                .setItems(String.valueOf(GameDataItems.sum(items)))
                .build();
        return sendRequest("data", payload, GameData.class);
    }

    public GameData getGameData(boolean includePveUnits, int segment) throws IOException {
        MetaData metaData = getMetadata();
        String ver = metaData.getLatestGamedataVersion();
        RequestPayload payload = new hxasjc.swgoh.payloads.GameDataPayload()
                .setVersion(ver)
                .setIncludePveUnits(includePveUnits)
                // TODO: 2025-01-10 uncomment 
                //.setRequestSegment(segment)
                .build();
        return sendRequest("data", payload, GameData.class);
    }

    // TODO: 2025-01-09 localization - requires payload & model mapping; unsure what to do with unzipping

    public MetaData getMetadata() throws IOException {
        RequestPayload payload = new MetadataPayload().build();
        return sendRequest("metadata", payload, MetaData.class);
    }

    public GameEventsList getEvents() throws IOException {
        RequestPayload payload = new hxasjc.swgoh.payloads.EventsPayload().build();
        return sendRequest("getEvents", payload, GameEventsList.class);
    }

    // TODO: 2025-01-09 guild - required payload and model mapping

    // TODO: 2025-01-09 getGuildLeaderboard - requires payload and model mapping

    // TODO: 2025-01-09 getGuilds - requires payload and model mapping

    // TODO: 2025-01-09 getLeaderboard - requires payload and model mapping

    public PlayerProfile getPlayerFromAllyCode(String allyCode) throws IOException {
        RequestPayload payload = new PlayerPayload().setAllyCode(allyCode).build();
        return getPlayer(payload);
    }

    public PlayerProfile getPlayerFromPlayerId(String playerId) throws IOException {
        RequestPayload payload = new PlayerPayload().setPlayerId(playerId).build();
        return getPlayer(payload);
    }

    /**
     * Since the endpoint requires either allyCode or playerId, there are 2 helper methods
     * @param payload
     * @return
     * @throws IOException
     * @see Comlink#getPlayerFromAllyCode(String)
     * @see Comlink#getPlayerFromPlayerId(String)
     */
    private PlayerProfile getPlayer(RequestPayload payload) throws IOException {
        return sendRequest("player", payload, PlayerProfile.class);
    }

    // TODO: 2025-01-09 playerArena - requires payload and model mapping

    public  <T> T sendRequest(String endpoint, RequestPayload payload, Class<T> tClass) throws IOException {
        String body = sendRequest(endpoint, payload);
        return gson.fromJson(body, tClass);
    }

    public String sendRequest(String endpoint, RequestPayload payload) throws IOException {
        System.out.println(payload);

        HttpUrl.Builder builder = url.newBuilder().addPathSegment(endpoint);

        Request.Builder request = new Request.Builder().url(builder.build());

        if (payload != null) {
            request.post(RequestBody.create(gson.toJson(payload), JSON));
        }

        // TODO: 2025-01-09 add error handling in case of http error (throw exception)
        Response response = httpClient.newCall(request.build()).execute();
        return response.body().string();
    }

    @Deprecated
    public GameData getGameData(GameDataPayload payload) throws IOException {
        HttpUrl.Builder builder = url.newBuilder().addPathSegment("data");
        System.out.println(builder);
        Request request = new Request.Builder()
                .url(builder.build())
                .post(RequestBody.create(gson.toJson(payload), JSON))
                .build();

        Response response = httpClient.newCall(request).execute();
        String body = response.body().string();

        return gson.fromJson(body, GameData.class);
    }

    @Deprecated
    public GameData getGameData(String version) throws IOException {
        GameDataPayload payload = new GameDataPayload.Builder().enums(true).version(version).build();

        return getGameData(payload);
    }
}
