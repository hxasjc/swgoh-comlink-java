package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class TerritoryStrikeZoneStatus {
    private int playersParticipated;
    private TerritoryZoneStatus zoneStatus;

    public int getPlayersParticipated() {
        return playersParticipated;
    }

    public TerritoryZoneStatus getZoneStatus() {
        return zoneStatus;
    }

    @Override
    public String toString() {
        return "TerritoryStrikeZoneStatus{" +
                "playersParticipated=" + playersParticipated +
                ", zoneStatus=" + zoneStatus +
                '}';
    }
}
