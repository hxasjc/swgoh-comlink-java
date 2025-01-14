package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.*;

import java.util.Arrays;

@SuppressWarnings("unused")
public class UnitDef {
    private String id;
    private String unitPrefab;
    private String thumbnailName;
    private String nameKey;
    private Rarity rarity;
    private Rarity maxRarity;
    private ForceAlignment forceAlignment;
    private String xpTableId;
    private int actionCountMin;
    private int actionCountMax;
    private CombatType combatType;
    private String descKey;
    private ThreatLevel threatLevel;
    private boolean obtainable;
    private String baseId;
    private String promotionRecipeReference;
    private String statProgressionId;
    private String[] categoryId;
    private int trainingXpWorthBaseValueOverride;
    private int maxLevelOverride;
    private int trainingCostMultiplierOverride;
    private String creationRecipeReference;
    private SkillDefinitionReference[] skillReference;
    private int basePower;
    private StatDef baseStat;
    private String primaryStat;
    private UnitTierDef[] unitTier;
    private Ability basicAttack;
    private Ability leaderAbility;
    private Ability[] limitBreak;
    private Ability[] uniqueAbility;
    private AbilityReference basicAttackRef;
    private AbilityReference leaderAbilityRef;
    private AbilityReference[] limitBreakRef;
    private AbilityReference[] uniqueAbilityRef;
    private UnitStat primaryUnitStat;
    private long obtainableTime;
    private CrewMember[] crew;
    private int commandCost;
    private String crewContributionTableId;
    private UnitClass unitClass;
    private String battlePortraitPrefab;
    private String battlePortraitNameKey;
    private UnitModRecommendations[] modRecommendation;
    private String[] effectIconPriorityOverride;
    private SummonStatTable[] summonStatTable;
    private RelicDefinition relicDefinition;
    private String capitalUnlockKey;
    private boolean legend;
    private int squadPositionPriority;
    private RecommendedSquad[] exampleSquad;
    private boolean big;
    private boolean hideInTurnOrder;
    private String thumbImageTurnOrder;
    private boolean requireUltimateUnlock;
    private String battlePortraitTexture;

    public String getId() {
        return id;
    }

    public String getUnitPrefab() {
        return unitPrefab;
    }

    public String getThumbnailName() {
        return thumbnailName;
    }

