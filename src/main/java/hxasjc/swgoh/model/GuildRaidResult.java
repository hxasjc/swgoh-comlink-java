package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.RaidOutcome;

import java.util.Arrays;

@SuppressWarnings("unused")
public class GuildRaidResult {
    private String raidId;
    private CampaignElementIdentifier identifier;
    private long duration;
    private double progress;
    private RaidMember[] raidMember;
    private long endTime;
    private RaidOutcome outcome;
    private long[] encounterProgress;
    private long guildRewardScore;
    private CachedRaidRewards cachedRewards;

    public String getRaidId() {
        return raidId;
    }

    public CampaignElementIdentifier getIdentifier() {
        return identifier;
    }

    public long getDuration() {
        return duration;
    }

    public double getProgress() {
        return progress;
    }

    public RaidMember[] getRaidMember() {
        return raidMember;
    }

    public long getEndTime() {
        return endTime;
    }

    public RaidOutcome getOutcome() {
        return outcome;
    }

    public long[] getEncounterProgress() {
        return encounterProgress;
    }

    public long getGuildRewardScore() {
        return guildRewardScore;
    }

    public CachedRaidRewards getCachedRewards() {
        return cachedRewards;
    }

    @Override
    public String toString() {
        return "GuildRaidResult{" +
                "raidId='" + raidId + '\'' +
                ", identifier=" + identifier +
                ", duration=" + duration +
                ", progress=" + progress +
                ", raidMember=" + Arrays.toString(raidMember) +
                ", endTime=" + endTime +
                ", outcome=" + outcome +
                ", encounterProgress=" + Arrays.toString(encounterProgress) +
                ", guildRewardScore=" + guildRewardScore +
                ", cachedRewards=" + cachedRewards +
                '}';
    }
}
