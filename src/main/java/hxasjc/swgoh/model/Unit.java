package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.Rarity;
import hxasjc.swgoh.enums.UnitTier;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Unit {
    private String id;
    private String definitionId;
    private Rarity currentRarity;
    private int currentLevel;
    private int currentXp;
    private String promotionRecipeReference;
    private Skill[] skill;
    private StatDef unitStat;
    private EquipmentSlot[] equipment;
    private UnitTier currentTier;
    private String[] equippedStatModOld;
    private StatMod[] equippedStatMod;
    private Relic relic;
    private String[] purchasedAbilityId;

    public String getId() {
        return id;
    }

    public String getDefinitionId() {
        return definitionId;
    }

    public Rarity getCurrentRarity() {
        return currentRarity;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public int getCurrentXp() {
        return currentXp;
    }

    public String getPromotionRecipeReference() {
        return promotionRecipeReference;
    }

    public Skill[] getSkill() {
        return skill;
    }

    public StatDef getUnitStat() {
        return unitStat;
    }

    public EquipmentSlot[] getEquipment() {
        return equipment;
    }

    public UnitTier getCurrentTier() {
        return currentTier;
    }

    public String[] getEquippedStatModOld() {
        return equippedStatModOld;
    }

    public StatMod[] getEquippedStatMod() {
        return equippedStatMod;
    }

    public Relic getRelic() {
        return relic;
    }

    public String[] getPurchasedAbilityId() {
        return purchasedAbilityId;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "id='" + id + '\'' +
                ", definitionId='" + definitionId + '\'' +
                ", currentRarity=" + currentRarity +
                ", currentLevel=" + currentLevel +
                ", currentXp=" + currentXp +
                ", promotionRecipeReference='" + promotionRecipeReference + '\'' +
                ", skill=" + Arrays.toString(skill) +
                ", unitStat=" + unitStat +
                ", equipment=" + Arrays.toString(equipment) +
                ", currentTier=" + currentTier +
                ", equippedStatModOld=" + Arrays.toString(equippedStatModOld) +
                ", equippedStatMod=" + Arrays.toString(equippedStatMod) +
                ", relic=" + relic +
                ", purchasedAbilityId=" + Arrays.toString(purchasedAbilityId) +
                '}';
    }
}
