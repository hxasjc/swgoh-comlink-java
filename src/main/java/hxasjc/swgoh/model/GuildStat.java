package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class GuildStat {
    private String id;
    private int value;

    public String getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public GuildStat setId(String id) {
        this.id = id;
        return this;
    }
}
