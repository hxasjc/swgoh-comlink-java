package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class TerritoryWarParticipant {
    private String memberId;
    private long joinTime;
    private boolean eligible;
    private int power;

    public String getMemberId() {
        return memberId;
    }

    public long getJoinTime() {
        return joinTime;
    }

    public boolean isEligible() {
        return eligible;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "TerritoryWarParticipant{" +
                "memberId='" + memberId + '\'' +
                ", joinTime=" + joinTime +
                ", eligible=" + eligible +
                ", power=" + power +
                '}';
    }
}
