package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.Rarity;
import hxasjc.swgoh.enums.RelicTier;
import hxasjc.swgoh.enums.UnitTier;

@SuppressWarnings("unused")
public class SkillTierDefinition {
    private String recipeId;
    private int requiredUnitLevel;
    private Rarity requiredUnitRarity;
    private UnitTier requiredUnitTier;
    private String powerOverrideTag;
    private RelicTier requiredUnitRelicTier;
    private boolean isZetaTier;
    private boolean isOmicronTier;

    public String getRecipeId() {
        return recipeId;
    }

    public int getRequiredUnitLevel() {
        return requiredUnitLevel;
    }

    public Rarity getRequiredUnitRarity() {
        return requiredUnitRarity;
    }

    public UnitTier getRequiredUnitTier() {
        return requiredUnitTier;
    }

    public String getPowerOverrideTag() {
        return powerOverrideTag;
    }

    public RelicTier getRequiredUnitRelicTier() {
        return requiredUnitRelicTier;
    }

    public boolean isZetaTier() {
        return isZetaTier;
    }

    public boolean isOmicronTier() {
        return isOmicronTier;
    }

    @Override
    public String toString() {
        return "SkillTierDefinition{" +
                "recipeId='" + recipeId + '\'' +
                ", requiredUnitLevel=" + requiredUnitLevel +
                ", requiredUnitRarity=" + requiredUnitRarity +
                ", requiredUnitTier=" + requiredUnitTier +
                ", powerOverrideTag='" + powerOverrideTag + '\'' +
                ", requiredUnitRelicTier=" + requiredUnitRelicTier +
                ", isZetaTier=" + isZetaTier +
                ", isOmicronTier=" + isOmicronTier +
                '}';
    }
}
