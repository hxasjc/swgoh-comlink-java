package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.CombatType;
import hxasjc.swgoh.enums.ForceAlignment;
import hxasjc.swgoh.enums.TerritoryBattleZoneUnitType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryBattleConflictZoneDefinition {
    private CombatType combatType;
    private TerritoryRewardBracket[] victoryPointRewards;
    private TerritoryZoneDefinition zoneDefinition;
    private String conflictImage;
    private TerritoryBattleZoneUnitType territoryBattleZoneUnitType;
    private boolean alternateChaseIcon;
    private ForceAlignment forceAlignment;
    private boolean isBonus;
    private boolean isNewestBonusZone;
    private boolean flipChaseIconX;
    private boolean flipChaseIconY;

    public CombatType getCombatType() {
        return combatType;
    }

    public TerritoryRewardBracket[] getVictoryPointRewards() {
        return victoryPointRewards;
    }

    public TerritoryZoneDefinition getZoneDefinition() {
        return zoneDefinition;
    }

    public String getConflictImage() {
        return conflictImage;
    }

    public TerritoryBattleZoneUnitType getTerritoryBattleZoneUnitType() {
        return territoryBattleZoneUnitType;
    }

    public boolean isAlternateChaseIcon() {
        return alternateChaseIcon;
    }

    public ForceAlignment getForceAlignment() {
        return forceAlignment;
    }

    public boolean isBonus() {
        return isBonus;
    }

    public boolean isNewestBonusZone() {
        return isNewestBonusZone;
    }

    public boolean isFlipChaseIconX() {
        return flipChaseIconX;
    }

    public boolean isFlipChaseIconY() {
        return flipChaseIconY;
    }

    @Override
    public String toString() {
        return "TerritoryBattleConflictZoneDefinition{" +
                "combatType=" + combatType +
                ", victoryPointRewards=" + Arrays.toString(victoryPointRewards) +
                ", zoneDefinition=" + zoneDefinition +
                ", conflictImage='" + conflictImage + '\'' +
                ", territoryBattleZoneUnitType=" + territoryBattleZoneUnitType +
                ", alternateChaseIcon=" + alternateChaseIcon +
                ", forceAlignment=" + forceAlignment +
                ", isBonus=" + isBonus +
                ", isNewestBonusZone=" + isNewestBonusZone +
                ", flipChaseIconX=" + flipChaseIconX +
                ", flipChaseIconY=" + flipChaseIconY +
                '}';
    }
}
