package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryWarGuildStatus {
    private TerritoryGuildProfile profile;
    private TerritoryWarConflictZoneStatus[] conflictStatus;
    private TerritoryReconZoneStatus[] reconStatus;

    public TerritoryGuildProfile getProfile() {
        return profile;
    }

    public TerritoryWarConflictZoneStatus[] getConflictStatus() {
        return conflictStatus;
    }

    public TerritoryReconZoneStatus[] getReconStatus() {
        return reconStatus;
    }

    @Override
    public String toString() {
        return "TerritoryWarGuildStatus{" +
                "profile=" + profile +
                ", conflictStatus=" + Arrays.toString(conflictStatus) +
                ", reconStatus=" + Arrays.toString(reconStatus) +
                '}';
    }
}
