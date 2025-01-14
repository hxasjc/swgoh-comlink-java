package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.CombatType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryWarConflictZoneDefinition {
    private TerritoryZoneDefinition zoneDefinition;
    private CombatType combatType;
    private String conflictImage;
    private String conflictRequirement;
    private String conflictDetail;
    private EntryCategoryAllowed entryCategoryAllowed;
    private EntryCategoryAllowed defenceEntryCategoryAllowed;
    private TerritoryReward deployDefensiveSquadReward;
    private TerritoryReward offensiveWinReward;
    private TerritoryReward completeZoneReward;
    private TerritoryReward completeZoneRewardPerDefensiveSquad;
    private Environment[] battleEnvironments;
    private TerritoryWarPointStructure pointStructure;

    public TerritoryZoneDefinition getZoneDefinition() {
        return zoneDefinition;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public String getConflictImage() {
        return conflictImage;
    }

    public String getConflictRequirement() {
        return conflictRequirement;
    }

    public String getConflictDetail() {
        return conflictDetail;
    }

    public EntryCategoryAllowed getEntryCategoryAllowed() {
        return entryCategoryAllowed;
    }

    public EntryCategoryAllowed getDefenceEntryCategoryAllowed() {
        return defenceEntryCategoryAllowed;
    }

    public TerritoryReward getDeployDefensiveSquadReward() {
        return deployDefensiveSquadReward;
    }

    public TerritoryReward getOffensiveWinReward() {
        return offensiveWinReward;
    }

    public TerritoryReward getCompleteZoneReward() {
        return completeZoneReward;
    }

    public TerritoryReward getCompleteZoneRewardPerDefensiveSquad() {
        return completeZoneRewardPerDefensiveSquad;
    }

    public Environment[] getBattleEnvironments() {
        return battleEnvironments;
    }

    public TerritoryWarPointStructure getPointStructure() {
        return pointStructure;
    }

    @Override
    public String toString() {
        return "TerritoryWarConflictZoneDefiniton{" +
                "zoneDefinition=" + zoneDefinition +
                ", combatType=" + combatType +
                ", conflictImage='" + conflictImage + '\'' +
                ", conflictRequirement='" + conflictRequirement + '\'' +
                ", conflictDetail='" + conflictDetail + '\'' +
                ", entryCategoryAllowed=" + entryCategoryAllowed +
                ", defenceEntryCategoryAllowed=" + defenceEntryCategoryAllowed +
                ", deployDefensiveSquadReward=" + deployDefensiveSquadReward +
                ", offensiveWinReward=" + offensiveWinReward +
                ", completeZoneReward=" + completeZoneReward +
                ", completeZoneRewardPerDefensiveSquad=" + completeZoneRewardPerDefensiveSquad +
                ", battleEnvironments=" + Arrays.toString(battleEnvironments) +
                ", pointStructure=" + pointStructure +
                '}';
    }
}
