package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.GuildRaidRosterRefreshType;
import hxasjc.swgoh.enums.GuildRaidType;

@SuppressWarnings("unused")
public class GuildRaidConfig {
    private String id;
    private GuildRaidType raidType;
    private GuildRaidRosterRefreshType rosterRefreshType;
    private GuildRaidRosterRefresh rosterRefresh;
    private long raidDuration;

    public String getId() {
        return id;
    }

    public GuildRaidType getRaidType() {
        return raidType;
    }

    public GuildRaidRosterRefreshType getRosterRefreshType() {
        return rosterRefreshType;
    }

    public GuildRaidRosterRefresh getRosterRefresh() {
        return rosterRefresh;
    }

    public long getRaidDuration() {
        return raidDuration;
    }

    @Override
    public String toString() {
        return "GuildRaidConfig{" +
                "id='" + id + '\'' +
                ", raidType=" + raidType +
                ", rosterRefreshType=" + rosterRefreshType +
                ", rosterRefresh=" + rosterRefresh +
                ", raidDuration=" + raidDuration +
                '}';
    }
}
