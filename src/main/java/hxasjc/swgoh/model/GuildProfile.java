package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.EnrollmentStatus;

import java.util.Arrays;

@SuppressWarnings("unused")
public class GuildProfile {
    private String id;
    private String name;
    private String externalMessageKey;
    private String[] messageCriteriaKey;
    private String logoBackground;
    private EnrollmentStatus enrollmentStatus;
    private int trophy;
    private int memberCount;
    private int memberMax;
    private int level;
    private int rank;
    private int levelRequirement;
    private int raidWin;
    private long leaderboardScore;
    private String bannerColorId;
    private String bannerLogoId;
    private long guildGalacticPower;
    private String chatChannelId;
    private String guildType;
    private GuildRaidLaunchConfig[] raidLaunchConfig;
    private GuildEventTracker[] guildEventTracker;
    private long guildGalacticPowerForRequirement;
    private GuildRaidLaunchConfig singleLaunchConfig;
    private GuildRaidLaunchConfig autoLaunchConfig;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getExternalMessageKey() {
        return externalMessageKey;
    }

    public String[] getMessageCriteriaKey() {
        return messageCriteriaKey;
    }

    public String getLogoBackground() {
        return logoBackground;
    }

    public EnrollmentStatus getEnrollmentStatus() {
        return enrollmentStatus;
    }

    public int getTrophy() {
        return trophy;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public int getMemberMax() {
        return memberMax;
    }

    public int getLevel() {
        return level;
    }

    public int getRank() {
        return rank;
    }

    public int getLevelRequirement() {
        return levelRequirement;
    }

    public int getRaidWin() {
        return raidWin;
    }

    public long getLeaderboardScore() {
        return leaderboardScore;
    }

    public String getBannerColorId() {
        return bannerColorId;
    }

    public String getBannerLogoId() {
        return bannerLogoId;
    }

    public long getGuildGalacticPower() {
        return guildGalacticPower;
    }

    public String getChatChannelId() {
        return chatChannelId;
    }

    public String getGuildType() {
        return guildType;
    }

    public GuildRaidLaunchConfig[] getRaidLaunchConfig() {
        return raidLaunchConfig;
    }

    public GuildEventTracker[] getGuildEventTracker() {
        return guildEventTracker;
    }

    public long getGuildGalacticPowerForRequirement() {
        return guildGalacticPowerForRequirement;
    }

    public GuildRaidLaunchConfig getSingleLaunchConfig() {
        return singleLaunchConfig;
    }

    public GuildRaidLaunchConfig getAutoLaunchConfig() {
        return autoLaunchConfig;
    }

    @Override
    public String toString() {
        return "GuildProfile{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", externalMessageKey='" + externalMessageKey + '\'' +
                ", messageCriteriaKey=" + Arrays.toString(messageCriteriaKey) +
                ", logoBackground='" + logoBackground + '\'' +
                ", enrollmentStatus=" + enrollmentStatus +
                ", trophy=" + trophy +
                ", memberCount=" + memberCount +
                ", memberMax=" + memberMax +
                ", level=" + level +
                ", rank=" + rank +
                ", levelRequirement=" + levelRequirement +
                ", raidWin=" + raidWin +
                ", leaderboardScore=" + leaderboardScore +
                ", bannerColorId='" + bannerColorId + '\'' +
                ", bannerLogoId='" + bannerLogoId + '\'' +
                ", guildGalacticPower=" + guildGalacticPower +
                ", chatChannelId='" + chatChannelId + '\'' +
                ", guildType='" + guildType + '\'' +
                ", raidLaunchConfig=" + Arrays.toString(raidLaunchConfig) +
                ", guildEventTracker=" + Arrays.toString(guildEventTracker) +
                ", guildGalacticPowerForRequirement=" + guildGalacticPowerForRequirement +
                ", singleLaunchConfig=" + singleLaunchConfig +
                ", autoLaunchConfig=" + autoLaunchConfig +
                '}';
    }
}