    public String getNameKey() {
        return nameKey;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public Rarity getMaxRarity() {
        return maxRarity;
    }

    public ForceAlignment getForceAlignment() {
        return forceAlignment;
    }

    public String getXpTableId() {
        return xpTableId;
    }

    public int getActionCountMin() {
        return actionCountMin;
    }

    public int getActionCountMax() {
        return actionCountMax;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public String getDescKey() {
        return descKey;
    }

    public ThreatLevel getThreatLevel() {
        return threatLevel;
    }

    public boolean isObtainable() {
        return obtainable;
    }

    public String getBaseId() {
        return baseId;
    }

    public String getPromotionRecipeReference() {
        return promotionRecipeReference;
    }

    public String getStatProgressionId() {
        return statProgressionId;
    }

    public String[] getCategoryId() {
        return categoryId;
    }

    public int getTrainingXpWorthBaseValueOverride() {
        return trainingXpWorthBaseValueOverride;
    }

    public int getMaxLevelOverride() {
        return maxLevelOverride;
    }

    public int getTrainingCostMultiplierOverride() {
        return trainingCostMultiplierOverride;
    }

    public String getCreationRecipeReference() {
        return creationRecipeReference;
    }

    public SkillDefinitionReference[] getSkillReference() {
        return skillReference;
    }

    public int getBasePower() {
        return basePower;
    }

    public StatDef getBaseStat() {
        return baseStat;
    }

    public String getPrimaryStat() {
        return primaryStat;
    }

    public UnitTierDef[] getUnitTier() {
        return unitTier;
    }

    public Ability getBasicAttack() {
        return basicAttack;
    }

    public Ability getLeaderAbility() {
        return leaderAbility;
    }

    public Ability[] getLimitBreak() {
        return limitBreak;
    }

    public Ability[] getUniqueAbility() {
        return uniqueAbility;
    }

    public AbilityReference getBasicAttackRef() {
        return basicAttackRef;
    }

    public AbilityReference getLeaderAbilityRef() {
        return leaderAbilityRef;
    }

    public AbilityReference[] getLimitBreakRef() {
        return limitBreakRef;
    }

    public AbilityReference[] getUniqueAbilityRef() {
        return uniqueAbilityRef;
    }

    public UnitStat getPrimaryUnitStat() {
        return primaryUnitStat;
    }

    public long getObtainableTime() {
        return obtainableTime;
    }

    public CrewMember[] getCrew() {
        return crew;
    }

    public int getCommandCost() {
        return commandCost;
    }

    public String getCrewContributionTableId() {
        return crewContributionTableId;
    }

    public UnitClass getUnitClass() {
        return unitClass;
    }

    public String getBattlePortraitPrefab() {
        return battlePortraitPrefab;
    }

    public String getBattlePortraitNameKey() {
        return battlePortraitNameKey;
    }

    public UnitModRecommendations[] getModRecommendation() {
        return modRecommendation;
    }

    public String[] getEffectIconPriorityOverride() {
        return effectIconPriorityOverride;
    }

    public SummonStatTable[] getSummonStatTable() {
        return summonStatTable;
    }

    public RelicDefinition getRelicDefinition() {
        return relicDefinition;
    }

    public String getCapitalUnlockKey() {
        return capitalUnlockKey;
    }

    public boolean isLegend() {
        return legend;
    }

    public int getSquadPositionPriority() {
        return squadPositionPriority;
    }

    public RecommendedSquad[] getExampleSquad() {
        return exampleSquad;
    }

    public boolean isBig() {
        return big;
    }

    public boolean isHideInTurnOrder() {
        return hideInTurnOrder;
    }

    public String getThumbImageTurnOrder() {
        return thumbImageTurnOrder;
    }

    public boolean isRequireUltimateUnlock() {
        return requireUltimateUnlock;
    }

    public String getBattlePortraitTexture() {
        return battlePortraitTexture;
    }

    @Override
    public String toString() {
        return "UnitDef{" +
                "id='" + id + '\'' +
                ", unitPrefab='" + unitPrefab + '\'' +
                ", thumbnailName='" + thumbnailName + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", rarity=" + rarity +
                ", maxRarity=" + maxRarity +
                ", forceAlignment=" + forceAlignment +
                ", xpTableId='" + xpTableId + '\'' +
                ", actionCountMin=" + actionCountMin +
                ", actionCountMax=" + actionCountMax +
                ", combatType=" + combatType +
                ", descKey='" + descKey + '\'' +
                ", threatLevel=" + threatLevel +
                ", obtainable=" + obtainable +
                ", baseId='" + baseId + '\'' +
                ", promotionRecipeReference='" + promotionRecipeReference + '\'' +
                ", statProgressionId='" + statProgressionId + '\'' +
                ", categoryId=" + Arrays.toString(categoryId) +
                ", trainingXpWorthBaseValueOverride=" + trainingXpWorthBaseValueOverride +
                ", maxLevelOverride=" + maxLevelOverride +
                ", trainingCostMultiplierOverride=" + trainingCostMultiplierOverride +
                ", creationRecipeReference='" + creationRecipeReference + '\'' +
                ", skillReference=" + Arrays.toString(skillReference) +
                ", basePower=" + basePower +
                ", baseStat=" + baseStat +
                ", primaryStat='" + primaryStat + '\'' +
                ", unitTier=" + Arrays.toString(unitTier) +
                ", basicAttack=" + basicAttack +
                ", leaderAbility=" + leaderAbility +
                ", limitBreak=" + Arrays.toString(limitBreak) +
                ", uniqueAbility=" + Arrays.toString(uniqueAbility) +
                ", basicAttackRef=" + basicAttackRef +
                ", leaderAbilityRef=" + leaderAbilityRef +
                ", limitBreakRef=" + Arrays.toString(limitBreakRef) +
                ", uniqueAbilityRef=" + Arrays.toString(uniqueAbilityRef) +
                ", primaryUnitStat=" + primaryUnitStat +
                ", obtainableTime=" + obtainableTime +
                ", crew=" + Arrays.toString(crew) +
                ", commandCost=" + commandCost +
                ", crewContributionTableId='" + crewContributionTableId + '\'' +
                ", unitClass=" + unitClass +
                ", battlePortraitPrefab='" + battlePortraitPrefab + '\'' +
                ", battlePortraitNameKey='" + battlePortraitNameKey + '\'' +
                ", modRecommendation=" + Arrays.toString(modRecommendation) +
                ", effectIconPriorityOverride=" + Arrays.toString(effectIconPriorityOverride) +
                ", summonStatTable=" + Arrays.toString(summonStatTable) +
                ", relicDefinition=" + relicDefinition +
                ", capitalUnlockKey='" + capitalUnlockKey + '\'' +
                ", legend=" + legend +
                ", squadPositionPriority=" + squadPositionPriority +
                ", exampleSquad=" + Arrays.toString(exampleSquad) +
                ", big=" + big +
                ", hideInTurnOrder=" + hideInTurnOrder +
                ", thumbImageTurnOrder='" + thumbImageTurnOrder + '\'' +
                ", requireUltimateUnlock=" + requireUltimateUnlock +
                ", battlePortraitTexture='" + battlePortraitTexture + '\'' +
                '}';
    }
}
