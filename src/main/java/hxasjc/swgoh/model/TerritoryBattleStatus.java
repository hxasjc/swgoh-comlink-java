package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryBattleStatus {
    private String instanceId;
    private String definitionId;
    private TerritoryConflictZoneStatus[] conflictZoneStatus;
    private TerritoryStrikeZoneStatus[] strikeZoneStatus;
    private TerritoryReconZoneStatus[] reconZoneStatus;
    private TerritoryBattlePlayerStatus playerStatus;
    private int currentRound;
    private long currentRoundEndTime;
    private String channelId;
    private TerritoryCovertZoneStatus[] covertZoneStatus;
    private TerritoryMapStat currentStat;
    private long lastCommandNotificationTime;
    private boolean mapCompletedEarly;
    private boolean selected;

    public String getInstanceId() {
        return instanceId;
    }

    public String getDefinitionId() {
        return definitionId;
    }

    public TerritoryConflictZoneStatus[] getConflictZoneStatus() {
        return conflictZoneStatus;
    }

    public TerritoryStrikeZoneStatus[] getStrikeZoneStatus() {
        return strikeZoneStatus;
    }

    public TerritoryReconZoneStatus[] getReconZoneStatus() {
        return reconZoneStatus;
    }

    public TerritoryBattlePlayerStatus getPlayerStatus() {
        return playerStatus;
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

    public TerritoryCovertZoneStatus[] getCovertZoneStatus() {
        return covertZoneStatus;
    }

    public TerritoryMapStat getCurrentStat() {
        return currentStat;
    }

    public long getLastCommandNotificationTime() {
        return lastCommandNotificationTime;
    }

    public boolean isMapCompletedEarly() {
        return mapCompletedEarly;
    }

    public boolean isSelected() {
        return selected;
    }

    @Override
    public String toString() {
        return "TerritoryBattleStatus{" +
                "instanceId='" + instanceId + '\'' +
                ", definitionId='" + definitionId + '\'' +
                ", conflictZoneStatus=" + Arrays.toString(conflictZoneStatus) +
                ", strikeZoneStatus=" + Arrays.toString(strikeZoneStatus) +
                ", reconZoneStatus=" + Arrays.toString(reconZoneStatus) +
                ", playerStatus=" + playerStatus +
                ", currentRound=" + currentRound +
                ", currentRoundEndTime=" + currentRoundEndTime +
                ", channelId='" + channelId + '\'' +
                ", covertZoneStatus=" + Arrays.toString(covertZoneStatus) +
                ", currentStat=" + currentStat +
                ", lastCommandNotificationTime=" + lastCommandNotificationTime +
                ", mapCompletedEarly=" + mapCompletedEarly +
                ", selected=" + selected +
                '}';
    }
}
