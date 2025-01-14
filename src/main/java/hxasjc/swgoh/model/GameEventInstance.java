package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class GameEventInstance {
    private String id;
    private long startTime;
    private long endTime;
    private long displayStartTime;
    private long displayEndTime;
    private boolean timeLimited;
    private CampaignElementIdentifier campaignElementIdentifier;
    private BucketItem[] rewardPreview;
    private RankRewardPreview[] rankRewardPreview;
    private EntryCategoryAllowed entryCategoryAllowed;
    private int defensiveSquadSize;
    private String unitDailyUsageCapKey;
    private long rosterRefreshTime;
    private boolean joined;
    private String summaryKey;
    private long rewardTime;
    private long defensiveSquadSaveTimeLimit;
    private SystemModifier systemModifier;
    private boolean supportsPushNotifications;
    private String[] linkedEventId;

    public String getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getDisplayStartTime() {
        return displayStartTime;
    }

    public long getDisplayEndTime() {
        return displayEndTime;
    }

    public boolean isTimeLimited() {
        return timeLimited;
    }

    public CampaignElementIdentifier getCampaignElementIdentifier() {
        return campaignElementIdentifier;
    }

    public BucketItem[] getRewardPreview() {
        return rewardPreview;
    }

    public RankRewardPreview[] getRankRewardPreview() {
        return rankRewardPreview;
    }

    public EntryCategoryAllowed getEntryCategoryAllowed() {
        return entryCategoryAllowed;
    }

    public int getDefensiveSquadSize() {
        return defensiveSquadSize;
    }

    public String getUnitDailyUsageCapKey() {
        return unitDailyUsageCapKey;
    }

    public long getRosterRefreshTime() {
        return rosterRefreshTime;
    }

    public boolean isJoined() {
        return joined;
    }

    public String getSummaryKey() {
        return summaryKey;
    }

    public long getRewardTime() {
        return rewardTime;
    }

    public long getDefensiveSquadSaveTimeLimit() {
        return defensiveSquadSaveTimeLimit;
    }

    public SystemModifier getSystemModifier() {
        return systemModifier;
    }

    public boolean isSupportsPushNotifications() {
        return supportsPushNotifications;
    }

    public String[] getLinkedEventId() {
        return linkedEventId;
    }

    @Override
    public String toString() {
        return "GameEventInstance{" +
                "id='" + id + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", displayStartTime=" + displayStartTime +
                ", displayEndTime=" + displayEndTime +
                ", timeLimited=" + timeLimited +
                ", campaignElementIdentifier=" + campaignElementIdentifier +
                ", rewardPreview=" + Arrays.toString(rewardPreview) +
                ", rankRewardPreview=" + Arrays.toString(rankRewardPreview) +
                ", entryCategoryAllowed=" + entryCategoryAllowed +
                ", defensiveSquadSize=" + defensiveSquadSize +
                ", unitDailyUsageCapKey='" + unitDailyUsageCapKey + '\'' +
                ", rosterRefreshTime=" + rosterRefreshTime +
                ", joined=" + joined +
                ", summaryKey='" + summaryKey + '\'' +
                ", rewardTime=" + rewardTime +
                ", defensiveSquadSaveTimeLimit=" + defensiveSquadSaveTimeLimit +
                ", systemModifier=" + systemModifier +
                ", supportsPushNotifications=" + supportsPushNotifications +
                ", linkedEventId=" + Arrays.toString(linkedEventId) +
                '}';
    }
}
