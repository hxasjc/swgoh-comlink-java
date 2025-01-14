package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class SeasonDivisionSkillBoundary {
    private String leagueId;
    private int divisionId;
    private int minSkill;

    public String getLeagueId() {
        return leagueId;
    }

    public int getDivisionId() {
        return divisionId;
    }

    public int getMinSkill() {
        return minSkill;
    }

    @Override
    public String toString() {
        return "SeasonDivisionSkillBoundary{" +
                "leagueId='" + leagueId + '\'' +
                ", divisionId=" + divisionId +
                ", minSkill=" + minSkill +
                '}';
    }
}
