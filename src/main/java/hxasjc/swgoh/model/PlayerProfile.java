package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class PlayerProfile {
    private String name;
    private int level;
    private long allyCode;
    private String playerId;
    private Unit[] rosterUnit;
    private PlayerProfileStat[] profileStat;
    private String guildId;
    private String guildName;
    private String guildLogoBrackground;
    private String guildBannerColor;
    private String guildBannerLogo;
    private PlayerPvpProfile[] pvpProfile;
    private PlayerTitle selectedPlayerTitle;
    private PlayerTitle[] unlockedPlayerTitle;
    private String guildTypeId;
    private int localTimeZoneOffsetMinutes;
    private long lastActivity;
    private PlayerPortrait selectedPlayerPortrait;
    private PlayerPortrait[] unlockedPlayerPortrait;
    private SeasonStatus[] seasonStatus;
    private long lifetimeSeasonScore;
    private PlayerRating playerRating;
    private Datacron[] datacron;
    private String nucleusId;

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public long getAllyCode() {
        return allyCode;
    }

    public String getPlayerId() {
        return playerId;
    }

    public Unit[] getRosterUnit() {
        return rosterUnit;
    }

    public PlayerProfileStat[] getProfileStat() {
        return profileStat;
    }

    public String getGuildId() {
        return guildId;
    }

    public String getGuildName() {
        return guildName;
    }

    public String getGuildLogoBrackground() {
        return guildLogoBrackground;
    }

    public String getGuildBannerColor() {
        return guildBannerColor;
    }

    public String getGuildBannerLogo() {
        return guildBannerLogo;
    }

    public PlayerPvpProfile[] getPvpProfile() {
        return pvpProfile;
    }

    public PlayerTitle getSelectedPlayerTitle() {
        return selectedPlayerTitle;
    }

    public PlayerTitle[] getUnlockedPlayerTitle() {
        return unlockedPlayerTitle;
    }

    public String getGuildTypeId() {
        return guildTypeId;
    }

    public int getLocalTimeZoneOffsetMinutes() {
        return localTimeZoneOffsetMinutes;
    }

    public long getLastActivity() {
        return lastActivity;
    }

    public PlayerPortrait getSelectedPlayerPortrait() {
        return selectedPlayerPortrait;
    }

    public PlayerPortrait[] getUnlockedPlayerPortrait() {
        return unlockedPlayerPortrait;
    }

    public SeasonStatus[] getSeasonStatus() {
        return seasonStatus;
    }

    public long getLifetimeSeasonScore() {
        return lifetimeSeasonScore;
    }

    public PlayerRating getPlayerRating() {
        return playerRating;
    }

    public Datacron[] getDatacron() {
        return datacron;
    }

    public String getNucleusId() {
        return nucleusId;
    }

    @Override
    public String toString() {
        return "PlayerProfile{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", allyCode=" + allyCode +
                ", playerId='" + playerId + '\'' +
                ", rosterUnit=" + Arrays.toString(rosterUnit) +
                ", profileStat=" + Arrays.toString(profileStat) +
                ", guildId='" + guildId + '\'' +
                ", guildName='" + guildName + '\'' +
                ", guildLogoBrackground='" + guildLogoBrackground + '\'' +
                ", guildBannerColor='" + guildBannerColor + '\'' +
                ", guildBannerLogo='" + guildBannerLogo + '\'' +
                ", pvpProfile=" + Arrays.toString(pvpProfile) +
                ", selectedPlayerTitle=" + selectedPlayerTitle +
                ", unlockedPlayerTitle=" + Arrays.toString(unlockedPlayerTitle) +
                ", guildTypeId='" + guildTypeId + '\'' +
                ", localTimeZoneOffsetMinutes=" + localTimeZoneOffsetMinutes +
                ", lastActivity=" + lastActivity +
                ", selectedPlayerPortrait=" + selectedPlayerPortrait +
                ", unlockedPlayerPortrait=" + Arrays.toString(unlockedPlayerPortrait) +
                ", seasonStatus=" + Arrays.toString(seasonStatus) +
                ", lifetimeSeasonScore=" + lifetimeSeasonScore +
                ", playerRating=" + playerRating +
                ", datacron=" + Arrays.toString(datacron) +
                ", nucleusId='" + nucleusId + '\'' +
                '}';
    }
}
