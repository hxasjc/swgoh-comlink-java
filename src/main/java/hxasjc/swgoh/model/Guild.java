package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Guild {
    private GuildProfile profile;
    private GuildMember[] member;
    private GuildInviteStatus[] inviteStatus;
    private GuildRaidStatus[] raidStatus;
    private GuildInventory inventory;
    private GuildRaidResult[] raidResult;
    private GuildProgress progress;
    private TerritoryBattleStatus[] territoryBattleStatus;
    private GameEvent guildEvents;
    private TerritoryBattleResult territoryBattleResult;
    private TerritoryWarStatus[] territoryWarStatus;
    private RoomData[] roomAvailable;
    private long nextChallengeRefresh;
    private GuildStat[] stat;
    private GuildRaidResult[] recentRaidResult;
    private TerritoryWarResult[] recentTerritoryWarResult;
    private GuildRaidPointsSummary[] lastRaidPointsSummary;

    public GuildProfile getProfile() {
        return profile;
    }

    public GuildMember[] getMember() {
        return member;
    }

    public GuildInviteStatus[] getInviteStatus() {
        return inviteStatus;
    }

    public GuildRaidStatus[] getRaidStatus() {
        return raidStatus;
    }

    public GuildInventory getInventory() {
        return inventory;
    }

    public GuildRaidResult[] getRaidResult() {
        return raidResult;
    }

    public GuildProgress getProgress() {
        return progress;
    }

    public TerritoryBattleStatus[] getTerritoryBattleStatus() {
        return territoryBattleStatus;
    }

    public GameEvent getGuildEvents() {
        return guildEvents;
    }

    public TerritoryBattleResult getTerritoryBattleResult() {
        return territoryBattleResult;
    }

    public TerritoryWarStatus[] getTerritoryWarStatus() {
        return territoryWarStatus;
    }

    public RoomData[] getRoomAvailable() {
        return roomAvailable;
    }

    public long getNextChallengeRefresh() {
        return nextChallengeRefresh;
    }

    public GuildStat[] getStat() {
        return stat;
    }

    public GuildRaidResult[] getRecentRaidResult() {
        return recentRaidResult;
    }

    public TerritoryWarResult[] getRecentTerritoryWarResult() {
        return recentTerritoryWarResult;
    }

    public GuildRaidPointsSummary[] getLastRaidPointsSummary() {
        return lastRaidPointsSummary;
    }

    @Override
    public String toString() {
        return "Guild{" +
                "profile=" + profile +
                ", member=" + Arrays.toString(member) +
                ", inviteStatus=" + Arrays.toString(inviteStatus) +
                ", raidStatus=" + Arrays.toString(raidStatus) +
                ", inventory=" + inventory +
                ", raidResult=" + Arrays.toString(raidResult) +
                ", progress=" + progress +
                ", territoryBattleStatus=" + Arrays.toString(territoryBattleStatus) +
                ", guildEvents=" + guildEvents +
                ", territoryBattleResult=" + territoryBattleResult +
                ", territoryWarStatus=" + Arrays.toString(territoryWarStatus) +
                ", roomAvailable=" + Arrays.toString(roomAvailable) +
                ", nextChallengeRefresh=" + nextChallengeRefresh +
                ", stat=" + Arrays.toString(stat) +
                ", recentRaidResult=" + Arrays.toString(recentRaidResult) +
                ", recentTerritoryWarResult=" + Arrays.toString(recentTerritoryWarResult) +
                ", lastRaidPointsSummary=" + Arrays.toString(lastRaidPointsSummary) +
                '}';
    }
}
