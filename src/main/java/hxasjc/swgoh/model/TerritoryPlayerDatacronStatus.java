package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class TerritoryPlayerDatacronStatus {
    private String datacronId;
    private String deployedZoneId;

    public String getDatacronId() {
        return datacronId;
    }

    public String getDeployedZoneId() {
        return deployedZoneId;
    }

    @Override
    public String toString() {
        return "TerritoryPlayerDatacronStatus{" +
                "datacronId='" + datacronId + '\'' +
                ", deployedZoneId='" + deployedZoneId + '\'' +
                '}';
    }
}
