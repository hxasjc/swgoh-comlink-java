package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryWarStatus {
    private String instanceId;
    private String definitionId;
    private int currentRound;
    private long currentRoundEndTime;
    private String channelId;
    private TerritoryWarGuildStatus homeGuild;
    private TerritoryWarGuildStatus awayGuild;
    private TerritoryWarPlayerStatus playerStatus;
    private TerritoryMapStat currentStat;
    private String[] optedInMemberId;
    private TerritoryWarParticipant[] optedInMember;
    private boolean excludedFromWar;
    private boolean hasReportedEnemyGuild;
    private long lastCommandNotificationTime;
    private boolean mapCompletedEarly;

    public String getInstanceId() {
        return instanceId;
    }

    public String getDefinitionId() {
        return definitionId;
    }

    public int getCurrentRound() {
        return currentRound;
    }

    public long getCurrentRoundEndTime() {
        return currentRoundEndTime;
    }

    public String getChannelId() {
        return channelId;
    }

    public TerritoryWarGuildStatus getHomeGuild() {
        return homeGuild;
    }

    public TerritoryWarGuildStatus getAwayGuild() {
        return awayGuild;
    }

    public TerritoryWarPlayerStatus getPlayerStatus() {
        return playerStatus;
    }

    public TerritoryMapStat getCurrentStat() {
        return currentStat;
    }

    public String[] getOptedInMemberId() {
        return optedInMemberId;
    }

    public TerritoryWarParticipant[] getOptedInMember() {
        return optedInMember;
    }

    public boolean isExcludedFromWar() {
        return excludedFromWar;
    }

    public boolean isHasReportedEnemyGuild() {
        return hasReportedEnemyGuild;
    }

    public long getLastCommandNotificationTime() {
        return lastCommandNotificationTime;
    }

    public boolean isMapCompletedEarly() {
        return mapCompletedEarly;
    }

    @Override
    public String toString() {
        return "TerritoryWarStatus{" +
                "instanceId='" + instanceId + '\'' +
                ", definitionId='" + definitionId + '\'' +
                ", currentRound=" + currentRound +
                ", currentRoundEndTime=" + currentRoundEndTime +
                ", channelId='" + channelId + '\'' +
                ", homeGuild=" + homeGuild +
                ", awayGuild=" + awayGuild +
                ", playerStatus=" + playerStatus +
                ", currentStat=" + currentStat +
                ", optedInMemberId=" + Arrays.toString(optedInMemberId) +
                ", optedInMember=" + Arrays.toString(optedInMember) +
                ", excludedFromWar=" + excludedFromWar +
                ", hasReportedEnemyGuild=" + hasReportedEnemyGuild +
                ", lastCommandNotificationTime=" + lastCommandNotificationTime +
                ", mapCompletedEarly=" + mapCompletedEarly +
                '}';
    }
}
