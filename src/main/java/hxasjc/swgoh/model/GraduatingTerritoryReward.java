package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class GraduatingTerritoryReward {
    private int defendNumber;
    private TerritoryReward reward;

    public int getDefendNumber() {
        return defendNumber;
    }

    public TerritoryReward getReward() {
        return reward;
    }

    @Override
    public String toString() {
        return "GraduatingTerritoryReward{" +
                "defendNumber=" + defendNumber +
                ", reward=" + reward +
                '}';
    }
}
