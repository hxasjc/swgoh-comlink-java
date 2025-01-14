package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class GuildRaidMember {
    private String playerId;
    private long memberProgress;
    private int memberRank;

    public String getPlayerId() {
        return playerId;
    }

    public long getMemberProgress() {
        return memberProgress;
    }

    public int getMemberRank() {
        return memberRank;
    }

    @Override
    public String toString() {
        return "GuildRaidMember{" +
                "playerId='" + playerId + '\'' +
                ", memberProgress=" + memberProgress +
                ", memberRank=" + memberRank +
                '}';
    }
}
