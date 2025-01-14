package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class GuildRaidGlobalConfig {
    private GuildRaidLockout guildRaidLockout;
    private long lateEntryParticipationLockoutSeconds;

    public GuildRaidLockout getGuildRaidLockout() {
        return guildRaidLockout;
    }

    public long getLateEntryParticipationLockoutSeconds() {
        return lateEntryParticipationLockoutSeconds;
    }

    @Override
    public String toString() {
        return "GuildRaidGlobalConfig{" +
                "guildRaidLockout=" + guildRaidLockout +
                ", lateEntryParticipationLockoutSeconds=" + lateEntryParticipationLockoutSeconds +
                '}';
    }
}
