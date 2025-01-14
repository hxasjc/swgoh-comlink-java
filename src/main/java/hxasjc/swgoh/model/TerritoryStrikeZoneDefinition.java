package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.CombatType;

@SuppressWarnings("unused")
public class TerritoryStrikeZoneDefinition {
    private CampaignElementIdentifier campaignElementIdentifier;
    private TerritoryZoneDefinition zoneDefinition;
    private String encounterRewardTableId;
    private CombatType combatType;

    public CampaignElementIdentifier getCampaignElementIdentifier() {
        return campaignElementIdentifier;
    }

    public TerritoryZoneDefinition getZoneDefinition() {
        return zoneDefinition;
    }

    public String getEncounterRewardTableId() {
        return encounterRewardTableId;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    @Override
    public String toString() {
        return "TerritoryStrikeZoneDefinition{" +
                "campaignElementIdentifier=" + campaignElementIdentifier +
                ", zoneDefinition=" + zoneDefinition +
                ", encounterRewardTableId='" + encounterRewardTableId + '\'' +
                ", combatType=" + combatType +
                '}';
    }
}
