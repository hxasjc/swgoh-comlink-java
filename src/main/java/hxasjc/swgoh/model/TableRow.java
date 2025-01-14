package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class TableRow {
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
        return "TableRow{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
