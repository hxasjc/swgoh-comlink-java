package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class GuildRaidLaunchConfig {
    private String raidId;
    private CampaignElementIdentifier campaignMissionIdentifier;
    private boolean autoLaunch;
    private boolean autoLaunchImmediately;
    private long autoLaunchTime;
    private long joinPeriodDuration;
    private boolean autoSimEnabled;
    private boolean immediate;
    private long scheduledUtcOffsetSeconds;

    public String getRaidId() {
        return raidId;
    }

    public CampaignElementIdentifier getCampaignMissionIdentifier() {
        return campaignMissionIdentifier;
    }

    public boolean isAutoLaunch() {
        return autoLaunch;
    }

    public boolean isAutoLaunchImmediately() {
        return autoLaunchImmediately;
    }

    public long getAutoLaunchTime() {
        return autoLaunchTime;
    }

    public long getJoinPeriodDuration() {
        return joinPeriodDuration;
    }

    public boolean isAutoSimEnabled() {
        return autoSimEnabled;
    }

    public boolean isImmediate() {
        return immediate;
    }

    public long getScheduledUtcOffsetSeconds() {
        return scheduledUtcOffsetSeconds;
    }

    @Override
    public String toString() {
        return "GuildRaidLaunchConfig{" +
                "raidId='" + raidId + '\'' +
                ", campaignMissionIdentifier=" + campaignMissionIdentifier +
                ", autoLaunch=" + autoLaunch +
                ", autoLaunchImmediately=" + autoLaunchImmediately +
                ", autoLaunchTime=" + autoLaunchTime +
                ", joinPeriodDuration=" + joinPeriodDuration +
                ", autoSimEnabled=" + autoSimEnabled +
                ", immediate=" + immediate +
                ", scheduledUtcOffsetSeconds=" + scheduledUtcOffsetSeconds +
                '}';
    }
}
