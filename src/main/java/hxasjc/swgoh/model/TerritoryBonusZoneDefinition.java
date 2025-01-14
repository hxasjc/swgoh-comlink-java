package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class TerritoryBonusZoneDefinition {
    private TerritoryZoneDefinition zoneDefinition;
    private String linkedBonusConflictId;

    public TerritoryZoneDefinition getZoneDefinition() {
        return zoneDefinition;
    }

    public String getLinkedBonusConflictId() {
        return linkedBonusConflictId;
    }

    @Override
    public String toString() {
        return "TerritoryBonusZoneDefinition{" +
                "zoneDefinition=" + zoneDefinition +
                ", linkedBonusConflictId='" + linkedBonusConflictId + '\'' +
                '}';
    }
}
