package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class TerritoryTournamentDivisionDefinition {
    private int id;
    private String nameKey;
    private String icon;

    public int getId() {
        return id;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String getIcon() {
        return icon;
    }

    @Override
    public String toString() {
        return "TerritoryTournamentDivisionDefinition{" +
                "id=" + id +
                ", nameKey='" + nameKey + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
