package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class TerritoryPlayerUnitStatus {
    private String unitId;
    private String deployedUnitId;

    public String getUnitId() {
        return unitId;
    }

    public String getDeployedUnitId() {
        return deployedUnitId;
    }

    @Override
    public String toString() {
        return "TerritoryPlayerUnitStatus{" +
                "unitId='" + unitId + '\'' +
                ", deployedUnitId='" + deployedUnitId + '\'' +
                '}';
    }
}
