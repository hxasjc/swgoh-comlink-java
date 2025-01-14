package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class SeasonRewardTableKey {
    private int league;
    private int division;
    private int rank;

    public int getLeague() {
        return league;
    }

    public int getDivision() {
        return division;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "SeasonRewardTableKey{" +
                "league=" + league +
                ", division=" + division +
                ", rank=" + rank +
                '}';
    }
}
