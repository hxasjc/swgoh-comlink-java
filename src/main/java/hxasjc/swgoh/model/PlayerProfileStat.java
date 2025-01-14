package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class PlayerProfileStat {
    private String nameKey;
    private String versionKey;
    private long value;
    private int index;

    public String getNameKey() {
        return nameKey;
    }

    public String getVersionKey() {
        return versionKey;
    }

    public long getValue() {
        return value;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "PlayerProfileStat{" +
                "nameKey='" + nameKey + '\'' +
                ", versionKey='" + versionKey + '\'' +
                ", value=" + value +
                ", index=" + index +
                '}';
    }
}
