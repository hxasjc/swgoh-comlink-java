package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class SeasonStatus {
    private String seasonId;
    private String eventInstanceId;
    private String league;
    private int wins;
    private int losses;
    private int seasonPoints;
    private int division;
    private long joinTime;
    private long endTime;
    private boolean remove;
    private int rank;

    public String getSeasonId() {
        return seasonId;
    }

    public String getEventInstanceId() {
        return eventInstanceId;
    }

    public String getLeague() {
        return league;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getSeasonPoints() {
        return seasonPoints;
    }

    public int getDivision() {
        return division;
    }

    public long getJoinTime() {
        return joinTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public boolean isRemove() {
        return remove;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "SeasonStatus{" +
                "seasonId='" + seasonId + '\'' +
                ", eventInstanceId='" + eventInstanceId + '\'' +
                ", league='" + league + '\'' +
                ", wins=" + wins +
                ", losses=" + losses +
                ", seasonPoints=" + seasonPoints +
                ", division=" + division +
                ", joinTime=" + joinTime +
                ", endTime=" + endTime +
                ", remove=" + remove +
                ", rank=" + rank +
                '}';
    }
}
