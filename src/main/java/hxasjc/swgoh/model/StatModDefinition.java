package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.Rarity;
import hxasjc.swgoh.enums.StatModSlot;

import java.util.Arrays;

@SuppressWarnings("unused")
public class StatModDefinition {
    private String id;
    private StatModSlot slot;
    private String setId;
    private Rarity rarity;
    private String nameKey;
    private String descKey;
    private LookupMission[] missionLookup;
    private LookupMission[] raidLookup;
    private LookupActionLink[] actionLinkLookup;
    private String levelTableId;
    private String promotionId;
    private String promotionRecipeId;
    private String tierUpRecipeId;
    private String overclockRecipeTableId;
    private String rerollCapTableId;
    private LookupMission[] raidImmediateLookup;

    public String getId() {
        return id;
    }

    public StatModSlot getSlot() {
        return slot;
    }

    public String getSetId() {
        return setId;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String getDescKey() {
        return descKey;
    }

    public LookupMission[] getMissionLookup() {
        return missionLookup;
    }

    public LookupMission[] getRaidLookup() {
        return raidLookup;
    }

    public LookupActionLink[] getActionLinkLookup() {
        return actionLinkLookup;
    }

    public String getLevelTableId() {
        return levelTableId;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public String getPromotionRecipeId() {
        return promotionRecipeId;
    }

    public String getTierUpRecipeId() {
        return tierUpRecipeId;
    }

    public String getOverclockRecipeTableId() {
        return overclockRecipeTableId;
    }

    public String getRerollCapTableId() {
        return rerollCapTableId;
    }

    public LookupMission[] getRaidImmediateLookup() {
        return raidImmediateLookup;
    }

    @Override
    public String toString() {
        return "StatModDefinition{" +
                "id='" + id + '\'' +
                ", slot=" + slot +
                ", setId='" + setId + '\'' +
                ", rarity=" + rarity +
                ", nameKey='" + nameKey + '\'' +
                ", descKey='" + descKey + '\'' +
                ", missionLookup=" + Arrays.toString(missionLookup) +
                ", raidLookup=" + Arrays.toString(raidLookup) +
                ", actionLinkLookup=" + Arrays.toString(actionLinkLookup) +
                ", levelTableId='" + levelTableId + '\'' +
                ", promotionId='" + promotionId + '\'' +
                ", promotionRecipeId='" + promotionRecipeId + '\'' +
                ", tierUpRecipeId='" + tierUpRecipeId + '\'' +
                ", overclockRecipeTableId='" + overclockRecipeTableId + '\'' +
                ", rerollCapTableId='" + rerollCapTableId + '\'' +
                ", raidImmediateLookup=" + Arrays.toString(raidImmediateLookup) +
                '}';
    }
}
