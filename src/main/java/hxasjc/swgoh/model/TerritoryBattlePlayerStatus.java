package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryBattlePlayerStatus {
    private TerritoryPlayerZoneStatus[] zoneStatus;
    private TerritoryPlayerUnitStatus[] unitStatus;

    public TerritoryPlayerZoneStatus[] getZoneStatus() {
        return zoneStatus;
    }

    public TerritoryPlayerUnitStatus[] getUnitStatus() {
        return unitStatus;
    }

    @Override
    public String toString() {
        return "TerritoryBattlePlayerStatus{" +
                "zoneStatus=" + Arrays.toString(zoneStatus) +
                ", unitStatus=" + Arrays.toString(unitStatus) +
                '}';
    }
}
