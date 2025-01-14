package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class PlayerRankStatus {
    private String leagueId;
    private int divisionId;

    public String getLeagueId() {
        return leagueId;
    }

    public int getDivisionId() {
        return divisionId;
    }

    @Override
    public String toString() {
        return "PlayerRankStatus{" +
                "leagueId='" + leagueId + '\'' +
                ", divisionId=" + divisionId +
                '}';
    }
}
