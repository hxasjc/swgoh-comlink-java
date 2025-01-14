package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.CampaignElementProgress;
import hxasjc.swgoh.enums.CampaignType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Campaign {
    private String id;
    private String nameKey;
    private String descriptionKey;
    private String image;
    private CampaignType campaignType;
    private CampaignMap[] campaignMap;
    private CampaignElementProgress progress;
    private String unlockRequirementLocalizationKey;
    private String dailyBattleCapKey;
    private EntryCategoryAllowed entryCategoryAllowed;
    private boolean grindEnabled;

    public String getId() {
        return id;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String getDescriptionKey() {
        return descriptionKey;
    }

    public String getImage() {
        return image;
    }

    public CampaignType getCampaignType() {
        return campaignType;
    }

    public CampaignMap[] getCampaignMap() {
        return campaignMap;
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
        return "Campaign{" +
                "id='" + id + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", descriptionKey='" + descriptionKey + '\'' +
                ", image='" + image + '\'' +
                ", campaignType=" + campaignType +
                ", campaignMap=" + Arrays.toString(campaignMap) +
                ", progress=" + progress +
                ", unlockRequirementLocalizationKey='" + unlockRequirementLocalizationKey + '\'' +
                ", dailyBattleCapKey='" + dailyBattleCapKey + '\'' +
                ", entryCategoryAllowed=" + entryCategoryAllowed +
                ", grindEnabled=" + grindEnabled +
                '}';
    }
}
