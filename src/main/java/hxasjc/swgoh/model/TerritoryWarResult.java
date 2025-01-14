package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class TerritoryWarResult {
    private String territoryWarId;
    private long score;
    private int power;
    private long opponentScore;
    private long endTimeSeconds;

    public String getTerritoryWarId() {
        return territoryWarId;
    }

    public long getScore() {
        return score;
    }

    public int getPower() {
        return power;
    }

    public long getOpponentScore() {
        return opponentScore;
    }

    public long getEndTimeSeconds() {
        return endTimeSeconds;
    }

    @Override
    public String toString() {
        return "TerritoryWarResult{" +
                "territoryWarId='" + territoryWarId + '\'' +
                ", score=" + score +
                ", power=" + power +
                ", opponentScore=" + opponentScore +
                ", endTimeSeconds=" + endTimeSeconds +
                '}';
    }
}
