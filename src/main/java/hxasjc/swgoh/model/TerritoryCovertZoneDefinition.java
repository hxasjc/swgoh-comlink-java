package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.CombatType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryCovertZoneDefinition {
    private TerritoryZoneDefinition zoneDefinition;
    private CampaignElementIdentifier campaignElementIdentifier;
    private BucketItem[] victoryReward;
    private boolean disableRewardOnMap;
    private CombatType combatType;

    public TerritoryZoneDefinition getZoneDefinition() {
        return zoneDefinition;
    }

    public CampaignElementIdentifier getCampaignElementIdentifier() {
        return campaignElementIdentifier;
    }

    public BucketItem[] getVictoryReward() {
        return victoryReward;
    }

    public boolean isDisableRewardOnMap() {
        return disableRewardOnMap;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    @Override
    public String toString() {
        return "TerritoryCovertZoneDefinition{" +
                "zoneDefinition=" + zoneDefinition +
                ", campaignElementIdentifier=" + campaignElementIdentifier +
                ", victoryReward=" + Arrays.toString(victoryReward) +
                ", disableRewardOnMap=" + disableRewardOnMap +
                ", combatType=" + combatType +
                '}';
    }
}
