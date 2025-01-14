package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.MaterialType;
import hxasjc.swgoh.enums.Rarity;
import hxasjc.swgoh.enums.UnitTier;

import java.util.Arrays;

@SuppressWarnings("unused")
public class CraftingMaterialDef {
    private String id;
    private String nameKey;
    private String descKey;
    private String iconKey;
    private CurrencyItem sellValue;
    private LookupMission[] lookupMission;
    private int xpValue;
    private MaterialType type;
    private Rarity rarity;
    private int trainingCost;
    private int trainingCostMaxLevel;
    private String unitDefReference;
    private UnitTier tier;
    private long obtainableTime;
    private LookupMission[] raidLookup;
    private LookupActionLink[] actionLinkLookup;
    private String recipeId;
    private LookupMission[] raidImmediateLookup;

    public String getId() {
        return id;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String getDescKey() {
        return descKey;
    }

    public String getIconKey() {
        return iconKey;
    }

    public CurrencyItem getSellValue() {
        return sellValue;
    }

    public LookupMission[] getLookupMission() {
        return lookupMission;
    }

    public int getXpValue() {
        return xpValue;
    }

    public MaterialType getType() {
        return type;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public int getTrainingCost() {
        return trainingCost;
    }

    public int getTrainingCostMaxLevel() {
        return trainingCostMaxLevel;
    }

    public String getUnitDefReference() {
        return unitDefReference;
    }

    public UnitTier getTier() {
        return tier;
    }

    public long getObtainableTime() {
        return obtainableTime;
    }

    public LookupMission[] getRaidLookup() {
        return raidLookup;
    }

    public LookupActionLink[] getActionLinkLookup() {
        return actionLinkLookup;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public LookupMission[] getRaidImmediateLookup() {
        return raidImmediateLookup;
    }

    @Override
    public String toString() {
        return "CraftingMaterialDef{" +
                "id='" + id + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", descKey='" + descKey + '\'' +
                ", iconKey='" + iconKey + '\'' +
                ", sellValue=" + sellValue +
                ", lookupMission=" + Arrays.toString(lookupMission) +
                ", xpValue=" + xpValue +
                ", type=" + type +
                ", rarity=" + rarity +
                ", trainingCost=" + trainingCost +
                ", trainingCostMaxLevel=" + trainingCostMaxLevel +
                ", unitDefReference='" + unitDefReference + '\'' +
                ", tier=" + tier +
                ", obtainableTime=" + obtainableTime +
                ", raidLookup=" + Arrays.toString(raidLookup) +
                ", actionLinkLookup=" + Arrays.toString(actionLinkLookup) +
                ", recipeId='" + recipeId + '\'' +
                ", raidImmediateLookup=" + Arrays.toString(raidImmediateLookup) +
                '}';
    }
}
