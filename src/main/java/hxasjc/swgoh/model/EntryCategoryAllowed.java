package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.CategoryMatchType;
import hxasjc.swgoh.enums.Rarity;
import hxasjc.swgoh.enums.RelicTier;
import hxasjc.swgoh.enums.UnitTier;

import java.util.Arrays;

@SuppressWarnings("unused")
public class EntryCategoryAllowed {
    private String[] categoryId;
    private int maximumAllowedUnitQuantity;
    private CategoryMatchType matchType;
    private int minimumRequiredUnitQuantity;
    private Rarity minimumUnitRarity;
    private int minimumOwnedUnitQuantity;
    private int minimumUnitLevel;
    private UnitTier minimumUnitTier;
    private int maximumReinforcement;
    private String[] commanderCategoryId;
    private int minimumReinforcement;
    private int minimumGalacticPower;
    private MandatoryRosterUnit[] mandatoryRosterUnit;
    private String[] excludeCategoryId;
    private RelicTier minimumRelicTier;
    private Rarity minimumModRarity;
    private int minimumAbilityLevelAvg;
    private int minimumAbilityLevelAll;
    private int legendLimit;
    private int unitGuideMinimumRequiredUnitQuantity;
    private int bigUnitLimit;

    public String[] getCategoryId() {
        return categoryId;
    }

    public int getMaximumAllowedUnitQuantity() {
        return maximumAllowedUnitQuantity;
    }

    public CategoryMatchType getMatchType() {
        return matchType;
    }

    public int getMinimumRequiredUnitQuantity() {
        return minimumRequiredUnitQuantity;
    }

    public Rarity getMinimumUnitRarity() {
        return minimumUnitRarity;
    }

    public int getMinimumOwnedUnitQuantity() {
        return minimumOwnedUnitQuantity;
    }

    public int getMinimumUnitLevel() {
        return minimumUnitLevel;
    }

    public UnitTier getMinimumUnitTier() {
        return minimumUnitTier;
    }

    public int getMaximumReinforcement() {
        return maximumReinforcement;
    }

    public String[] getCommanderCategoryId() {
        return commanderCategoryId;
    }

    public int getMinimumReinforcement() {
        return minimumReinforcement;
    }

    public int getMinimumGalacticPower() {
        return minimumGalacticPower;
    }

    public MandatoryRosterUnit[] getMandatoryRosterUnit() {
        return mandatoryRosterUnit;
    }

    public String[] getExcludeCategoryId() {
        return excludeCategoryId;
    }

    public RelicTier getMinimumRelicTier() {
        return minimumRelicTier;
    }

    public Rarity getMinimumModRarity() {
        return minimumModRarity;
    }

    public int getMinimumAbilityLevelAvg() {
        return minimumAbilityLevelAvg;
    }

    public int getMinimumAbilityLevelAll() {
        return minimumAbilityLevelAll;
    }

    public int getLegendLimit() {
        return legendLimit;
    }

    public int getUnitGuideMinimumRequiredUnitQuantity() {
        return unitGuideMinimumRequiredUnitQuantity;
    }

    public int getBigUnitLimit() {
        return bigUnitLimit;
    }

    @Override
    public String toString() {
        return "EntryCategoryAllowed{" +
                "categoryId=" + Arrays.toString(categoryId) +
                ", maximumAllowedUnitQuantity=" + maximumAllowedUnitQuantity +
                ", matchType=" + matchType +
                ", minimumRequiredUnitQuantity=" + minimumRequiredUnitQuantity +
                ", minimumUnitRarity=" + minimumUnitRarity +
                ", minimumOwnedUnitQuantity=" + minimumOwnedUnitQuantity +
                ", minimumUnitLevel=" + minimumUnitLevel +
                ", minimumUnitTier=" + minimumUnitTier +
                ", maximumReinforcement=" + maximumReinforcement +
                ", commanderCategoryId=" + Arrays.toString(commanderCategoryId) +
                ", minimumReinforcement=" + minimumReinforcement +
                ", minimumGalacticPower=" + minimumGalacticPower +
                ", mandatoryRosterUnit=" + Arrays.toString(mandatoryRosterUnit) +
                ", excludeCategoryId=" + Arrays.toString(excludeCategoryId) +
                ", minimumRelicTier=" + minimumRelicTier +
                ", minimumModRarity=" + minimumModRarity +
                ", minimumAbilityLevelAvg=" + minimumAbilityLevelAvg +
                ", minimumAbilityLevelAll=" + minimumAbilityLevelAll +
                ", legendLimit=" + legendLimit +
                ", unitGuideMinimumRequiredUnitQuantity=" + unitGuideMinimumRequiredUnitQuantity +
                ", bigUnitLimit=" + bigUnitLimit +
                '}';
    }
}
