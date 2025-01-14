package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.CombatType;
import hxasjc.swgoh.enums.Rarity;
import hxasjc.swgoh.enums.RelicTier;
import hxasjc.swgoh.enums.TerritoryBattleZoneUnitType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryReconZoneDefinition {
    private TerritoryZoneDefinition zoneDefinition;
    private TerritoryReconPlatoonDefinition[] platoonDefinition;
    private String abilityImage;
    private String abilityShortDescKey;
    private String abilityLongDescKey;
    private String goalDescKey;
    private String goalImage;
    private Rarity unitRarity;
    private String rewardDescKey;
    private String subTitleKey;
    private MissionGrantedAbility[] grantedAbilities;
    private MissionGrantedAbility[] strategicAbilities;
    private CombatType combatType;
    private TerritoryBattleZoneUnitType territoryBattleZoneUnitType;
    private RelicTier unitRelicTier;

    public TerritoryZoneDefinition getZoneDefinition() {
        return zoneDefinition;
    }

    public TerritoryReconPlatoonDefinition[] getPlatoonDefinition() {
        return platoonDefinition;
    }

    public String getAbilityImage() {
        return abilityImage;
    }

    public String getAbilityShortDescKey() {
        return abilityShortDescKey;
    }

    public String getAbilityLongDescKey() {
        return abilityLongDescKey;
    }

    public String getGoalDescKey() {
        return goalDescKey;
    }

    public String getGoalImage() {
        return goalImage;
    }

    public Rarity getUnitRarity() {
        return unitRarity;
    }

    public String getRewardDescKey() {
        return rewardDescKey;
    }

    public String getSubTitleKey() {
        return subTitleKey;
    }

    public MissionGrantedAbility[] getGrantedAbilities() {
        return grantedAbilities;
    }

    public MissionGrantedAbility[] getStrategicAbilities() {
        return strategicAbilities;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public TerritoryBattleZoneUnitType getTerritoryBattleZoneUnitType() {
        return territoryBattleZoneUnitType;
    }

    public RelicTier getUnitRelicTier() {
        return unitRelicTier;
    }

    @Override
    public String toString() {
        return "TerritoryReconZoneDefinition{" +
                "zoneDefinition=" + zoneDefinition +
                ", platoonDefinition=" + Arrays.toString(platoonDefinition) +
                ", abilityImage='" + abilityImage + '\'' +
                ", abilityShortDescKey='" + abilityShortDescKey + '\'' +
                ", abilityLongDescKey='" + abilityLongDescKey + '\'' +
                ", goalDescKey='" + goalDescKey + '\'' +
                ", goalImage='" + goalImage + '\'' +
                ", unitRarity=" + unitRarity +
                ", rewardDescKey='" + rewardDescKey + '\'' +
                ", subTitleKey='" + subTitleKey + '\'' +
                ", grantedAbilities=" + Arrays.toString(grantedAbilities) +
                ", strategicAbilities=" + Arrays.toString(strategicAbilities) +
                ", combatType=" + combatType +
                ", territoryBattleZoneUnitType=" + territoryBattleZoneUnitType +
                ", unitRelicTier=" + unitRelicTier +
                '}';
    }
}
