package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.TerritoryRewardType;

@SuppressWarnings("unused")
public class TerritoryReward {
    private TerritoryRewardType type;
    private long value;
    private String rewardId;

    public TerritoryRewardType getType() {
        return type;
    }

    public long getValue() {
        return value;
    }

    public String getRewardId() {
        return rewardId;
    }

    @Override
    public String toString() {
        return "TerritoryReward{" +
                "type=" + type +
                ", value=" + value +
                ", rewardId='" + rewardId + '\'' +
                '}';
    }
}
