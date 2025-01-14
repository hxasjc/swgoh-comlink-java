package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.StatModTier;

import java.util.Arrays;

@SuppressWarnings("unused")
public class StatMod {
    private String id;
    private String definitionId;
    private int level;
    private StatModTier tier;
    private CurrencyItem sellValue;
    private CurrencyItem removeCost;
    private boolean locked;
    private StatModStat primaryStat;
    private StatModStat[] secondaryStats;
    private int xp;
    private CurrencyItem levelCost;
    private int bonusQuantity;
    //recursive
    private BucketItem convertedItem;
    private int rerolledCount;

    public String getId() {
        return id;
    }

    public String getDefinitionId() {
        return definitionId;
    }

    public int getLevel() {
        return level;
    }

    public StatModTier getTier() {
        return tier;
    }

    public CurrencyItem getSellValue() {
        return sellValue;
    }

    public CurrencyItem getRemoveCost() {
        return removeCost;
    }

    public boolean isLocked() {
        return locked;
    }

    public StatModStat getPrimaryStat() {
        return primaryStat;
    }

    public StatModStat[] getSecondaryStats() {
        return secondaryStats;
    }

    public int getXp() {
        return xp;
    }

    public CurrencyItem getLevelCost() {
        return levelCost;
    }

    public int getBonusQuantity() {
        return bonusQuantity;
    }

    public BucketItem getConvertedItem() {
        return convertedItem;
    }

    public int getRerolledCount() {
        return rerolledCount;
    }

    @Override
    public String toString() {
        return "StatMod{" +
                "id='" + id + '\'' +
                ", definitionId='" + definitionId + '\'' +
                ", level=" + level +
                ", tier=" + tier +
                ", sellValue=" + sellValue +
                ", removeCost=" + removeCost +
                ", locked=" + locked +
                ", primaryStat=" + primaryStat +
                ", secondaryStats=" + Arrays.toString(secondaryStats) +
                ", xp=" + xp +
                ", levelCost=" + levelCost +
                ", bonusQuantity=" + bonusQuantity +
                ", convertedItem=" + convertedItem +
                ", rerolledCount=" + rerolledCount +
                '}';
    }
}
