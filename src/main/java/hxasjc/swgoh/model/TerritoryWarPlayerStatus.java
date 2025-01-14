package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryWarPlayerStatus {
    private TerritoryPlayerUnitStatus[] unitStatus;
    private UnitBattleStat[] warRoster;
    private DatacronBattleStat[] datacronRoster;
    private TerritoryPlayerDatacronStatus[] datacronStatus;

    public TerritoryPlayerUnitStatus[] getUnitStatus() {
        return unitStatus;
    }

    public UnitBattleStat[] getWarRoster() {
        return warRoster;
    }

    public DatacronBattleStat[] getDatacronRoster() {
        return datacronRoster;
    }

    public TerritoryPlayerDatacronStatus[] getDatacronStatus() {
        return datacronStatus;
    }

    @Override
    public String toString() {
        return "TerritoryWarPlayerStatus{" +
                "unitStatus=" + Arrays.toString(unitStatus) +
                ", warRoster=" + Arrays.toString(warRoster) +
                ", datacronRoster=" + Arrays.toString(datacronRoster) +
                ", datacronStatus=" + Arrays.toString(datacronStatus) +
                '}';
    }
}
