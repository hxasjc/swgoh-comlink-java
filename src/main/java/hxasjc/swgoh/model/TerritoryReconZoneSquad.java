package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryReconZoneSquad {
    private String id;
    private TerritoryReconZoneUnit[] unit;

    public String getId() {
        return id;
    }

    public TerritoryReconZoneUnit[] getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return "TerritoryReconZoneSquad{" +
                "id='" + id + '\'' +
                ", unit=" + Arrays.toString(unit) +
                '}';
    }
}
