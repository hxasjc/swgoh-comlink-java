package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.ItemType;
import hxasjc.swgoh.enums.Rarity;
import hxasjc.swgoh.enums.UnitTier;

@SuppressWarnings("unused")
public class BucketItem {
    private String id;
    private ItemType type;
    private int minQuantity;
    private int maxQuantity;
    private Rarity rarity;
    private StatMod statMod;
    private int previewPriority;
    private int unitLevel;
    private UnitTier unitTier;
    private boolean primaryReward;

    public String getId() {
        return id;
    }

    public ItemType getType() {
        return type;
    }

    public int getMinQuantity() {
        return minQuantity;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public StatMod getStatMod() {
        return statMod;
    }

    public int getPreviewPriority() {
        return previewPriority;
    }

    public int getUnitLevel() {
        return unitLevel;
    }

    public UnitTier getUnitTier() {
        return unitTier;
    }

    public boolean isPrimaryReward() {
        return primaryReward;
    }

    @Override
    public String toString() {
        return "BucketItem{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", minQuantity=" + minQuantity +
                ", maxQuantity=" + maxQuantity +
                ", rarity=" + rarity +
                ", statMod=" + statMod +
                ", previewPriority=" + previewPriority +
                ", unitLevel=" + unitLevel +
                ", unitTier=" + unitTier +
                ", primaryReward=" + primaryReward +
                '}';
    }
}
