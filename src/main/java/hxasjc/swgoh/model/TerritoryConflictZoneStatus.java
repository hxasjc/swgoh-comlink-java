package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class TerritoryConflictZoneStatus {
    private TerritoryZoneStatus zoneStatus;

    public TerritoryZoneStatus getZoneStatus() {
        return zoneStatus;
    }

    @Override
    public String toString() {
        return "TerritoryConflictZoneStatus{" +
                "zoneStatus=" + zoneStatus +
                '}';
    }
}
