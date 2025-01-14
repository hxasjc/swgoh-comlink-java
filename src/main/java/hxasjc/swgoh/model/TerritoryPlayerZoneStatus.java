package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class TerritoryPlayerZoneStatus {
    private String zoneId;
    private int attempt;

    public String getZoneId() {
        return zoneId;
    }

    public int getAttempt() {
        return attempt;
    }

    @Override
    public String toString() {
        return "TerritoryPlayerZoneStatus{" +
                "zoneId='" + zoneId + '\'' +
                ", attempt=" + attempt +
                '}';
    }
}
