package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class TerritoryMapStat {
    private String mapStatId;
    private TerritoryPlayerStat playerStat;

    public String getMapStatId() {
        return mapStatId;
    }

    public TerritoryPlayerStat getPlayerStat() {
        return playerStat;
    }

    @Override
    public String toString() {
        return "TerritoryMapStat{" +
                "mapStatId='" + mapStatId + '\'' +
                ", playerStat=" + playerStat +
                '}';
    }
}
