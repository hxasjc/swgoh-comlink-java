package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class TerritoryRewardBracket {
    private int victoryPointReward;
    private long galacticScoreRequirement;
    private TerritoryReward reward;

    public int getVictoryPointReward() {
        return victoryPointReward;
    }

    public long getGalacticScoreRequirement() {
        return galacticScoreRequirement;
    }

    public TerritoryReward getReward() {
        return reward;
    }

    @Override
    public String toString() {
        return "TerritoryRewardBracket{" +
                "victoryPointReward=" + victoryPointReward +
                ", galacticScoreRequirement=" + galacticScoreRequirement +
                ", reward=" + reward +
                '}';
    }
}
