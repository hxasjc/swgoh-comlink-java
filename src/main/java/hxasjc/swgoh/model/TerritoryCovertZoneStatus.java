package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class TerritoryCovertZoneStatus {
    private TerritoryZoneStatus zoneStatus;
    private int playersParticipated;
    private int successfulAttempts;

    public TerritoryZoneStatus getZoneStatus() {
        return zoneStatus;
    }

    public int getPlayersParticipated() {
        return playersParticipated;
    }

    public int getSuccessfulAttempts() {
        return successfulAttempts;
    }

    @Override
    public String toString() {
        return "TerritoryCovertZoneStatus{" +
                "zoneStatus=" + zoneStatus +
                ", playersParticipated=" + playersParticipated +
                ", successfulAttempts=" + successfulAttempts +
                '}';
    }
}
