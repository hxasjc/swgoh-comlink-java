package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class RaidBlackboardPointSource {
    private String id;
    private String locKey;

    public String getId() {
        return id;
    }

    public String getLocKey() {
        return locKey;
    }

    @Override
    public String toString() {
        return "RaidBlackboardPointSource{" +
                "id='" + id + '\'' +
                ", locKey='" + locKey + '\'' +
                '}';
    }
}
