package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class TerritoryMapStatCategory {
    private String id;
    private String nameKey;

    public String getId() {
        return id;
    }

    public String getNameKey() {
        return nameKey;
    }

    @Override
    public String toString() {
        return "TerritoryMapStatCategory{" +
                "id='" + id + '\'' +
                ", nameKey='" + nameKey + '\'' +
                '}';
    }
}
