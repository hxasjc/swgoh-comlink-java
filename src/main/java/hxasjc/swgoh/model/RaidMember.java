package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class RaidMember {
    private String playerId;
    private long memberProgress;
    private int memberRank;
    private int memberAttempt;

    public String getPlayerId() {
        return playerId;
    }

    public long getMemberProgress() {
        return memberProgress;
    }

    public int getMemberRank() {
        return memberRank;
    }

    public int getMemberAttempt() {
        return memberAttempt;
    }

    @Override
    public String toString() {
        return "RaidMember{" +
                "playerId='" + playerId + '\'' +
                ", memberProgress=" + memberProgress +
                ", memberRank=" + memberRank +
                ", memberAttempt=" + memberAttempt +
                '}';
    }
}
