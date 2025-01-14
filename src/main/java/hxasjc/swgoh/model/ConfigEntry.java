package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class ConfigEntry {
    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ConfigEntry{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
