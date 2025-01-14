package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class CachedRaidRewards {
    private RankRewardPreview[] rankRewardPreview;
    private RankRewardPreview[] immediateRegularRankRewardPreview;

    public RankRewardPreview[] getRankRewardPreview() {
        return rankRewardPreview;
    }

    public RankRewardPreview[] getImmediateRegularRankRewardPreview() {
        return immediateRegularRankRewardPreview;
    }

    @Override
    public String toString() {
        return "CachedRaidRewards{" +
                "rankRewardPreview=" + Arrays.toString(rankRewardPreview) +
                ", immediateRegularRankRewardPreview=" + Arrays.toString(immediateRegularRankRewardPreview) +
                '}';
    }
}
