package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.CombatType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryTournamentConflictZoneDefinition {
    private CombatType combatType;
    private TerritoryRewardBracket[] victoryPointRewards;
    private TerritoryZoneDefinition zoneDefinition;

    public CombatType getCombatType() {
        return combatType;
    }

    public TerritoryRewardBracket[] getVictoryPointRewards() {
        return victoryPointRewards;
    }

    public TerritoryZoneDefinition getZoneDefinition() {
        return zoneDefinition;
    }

    @Override
    public String toString() {
        return "TerritoryTournamentConflictZoneDefinition{" +
                "combatType=" + combatType +
                ", victoryPointRewards=" + Arrays.toString(victoryPointRewards) +
                ", zoneDefinition=" + zoneDefinition +
                '}';
    }
}
