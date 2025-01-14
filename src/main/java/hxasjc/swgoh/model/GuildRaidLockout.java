package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class GuildRaidLockout {
    private long lockoutStartTime;
    private long lockoutEndTime;

    public long getLockoutStartTime() {
        return lockoutStartTime;
    }

    public long getLockoutEndTime() {
        return lockoutEndTime;
    }

    @Override
    public String toString() {
        return "GuildRaidLockout{" +
                "lockoutStartTime=" + lockoutStartTime +
                ", lockoutEndTime=" + lockoutEndTime +
                '}';
    }
}
