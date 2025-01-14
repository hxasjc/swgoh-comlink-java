package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class LeagueDivisionRewardPreview {
    private int division;
    private BucketItem[] primaryReward;
    private BucketItem[] detailedReward;

    public int getDivision() {
        return division;
    }

    public BucketItem[] getPrimaryReward() {
        return primaryReward;
    }

    public BucketItem[] getDetailedReward() {
        return detailedReward;
    }

    @Override
    public String toString() {
        return "LeagueDivisionRewardPreview{" +
                "division=" + division +
                ", primaryReward=" + Arrays.toString(primaryReward) +
                ", detailedReward=" + Arrays.toString(detailedReward) +
                '}';
    }
}
