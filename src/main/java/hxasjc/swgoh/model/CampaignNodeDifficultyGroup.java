package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.CampaignElementProgress;
import hxasjc.swgoh.enums.CampaignNodeDifficulty;

import java.util.Arrays;

@SuppressWarnings("unused")
public class CampaignNodeDifficultyGroup {
    private CampaignNodeDifficulty campaignNodeDifficulty;
    private CampaignNode[] campaignNode;
    private CampaignElementProgress progress;
    private String unlockRequirementLocalizationKey;
    private String dailyBattleCapKey;
    private EntryCategoryAllowed entryCategoryAllowed;
    private boolean grindEnabled;

    public CampaignNodeDifficulty getCampaignNodeDifficulty() {
        return campaignNodeDifficulty;
    }

    public CampaignNode[] getCampaignNode() {
        return campaignNode;
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

    public boolean isGrindEnabled() {
        return grindEnabled;
    }

    @Override
    public String toString() {
        return "CampaignNodeDifficultyGroup{" +
                "campaignNodeDifficulty=" + campaignNodeDifficulty +
                ", campaignNode=" + Arrays.toString(campaignNode) +
                ", progress=" + progress +
                ", unlockRequirementLocalizationKey='" + unlockRequirementLocalizationKey + '\'' +
                ", dailyBattleCapKey='" + dailyBattleCapKey + '\'' +
                ", entryCategoryAllowed=" + entryCategoryAllowed +
                ", grindEnabled=" + grindEnabled +
                '}';
    }
}
