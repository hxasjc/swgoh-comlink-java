package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.EquipmentType;
import hxasjc.swgoh.enums.Rarity;
import hxasjc.swgoh.enums.UnitTier;

import java.util.Arrays;

@SuppressWarnings("unused")
public class EquipmentDef {
    private String id;
    private String nameKey;
    private String iconKey;
    private int requiredLevel;
    private StatDef equipmentStat;
    private String recipeId;
    private UnitTier tier;
    private CurrencyItem sellValue;
    private LookupMission[] lookupMission;
    private String mark;
    private long obtainableTime;
    private LookupMission[] raidLookup;
    private EquipmentType type;
    private LookupActionLink[] actionLinkLookup;
    private Rarity requiredRarity;
    private boolean findFlowDisabled;
    private LookupMission[] raidImmediateLookup;

    public String getId() {
        return id;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String getIconKey() {
        return iconKey;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public StatDef getEquipmentStat() {
        return equipmentStat;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public UnitTier getTier() {
        return tier;
    }

    public CurrencyItem getSellValue() {
        return sellValue;
    }

    public LookupMission[] getLookupMission() {
        return lookupMission;
    }

    public String getMark() {
        return mark;
    }

    public long getObtainableTime() {
        return obtainableTime;
    }

    public LookupMission[] getRaidLookup() {
        return raidLookup;
    }

    public EquipmentType getType() {
        return type;
    }

    public LookupActionLink[] getActionLinkLookup() {
        return actionLinkLookup;
    }

    public Rarity getRequiredRarity() {
        return requiredRarity;
    }

    public boolean isFindFlowDisabled() {
        return findFlowDisabled;
    }

    public LookupMission[] getRaidImmediateLookup() {
        return raidImmediateLookup;
    }

    @Override
    public String toString() {
        return "EquipmentDef{" +
                "id='" + id + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", iconKey='" + iconKey + '\'' +
                ", requiredLevel=" + requiredLevel +
                ", equipmentStat=" + equipmentStat +
                ", recipeId='" + recipeId + '\'' +
                ", tier=" + tier +
                ", sellValue=" + sellValue +
                ", lookupMission=" + Arrays.toString(lookupMission) +
                ", mark='" + mark + '\'' +
                ", obtainableTime=" + obtainableTime +
                ", raidLookup=" + Arrays.toString(raidLookup) +
                ", type=" + type +
                ", actionLinkLookup=" + Arrays.toString(actionLinkLookup) +
                ", requiredRarity=" + requiredRarity +
                ", findFlowDisabled=" + findFlowDisabled +
                ", raidImmediateLookup=" + Arrays.toString(raidImmediateLookup) +
                '}';
    }
}
