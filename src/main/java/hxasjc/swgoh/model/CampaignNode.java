package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.*;

import java.util.Arrays;

@SuppressWarnings("unused")
public class CampaignNode {
    private String id;
    private String nameKey;
    private CampaignNodeMission[] campaignNodeMission;
    private String homePrefab;
    private ForceAlignment forceAlignment;
    private UnitClass dominantClass;
    private CombatType combatType;
    private boolean isCannon;
    private CampaignElementProgress progress;
    private String unlockRequirementLocalizationKey;
    private String dailyBattleCapKey;
    private EntryCategoryAllowed entryCategoryAllowed;
    private String cooldownKey;
    private boolean grindEnabled;
    private String cooldownConditionalOverrideKey;
    private BucketItem[] firstTimeFinishCost;

    public String getId() {
        return id;
    }

    public String getNameKey() {
        return nameKey;
    }

    public CampaignNodeMission[] getCampaignNodeMission() {
        return campaignNodeMission;
    }

    public String getHomePrefab() {
        return homePrefab;
    }

    public ForceAlignment getForceAlignment() {
        return forceAlignment;
    }

    public UnitClass getDominantClass() {
        return dominantClass;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public boolean isCannon() {
        return isCannon;
    }

    public CampaignElementProgress getProgress() {
        return progress;
    }

    public String getUnlockRequirementLocalizationKey() {
        return unlockRequirementLocalizationKey;
    }

    public String getDailyBattleCapKey() {
        return dailyBattleCapKey;
    }

    public EntryCategoryAllowed getEntryCategoryAllowed() {
        return entryCategoryAllowed;
    }

    public String getCooldownKey() {
        return cooldownKey;
    }

    public boolean isGrindEnabled() {
        return grindEnabled;
    }

    public String getCooldownConditionalOverrideKey() {
        return cooldownConditionalOverrideKey;
    }

    public BucketItem[] getFirstTimeFinishCost() {
        return firstTimeFinishCost;
    }

    @Override
    public String toString() {
        return "CampaignNode{" +
                "id='" + id + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", campaignNodeMission=" + Arrays.toString(campaignNodeMission) +
                ", homePrefab='" + homePrefab + '\'' +
                ", forceAlignment=" + forceAlignment +
                ", dominantClass=" + dominantClass +
                ", combatType=" + combatType +
                ", isCannon=" + isCannon +
                ", progress=" + progress +
                ", unlockRequirementLocalizationKey='" + unlockRequirementLocalizationKey + '\'' +
                ", dailyBattleCapKey='" + dailyBattleCapKey + '\'' +
                ", entryCategoryAllowed=" + entryCategoryAllowed +
                ", cooldownKey='" + cooldownKey + '\'' +
                ", grindEnabled=" + grindEnabled +
                ", cooldownConditionalOverrideKey='" + cooldownConditionalOverrideKey + '\'' +
                ", firstTimeFinishCost=" + Arrays.toString(firstTimeFinishCost) +
                '}';
    }
}
