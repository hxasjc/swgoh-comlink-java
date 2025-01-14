package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryWarPointStructure {
    private TerritoryReward deployDefensiveSquadReward;
    private TerritoryReward offensiveWinReward;
    private TerritoryReward completeZoneReward;
    private TerritoryReward completeZoneRewardPerDefensiveSquad;
    private GraduatingTerritoryReward[] defendDefeatBonus;
    private TerritoryReward emptySquadSlotBonus;
    private TerritoryReward survivingSquadUnitBonus;
    private TerritoryReward fullHealthUnitBonus;
    private TerritoryReward fullProtectionUnitBonus;
    private TerritoryReward firstAttackBonus;
    private TerritoryReward enemyDefeatedBonus;

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

    public GraduatingTerritoryReward[] getDefendDefeatBonus() {
        return defendDefeatBonus;
    }

    public TerritoryReward getEmptySquadSlotBonus() {
        return emptySquadSlotBonus;
    }

    public TerritoryReward getSurvivingSquadUnitBonus() {
        return survivingSquadUnitBonus;
    }

    public TerritoryReward getFullHealthUnitBonus() {
        return fullHealthUnitBonus;
    }

    public TerritoryReward getFullProtectionUnitBonus() {
        return fullProtectionUnitBonus;
    }

    public TerritoryReward getFirstAttackBonus() {
        return firstAttackBonus;
    }

    public TerritoryReward getEnemyDefeatedBonus() {
        return enemyDefeatedBonus;
    }

    @Override
    public String toString() {
        return "TerritoryWarPointStructure{" +
                "deployDefensiveSquadReward=" + deployDefensiveSquadReward +
                ", offensiveWinReward=" + offensiveWinReward +
                ", completeZoneReward=" + completeZoneReward +
                ", completeZoneRewardPerDefensiveSquad=" + completeZoneRewardPerDefensiveSquad +
                ", defendDefeatBonus=" + Arrays.toString(defendDefeatBonus) +
                ", emptySquadSlotBonus=" + emptySquadSlotBonus +
                ", survivingSquadUnitBonus=" + survivingSquadUnitBonus +
                ", fullHealthUnitBonus=" + fullHealthUnitBonus +
                ", fullProtectionUnitBonus=" + fullProtectionUnitBonus +
                ", firstAttackBonus=" + firstAttackBonus +
                ", enemyDefeatedBonus=" + enemyDefeatedBonus +
                '}';
    }
}
