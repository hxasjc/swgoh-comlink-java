package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.Rarity;
import hxasjc.swgoh.enums.StatModSlot;
import hxasjc.swgoh.enums.StatModTier;

import java.util.Arrays;

@SuppressWarnings("unused")
public class MysteryStatModDefinition {
    private String id;
    private StatModSlot slotOld;
    private String setId;
    private Rarity minRarity;
    private String maxRarity;
    private StatModTier minTier;
    private StatModTier maxTier;
    private StatModSlot[] slot;
    private String descKey;

    public String getId() {
        return id;
    }

    public StatModSlot getSlotOld() {
        return slotOld;
    }

    public String getSetId() {
        return setId;
    }

    public Rarity getMinRarity() {
        return minRarity;
    }

    public String getMaxRarity() {
        return maxRarity;
    }

    public StatModTier getMinTier() {
        return minTier;
    }

    public StatModTier getMaxTier() {
        return maxTier;
    }

    public StatModSlot[] getSlot() {
        return slot;
    }

    public String getDescKey() {
        return descKey;
    }

    @Override
    public String toString() {
        return "MysteryStatModDefinition{" +
                "id='" + id + '\'' +
                ", slotOld=" + slotOld +
                ", setId='" + setId + '\'' +
                ", minRarity=" + minRarity +
                ", maxRarity='" + maxRarity + '\'' +
                ", minTier=" + minTier +
                ", maxTier=" + maxTier +
                ", slot=" + Arrays.toString(slot) +
                ", descKey='" + descKey + '\'' +
                '}';
    }
}
