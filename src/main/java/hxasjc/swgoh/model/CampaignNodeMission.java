package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.CampaignElementProgress;
import hxasjc.swgoh.enums.CombatType;
import hxasjc.swgoh.enums.ItemType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class CampaignNodeMission {
    private String id;
    private String nameKey;
    private String descKey;
    private CombatType combatType;
    private BucketItem[] enemyPreview;
    private BucketItem[] rewardPreview;
    private CampaignNodeEncounter[] campaignNodeEncounter;
    private String audioKey;
    private CampaignElementProgress progress;
    private BucketItem[] entryCostRequirement;
    private EntryCategoryAllowed entryCategoryAllowed;
    private String shortNameKey;
    private String groupNameKey;
    private String groupImage;
    private String unlockRequirementLocalizationKey;
    private String cooldownKey;
    private String dailyBattleCapKey;
    private BucketItem[] firstCompleteRewardPreview;
    private CampaignMissionEnemyPreview[] enemyUnitPreview;
    private String prefab;
    private Position position;
    private AbilityReference[] playerAbilityRef;
    private BucketItem[] activateCost;
    private RankRewardPreview[] rankRewardPreview;
    private String detailImage;
    private String detainDescImage;
    private String raidConfigId;
    private DynamicDescription[] dynamicDescription;
    private ItemType nodeDisplayItem;
    private boolean grindEnabled;
    private boolean hasForcedAlly;
    private boolean battleSupportAllowed;
    private boolean autoBattleEnabled;
    private boolean retreatEnabled;
    private ForcedPlayerSquad forcedPlayerSquad;
    private MissionGrantedAbility[] grantedAbilities;
    private String cooldownConditionalOverrideKey;
    private String holonodePlanetPrefabName;
    private boolean battleSpeedAdjustable;
    private String requirementOverrideKey;
    private boolean simmableOverrideEnabled;
    private ConditionalBucket[] conditionalRewardsPreview;
    private ConditionalBucket conditionalEnteyCostOverride;
    private String recommendationKey;
    private BucketItem[] instanceFirstCompleteRewardsPreview;
    private String overviewLocKey;
    private int recommendedGp;
    private long battleDurationLimit;
    private int recommendedUnitGp;
    private boolean volatileAccess;
    private String unlockRequirementId;
    private String visibilityRequirementId;
    private RaidPointsStructure raidPointsStructure;
    private boolean featured;
    private RankRewardPreview[] immediateRegularRankRewardPreview;
    private int maxPointsPerAttempt;
    private UnitReplacement[] unitReplacement;

    public String getId() {
        return id;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String getDescKey() {
        return descKey;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public BucketItem[] getEnemyPreview() {
        return enemyPreview;
    }

    public BucketItem[] getRewardPreview() {
        return rewardPreview;
    }

    public CampaignNodeEncounter[] getCampaignNodeEncounter() {
        return campaignNodeEncounter;
    }

    public String getAudioKey() {
        return audioKey;
    }

    public CampaignElementProgress getProgress() {
        return progress;
    }

    public BucketItem[] getEntryCostRequirement() {
        return entryCostRequirement;
    }

    public EntryCategoryAllowed getEntryCategoryAllowed() {
        return entryCategoryAllowed;
    }

    public String getShortNameKey() {
        return shortNameKey;
    }

    public String getGroupNameKey() {
        return groupNameKey;
    }

    public String getGroupImage() {
        return groupImage;
    }

    public String getUnlockRequirementLocalizationKey() {
        return unlockRequirementLocalizationKey;
    }

    public String getCooldownKey() {
        return cooldownKey;
    }

    public String getDailyBattleCapKey() {
        return dailyBattleCapKey;
    }

    public BucketItem[] getFirstCompleteRewardPreview() {
        return firstCompleteRewardPreview;
    }

    public CampaignMissionEnemyPreview[] getEnemyUnitPreview() {
        return enemyUnitPreview;
    }

    public String getPrefab() {
        return prefab;
    }

    public Position getPosition() {
        return position;
    }

    public AbilityReference[] getPlayerAbilityRef() {
        return playerAbilityRef;
    }

    public BucketItem[] getActivateCost() {
        return activateCost;
    }

    public RankRewardPreview[] getRankRewardPreview() {
        return rankRewardPreview;
    }

    public String getDetailImage() {
        return detailImage;
    }

    public String getDetainDescImage() {
        return detainDescImage;
    }

    public String getRaidConfigId() {
        return raidConfigId;
    }

    public DynamicDescription[] getDynamicDescription() {
        return dynamicDescription;
    }

    public ItemType getNodeDisplayItem() {
        return nodeDisplayItem;
    }

    public boolean isGrindEnabled() {
        return grindEnabled;
    }

    public boolean isHasForcedAlly() {
        return hasForcedAlly;
    }

    public boolean isBattleSupportAllowed() {
        return battleSupportAllowed;
    }

    public boolean isAutoBattleEnabled() {
        return autoBattleEnabled;
    }

    public boolean isRetreatEnabled() {
        return retreatEnabled;
    }

    public ForcedPlayerSquad getForcedPlayerSquad() {
        return forcedPlayerSquad;
    }

    public MissionGrantedAbility[] getGrantedAbilities() {
        return grantedAbilities;
    }

    public String getCooldownConditionalOverrideKey() {
        return cooldownConditionalOverrideKey;
    }

    public String getHolonodePlanetPrefabName() {
        return holonodePlanetPrefabName;
    }

    public boolean isBattleSpeedAdjustable() {
        return battleSpeedAdjustable;
    }

    public String getRequirementOverrideKey() {
        return requirementOverrideKey;
    }

    public boolean isSimmableOverrideEnabled() {
        return simmableOverrideEnabled;
    }

    public ConditionalBucket[] getConditionalRewardsPreview() {
        return conditionalRewardsPreview;
    }

    public ConditionalBucket getConditionalEnteyCostOverride() {
        return conditionalEnteyCostOverride;
    }

    public String getRecommendationKey() {
        return recommendationKey;
    }

    public BucketItem[] getInstanceFirstCompleteRewardsPreview() {
        return instanceFirstCompleteRewardsPreview;
    }

    public String getOverviewLocKey() {
        return overviewLocKey;
    }

    public int getRecommendedGp() {
        return recommendedGp;
    }

    public long getBattleDurationLimit() {
        return battleDurationLimit;
    }

    public int getRecommendedUnitGp() {
        return recommendedUnitGp;
    }

    public boolean isVolatileAccess() {
        return volatileAccess;
    }

    public String getUnlockRequirementId() {
        return unlockRequirementId;
    }

    public String getVisibilityRequirementId() {
        return visibilityRequirementId;
    }

    public RaidPointsStructure getRaidPointsStructure() {
        return raidPointsStructure;
    }

    public boolean isFeatured() {
        return featured;
    }

    public RankRewardPreview[] getImmediateRegularRankRewardPreview() {
        return immediateRegularRankRewardPreview;
    }

    public int getMaxPointsPerAttempt() {
        return maxPointsPerAttempt;
    }

    public UnitReplacement[] getUnitReplacement() {
        return unitReplacement;
    }

    @Override
    public String toString() {
        return "CampaignNodeMission{" +
                "id='" + id + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", descKey='" + descKey + '\'' +
                ", combatType=" + combatType +
                ", enemyPreview=" + Arrays.toString(enemyPreview) +
                ", rewardPreview=" + Arrays.toString(rewardPreview) +
                ", campaignNodeEncounter=" + Arrays.toString(campaignNodeEncounter) +
                ", audioKey='" + audioKey + '\'' +
                ", progress=" + progress +
                ", entryCostRequirement=" + Arrays.toString(entryCostRequirement) +
                ", entryCategoryAllowed=" + entryCategoryAllowed +
                ", shortNameKey='" + shortNameKey + '\'' +
                ", groupNameKey='" + groupNameKey + '\'' +
                ", groupImage='" + groupImage + '\'' +
                ", unlockRequirementLocalizationKey='" + unlockRequirementLocalizationKey + '\'' +
                ", cooldownKey='" + cooldownKey + '\'' +
                ", dailyBattleCapKey='" + dailyBattleCapKey + '\'' +
                ", firstCompleteRewardPreview=" + Arrays.toString(firstCompleteRewardPreview) +
                ", enemyUnitPreview=" + Arrays.toString(enemyUnitPreview) +
                ", prefab='" + prefab + '\'' +
                ", position=" + position +
                ", playerAbilityRef=" + Arrays.toString(playerAbilityRef) +
                ", activateCost=" + Arrays.toString(activateCost) +
                ", rankRewardPreview=" + Arrays.toString(rankRewardPreview) +
                ", detailImage='" + detailImage + '\'' +
                ", detainDescImage='" + detainDescImage + '\'' +
                ", raidConfigId='" + raidConfigId + '\'' +
                ", dynamicDescription=" + Arrays.toString(dynamicDescription) +
                ", nodeDisplayItem=" + nodeDisplayItem +
                ", grindEnabled=" + grindEnabled +
                ", hasForcedAlly=" + hasForcedAlly +
                ", battleSupportAllowed=" + battleSupportAllowed +
                ", autoBattleEnabled=" + autoBattleEnabled +
                ", retreatEnabled=" + retreatEnabled +
                ", forcedPlayerSquad=" + forcedPlayerSquad +
                ", grantedAbilities=" + Arrays.toString(grantedAbilities) +
                ", cooldownConditionalOverrideKey='" + cooldownConditionalOverrideKey + '\'' +
                ", holonodePlanetPrefabName='" + holonodePlanetPrefabName + '\'' +
                ", battleSpeedAdjustable=" + battleSpeedAdjustable +
                ", requirementOverrideKey='" + requirementOverrideKey + '\'' +
                ", simmableOverrideEnabled=" + simmableOverrideEnabled +
                ", conditionalRewardsPreview=" + Arrays.toString(conditionalRewardsPreview) +
                ", conditionalEnteyCostOverride=" + conditionalEnteyCostOverride +
                ", recommendationKey='" + recommendationKey + '\'' +
                ", instanceFirstCompleteRewardsPreview=" + Arrays.toString(instanceFirstCompleteRewardsPreview) +
                ", overviewLocKey='" + overviewLocKey + '\'' +
                ", recommendedGp=" + recommendedGp +
                ", battleDurationLimit=" + battleDurationLimit +
                ", recommendedUnitGp=" + recommendedUnitGp +
                ", volatileAccess=" + volatileAccess +
                ", unlockRequirementId='" + unlockRequirementId + '\'' +
                ", visibilityRequirementId='" + visibilityRequirementId + '\'' +
                ", raidPointsStructure=" + raidPointsStructure +
                ", featured=" + featured +
                ", immediateRegularRankRewardPreview=" + Arrays.toString(immediateRegularRankRewardPreview) +
                ", maxPointsPerAttempt=" + maxPointsPerAttempt +
                ", unitReplacement=" + Arrays.toString(unitReplacement) +
                '}';
    }
}
