package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.CampaignElementProgress;

import java.util.Arrays;

@SuppressWarnings("unused")
public class CampaignMap {
    private String id;
    CampaignNodeDifficultyGroup[] campaignNodeDifficultyGroup;
    private CampaignElementProgress progress;
    private BucketItem[] entryOwnershipRequirement;
    private String unlockRequirementLocalizationKey;
    private boolean isPlayerSquadSupplied;
    private String dailyBattleCapKey;
    private EntryCategoryAllowed entryCategoryAllowed;
    private boolean grindEnabled;
    private String gameModeKey;

    public String getId() {
        return id;
    }

    public CampaignNodeDifficultyGroup[] getCampaignNodeDifficultyGroup() {
        return campaignNodeDifficultyGroup;
    }

    public CampaignElementProgress getProgress() {
        return progress;
    }

    public BucketItem[] getEntryOwnershipRequirement() {
        return entryOwnershipRequirement;
    }

    public String getUnlockRequirementLocalizationKey() {
        return unlockRequirementLocalizationKey;
    }

    public boolean isPlayerSquadSupplied() {
        return isPlayerSquadSupplied;
    }

    public String getDailyBattleCapKey() {
        return dailyBattleCapKey;
    }

    public EntryCategoryAllowed getEntryCategoryAllowed() {
        return entryCategoryAllowed;
    }

    public boolean isGrindEnabled() {
        return grindEnabled;
    }

    public String getGameModeKey() {
        return gameModeKey;
    }

    @Override
    public String toString() {
        return "CampaignMap{" +
                "id='" + id + '\'' +
                ", campaignNodeDifficultyGroup=" + Arrays.toString(campaignNodeDifficultyGroup) +
                ", progress=" + progress +
                ", entryOwnershipRequirement=" + Arrays.toString(entryOwnershipRequirement) +
                ", unlockRequirementLocalizationKey='" + unlockRequirementLocalizationKey + '\'' +
                ", isPlayerSquadSupplied=" + isPlayerSquadSupplied +
                ", dailyBattleCapKey='" + dailyBattleCapKey + '\'' +
                ", entryCategoryAllowed=" + entryCategoryAllowed +
                ", grindEnabled=" + grindEnabled +
                ", gameModeKey='" + gameModeKey + '\'' +
                '}';
    }
}
