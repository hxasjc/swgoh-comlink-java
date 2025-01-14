package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.TerritoryCovertMissionResult;

@SuppressWarnings("unused")
public class TerritoryStatCovertZoneResult {
    private String covertZoneId;
    private TerritoryCovertMissionResult result;

    public String getCovertZoneId() {
        return covertZoneId;
    }

    public TerritoryCovertMissionResult getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "TerritoryStatCovertZoneResult{" +
                "covertZoneId='" + covertZoneId + '\'' +
                ", result=" + result +
                '}';
    }
}
