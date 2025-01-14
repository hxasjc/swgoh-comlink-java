package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class SeasonRewardTableRow {
    private SeasonRewardTableKey key;
    private BucketItem[] primaryReward;
    private BucketItem[] detailedReward;

    public SeasonRewardTableKey getKey() {
        return key;
    }

    public BucketItem[] getPrimaryReward() {
        return primaryReward;
    }

    public BucketItem[] getDetailedReward() {
        return detailedReward;
    }

    @Override
    public String toString() {
        return "SeasonRewardTableRow{" +
                "key=" + key +
                ", primaryReward=" + Arrays.toString(primaryReward) +
                ", detailedReward=" + Arrays.toString(detailedReward) +
                '}';
    }
}
