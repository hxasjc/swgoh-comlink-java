package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.RaidState;

import java.util.Arrays;

@SuppressWarnings("unused")
public class GuildRaidStatus {
    private String raidId;
    private long expireTime;
    private double raidProgress;
    private GuildRaidMember[] raidMemberOld;
    private BattleUnitState[] opponentUnitState;
    private BattleUnitState[] playerUnitState;
    private CampaignElementIdentifier identifier;
    private String instanceId;
    private long rosterRefreshTime;
    private boolean hasPlayerParticipated;
    private RaidState raidState;
    private long tallyEndTime;
    private boolean eligibleForRewards;
    private long activateTimeMs;
    private boolean forbidLateEntry;
    private long joinPeriodEndTimeMs;
    private RaidMember[] raidMember;
    private boolean simEnabled;
    private String encounterId;
    private String lastEncounterIdPlayerParticipated;
    private long currentEncounterPointsScored;
    private String[] ineligibleMemberId;
    private int[] claimedImmediateRewards;
    private CachedRaidRewards cachedRewards;

    public String getRaidId() {
        return raidId;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public double getRaidProgress() {
        return raidProgress;
    }

    public GuildRaidMember[] getRaidMemberOld() {
        return raidMemberOld;
    }

    public BattleUnitState[] getOpponentUnitState() {
        return opponentUnitState;
    }

    public BattleUnitState[] getPlayerUnitState() {
        return playerUnitState;
    }

    public CampaignElementIdentifier getIdentifier() {
        return identifier;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public long getRosterRefreshTime() {
        return rosterRefreshTime;
    }

    public boolean isHasPlayerParticipated() {
        return hasPlayerParticipated;
    }

    public RaidState getRaidState() {
        return raidState;
    }

    public long getTallyEndTime() {
        return tallyEndTime;
    }

    public boolean isEligibleForRewards() {
        return eligibleForRewards;
    }

    public long getActivateTimeMs() {
        return activateTimeMs;
    }

    public boolean isForbidLateEntry() {
        return forbidLateEntry;
    }

    public long getJoinPeriodEndTimeMs() {
        return joinPeriodEndTimeMs;
    }

    public RaidMember[] getRaidMember() {
        return raidMember;
    }

    public boolean isSimEnabled() {
        return simEnabled;
    }

    public String getEncounterId() {
        return encounterId;
    }

    public String getLastEncounterIdPlayerParticipated() {
        return lastEncounterIdPlayerParticipated;
    }

    public long getCurrentEncounterPointsScored() {
        return currentEncounterPointsScored;
    }

    public String[] getIneligibleMemberId() {
        return ineligibleMemberId;
    }

    public int[] getClaimedImmediateRewards() {
        return claimedImmediateRewards;
    }

    public CachedRaidRewards getCachedRewards() {
        return cachedRewards;
    }

    @Override
    public String toString() {
        return "GuildRaidStatus{" +
                "raidId='" + raidId + '\'' +
                ", expireTime=" + expireTime +
                ", raidProgress=" + raidProgress +
                ", raidMemberOld=" + Arrays.toString(raidMemberOld) +
                ", opponentUnitState=" + Arrays.toString(opponentUnitState) +
                ", playerUnitState=" + Arrays.toString(playerUnitState) +
                ", identifier=" + identifier +
                ", instanceId='" + instanceId + '\'' +
                ", rosterRefreshTime=" + rosterRefreshTime +
                ", hasPlayerParticipated=" + hasPlayerParticipated +
                ", raidState=" + raidState +
                ", tallyEndTime=" + tallyEndTime +
                ", eligibleForRewards=" + eligibleForRewards +
                ", activateTimeMs=" + activateTimeMs +
                ", forbidLateEntry=" + forbidLateEntry +
                ", joinPeriodEndTimeMs=" + joinPeriodEndTimeMs +
                ", raidMember=" + Arrays.toString(raidMember) +
                ", simEnabled=" + simEnabled +
                ", encounterId='" + encounterId + '\'' +
                ", lastEncounterIdPlayerParticipated='" + lastEncounterIdPlayerParticipated + '\'' +
                ", currentEncounterPointsScored=" + currentEncounterPointsScored +
                ", ineligibleMemberId=" + Arrays.toString(ineligibleMemberId) +
                ", claimedImmediateRewards=" + Arrays.toString(claimedImmediateRewards) +
                ", cachedRewards=" + cachedRewards +
                '}';
    }
}
