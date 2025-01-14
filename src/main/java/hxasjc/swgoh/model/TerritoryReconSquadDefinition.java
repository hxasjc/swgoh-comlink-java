package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class TerritoryReconSquadDefinition {
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
        return "TerritoryReconSquadDefinition{" +
                "id='" + id + '\'' +
                ", nameKey='" + nameKey + '\'' +
                '}';
    }
}
