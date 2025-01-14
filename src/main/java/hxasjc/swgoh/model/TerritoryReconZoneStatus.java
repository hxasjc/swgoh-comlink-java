package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryReconZoneStatus {
    private TerritoryZoneStatus zoneStatus;
    private TerritoryReconZonePlatoon[] platoon;

    public TerritoryZoneStatus getZoneStatus() {
        return zoneStatus;
    }

    public TerritoryReconZonePlatoon[] getPlatoon() {
        return platoon;
    }

    @Override
    public String toString() {
        return "TerritoryReconZoneStatus{" +
                "zoneStatus=" + zoneStatus +
                ", platoon=" + Arrays.toString(platoon) +
                '}';
    }
}
