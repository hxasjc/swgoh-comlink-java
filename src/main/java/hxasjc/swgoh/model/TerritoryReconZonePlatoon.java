package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryReconZonePlatoon {
    private String id;
    private TerritoryReconZoneSquad[] squad;

    public String getId() {
        return id;
    }

    public TerritoryReconZoneSquad[] getSquad() {
        return squad;
    }

    @Override
    public String toString() {
        return "TerritoryReconZonePlatoon{" +
                "id='" + id + '\'' +
                ", squad=" + Arrays.toString(squad) +
                '}';
    }
}
