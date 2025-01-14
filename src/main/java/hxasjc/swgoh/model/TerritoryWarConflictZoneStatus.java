package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryWarConflictZoneStatus {
    private TerritoryZoneStatus zoneStatus;
    private int squadCapacity;
    private TerritoryWarSquad[] warSquad;
    private int squadCount;
    private int defeatedSquadCount;

    public TerritoryZoneStatus getZoneStatus() {
        return zoneStatus;
    }

    public int getSquadCapacity() {
        return squadCapacity;
    }

    public TerritoryWarSquad[] getWarSquad() {
        return warSquad;
    }

    public int getSquadCount() {
        return squadCount;
    }

    public int getDefeatedSquadCount() {
        return defeatedSquadCount;
    }

    @Override
    public String toString() {
        return "TerritoryWarConflictZoneStatus{" +
                "zoneStatus=" + zoneStatus +
                ", squadCapacity=" + squadCapacity +
                ", warSquad=" + Arrays.toString(warSquad) +
                ", squadCount=" + squadCount +
                ", defeatedSquadCount=" + defeatedSquadCount +
                '}';
    }
}
