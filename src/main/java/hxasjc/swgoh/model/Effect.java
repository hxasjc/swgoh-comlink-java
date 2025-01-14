package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.*;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Effect {
    private String id;
    private EffectType type;
    private String[] param;
    private int chance;
    private EffectTarget[] target;
    private EffectTag[] descriptiveTag;
    private EffectTag[] effectedTag;
    private BattleCondition[] triggerCondition;
    private Effect[] effectDefinition;
    private int[] contextIndex;
    private BattleCondition[] expirationCondition;
    private EffectApplyType applyType;
    private EffectDamageType damageType;
    private String persistentIcon;
    private String triggeredVfx;
    private String triggeredLocKey;
    private int maxBonusMoves;
    private EffectReference[] effectReference;
    private int multiplierAmountDecimal;
    private int contextMultiplierDecimal;
    private long additiveAmountDecimal;
    private int resultVarianceDecimal;
    private String persistentLocKey;
    private String stackingLineOverride;
    private String persistentIconOverlay;
    private int persistentIconPriority;
    private String iconColor;
    private boolean persistentIconGroupable;
    private PersistentVfsReference persistentVfsReference;
    private String blackboardName;
    private String summonId;
    private Effect[] summonEffect;
    private int summonLevel;
    private UnitTier summonTier;
    private Rarity summonRarity;
    private int summonSquadIncrease;
    private boolean ignoreDamageAnimation;
    private String[] infiniteCycleEffect;
    private String blackboardCompareName;
    private int summonMarkerIndex;
    private boolean summonEnableInitialVfx;
    private int summonCount;

    public String getId() {
        return id;
    }

    public EffectType getType() {
        return type;
    }

    public String[] getParam() {
        return param;
    }

    public int getChance() {
        return chance;
    }

    public EffectTarget[] getTarget() {
        return target;
    }

    public EffectTag[] getDescriptiveTag() {
        return descriptiveTag;
    }

    public EffectTag[] getEffectedTag() {
        return effectedTag;
    }

    public BattleCondition[] getTriggerCondition() {
        return triggerCondition;
    }

    public Effect[] getEffectDefinition() {
        return effectDefinition;
    }

    public int[] getContextIndex() {
        return contextIndex;
    }

    public BattleCondition[] getExpirationCondition() {
        return expirationCondition;
    }

    public EffectApplyType getApplyType() {
        return applyType;
    }

    public EffectDamageType getDamageType() {
        return damageType;
    }

    public String getPersistentIcon() {
        return persistentIcon;
    }

    public String getTriggeredVfx() {
        return triggeredVfx;
    }

    public String getTriggeredLocKey() {
        return triggeredLocKey;
    }

    public int getMaxBonusMoves() {
        return maxBonusMoves;
    }

    public EffectReference[] getEffectReference() {
        return effectReference;
    }

    public int getMultiplierAmountDecimal() {
        return multiplierAmountDecimal;
    }

    public int getContextMultiplierDecimal() {
        return contextMultiplierDecimal;
    }

    public long getAdditiveAmountDecimal() {
        return additiveAmountDecimal;
    }

    public int getResultVarianceDecimal() {
        return resultVarianceDecimal;
    }

    public String getPersistentLocKey() {
        return persistentLocKey;
    }

    public String getStackingLineOverride() {
        return stackingLineOverride;
    }

    public String getPersistentIconOverlay() {
        return persistentIconOverlay;
    }

    public int getPersistentIconPriority() {
        return persistentIconPriority;
    }

    public String getIconColor() {
        return iconColor;
    }

    public boolean isPersistentIconGroupable() {
        return persistentIconGroupable;
    }

    public PersistentVfsReference getPersistentVfsReference() {
        return persistentVfsReference;
    }

    public String getBlackboardName() {
        return blackboardName;
    }

    public String getSummonId() {
        return summonId;
    }

    public Effect[] getSummonEffect() {
        return summonEffect;
    }

    public int getSummonLevel() {
        return summonLevel;
    }

    public UnitTier getSummonTier() {
        return summonTier;
    }

    public Rarity getSummonRarity() {
        return summonRarity;
    }

    public int getSummonSquadIncrease() {
        return summonSquadIncrease;
    }

    public boolean isIgnoreDamageAnimation() {
        return ignoreDamageAnimation;
    }

    public String[] getInfiniteCycleEffect() {
        return infiniteCycleEffect;
    }

    public String getBlackboardCompareName() {
        return blackboardCompareName;
    }

    public int getSummonMarkerIndex() {
        return summonMarkerIndex;
    }

    public boolean isSummonEnableInitialVfx() {
        return summonEnableInitialVfx;
    }

    public int getSummonCount() {
        return summonCount;
    }

    @Override
    public String toString() {
        return "Effect{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", param=" + Arrays.toString(param) +
                ", chance=" + chance +
                ", target=" + Arrays.toString(target) +
                ", descriptiveTag=" + Arrays.toString(descriptiveTag) +
                ", effectedTag=" + Arrays.toString(effectedTag) +
                ", triggerCondition=" + Arrays.toString(triggerCondition) +
                ", effectDefinition=" + Arrays.toString(effectDefinition) +
                ", contextIndex=" + Arrays.toString(contextIndex) +
                ", expirationCondition=" + Arrays.toString(expirationCondition) +
                ", applyType=" + applyType +
                ", damageType=" + damageType +
                ", persistentIcon='" + persistentIcon + '\'' +
                ", triggeredVfx='" + triggeredVfx + '\'' +
                ", triggeredLocKey='" + triggeredLocKey + '\'' +
                ", maxBonusMoves=" + maxBonusMoves +
                ", effectReference=" + Arrays.toString(effectReference) +
                ", multiplierAmountDecimal=" + multiplierAmountDecimal +
                ", contextMultiplierDecimal=" + contextMultiplierDecimal +
                ", additiveAmountDecimal=" + additiveAmountDecimal +
                ", resultVarianceDecimal=" + resultVarianceDecimal +
                ", persistentLocKey='" + persistentLocKey + '\'' +
                ", stackingLineOverride='" + stackingLineOverride + '\'' +
                ", persistentIconOverlay='" + persistentIconOverlay + '\'' +
                ", persistentIconPriority=" + persistentIconPriority +
                ", iconColor='" + iconColor + '\'' +
                ", persistentIconGroupable=" + persistentIconGroupable +
                ", persistentVfsReference=" + persistentVfsReference +
                ", blackboardName='" + blackboardName + '\'' +
                ", summonId='" + summonId + '\'' +
                ", summonEffect=" + Arrays.toString(summonEffect) +
                ", summonLevel=" + summonLevel +
                ", summonTier=" + summonTier +
                ", summonRarity=" + summonRarity +
                ", summonSquadIncrease=" + summonSquadIncrease +
                ", ignoreDamageAnimation=" + ignoreDamageAnimation +
                ", infiniteCycleEffect=" + Arrays.toString(infiniteCycleEffect) +
                ", blackboardCompareName='" + blackboardCompareName + '\'' +
                ", summonMarkerIndex=" + summonMarkerIndex +
                ", summonEnableInitialVfx=" + summonEnableInitialVfx +
                ", summonCount=" + summonCount +
                '}';
    }
}
