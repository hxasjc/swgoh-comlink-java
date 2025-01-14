package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.Rarity;
import hxasjc.swgoh.enums.RelicTier;
import hxasjc.swgoh.enums.UnitTier;

@SuppressWarnings("unused")
public class AbilityReference {
    private String abilityId;
    private UnitTier requiredTier;
    private Rarity requiredRarity;
    private int requiredSkillTier;
    private RelicTier requiredRelicTier;
    private boolean overrideAlwaysDisplayInBattleUi;
    private String overrideIcon;
    private String overrideNameKey;
    private String overrideDescKey;
    private String powerAdditiveTag;
    private String unlockRecipeId;
    private String inheritMappingId;

    public String getAbilityId() {
        return abilityId;
    }

    public UnitTier getRequiredTier() {
        return requiredTier;
    }

    public Rarity getRequiredRarity() {
        return requiredRarity;
    }

    public int getRequiredSkillTier() {
        return requiredSkillTier;
    }

    public RelicTier getRequiredRelicTier() {
        return requiredRelicTier;
    }

    public boolean isOverrideAlwaysDisplayInBattleUi() {
        return overrideAlwaysDisplayInBattleUi;
    }

    public String getOverrideIcon() {
        return overrideIcon;
    }

    public String getOverrideNameKey() {
        return overrideNameKey;
    }

    public String getOverrideDescKey() {
        return overrideDescKey;
    }

    public String getPowerAdditiveTag() {
        return powerAdditiveTag;
    }

    public String getUnlockRecipeId() {
        return unlockRecipeId;
    }

    public String getInheritMappingId() {
        return inheritMappingId;
    }

    @Override
    public String toString() {
        return "AbilityReference{" +
                "abilityId='" + abilityId + '\'' +
                ", requiredTier=" + requiredTier +
                ", requiredRarity=" + requiredRarity +
                ", requiredSkillTier=" + requiredSkillTier +
                ", requiredRelicTier=" + requiredRelicTier +
                ", overrideAlwaysDisplayInBattleUi=" + overrideAlwaysDisplayInBattleUi +
                ", overrideIcon='" + overrideIcon + '\'' +
                ", overrideNameKey='" + overrideNameKey + '\'' +
                ", overrideDescKey='" + overrideDescKey + '\'' +
                ", powerAdditiveTag='" + powerAdditiveTag + '\'' +
                ", unlockRecipeId='" + unlockRecipeId + '\'' +
                ", inheritMappingId='" + inheritMappingId + '\'' +
                '}';
    }
}
