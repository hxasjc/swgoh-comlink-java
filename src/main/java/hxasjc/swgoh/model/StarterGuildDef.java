package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class StarterGuildDef {
    private String guildType;
    private String nameKey;
    private String[] allowedRaidId;
    private String messageKey;
    private String[] allowedRaidCampaignId;
    private String bannerLogoId;
    private String bannerColorId;
    private String externalMessageKey;
    private String subNameKey;

    public String getGuildType() {
        return guildType;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String[] getAllowedRaidId() {
        return allowedRaidId;
    }

    public String getMessageKey() {
        return messageKey;
    }

    public String[] getAllowedRaidCampaignId() {
        return allowedRaidCampaignId;
    }

    public String getBannerLogoId() {
        return bannerLogoId;
    }

    public String getBannerColorId() {
        return bannerColorId;
    }

    public String getExternalMessageKey() {
        return externalMessageKey;
    }

    public String getSubNameKey() {
        return subNameKey;
    }

    @Override
    public String toString() {
        return "StarterGuildDef{" +
                "guildType='" + guildType + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", allowedRaidId=" + Arrays.toString(allowedRaidId) +
                ", messageKey='" + messageKey + '\'' +
                ", allowedRaidCampaignId=" + Arrays.toString(allowedRaidCampaignId) +
                ", bannerLogoId='" + bannerLogoId + '\'' +
                ", bannerColorId='" + bannerColorId + '\'' +
                ", externalMessageKey='" + externalMessageKey + '\'' +
                ", subNameKey='" + subNameKey + '\'' +
                '}';
    }
}
