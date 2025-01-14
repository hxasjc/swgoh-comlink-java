package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class RankRewardPreview {
    private int rankStart;
    private int rankEnd;
    private BucketItem[] primaryReward;
    private BucketItem[] detailedReward;

    public int getRankStart() {
        return rankStart;
    }

    public int getRankEnd() {
        return rankEnd;
    }

    public BucketItem[] getPrimaryReward() {
        return primaryReward;
    }

    public BucketItem[] getDetailedReward() {
        return detailedReward;
    }

    @Override
    public String toString() {
        return "RankRewardPreview{" +
                "rankStart=" + rankStart +
                ", rankEnd=" + rankEnd +
                ", primaryReward=" + Arrays.toString(primaryReward) +
                ", detailedReward=" + Arrays.toString(detailedReward) +
                '}';
    }
}
