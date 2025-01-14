package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.EnergyRewardInstanceType;

@SuppressWarnings("unused")
public class EnergyRewardInstance {
    private EnergyRewardInstanceType type;
    private int start;
    private int duration;
    private int amount;

    public EnergyRewardInstanceType getType() {
        return type;
    }

    public int getStart() {
        return start;
    }

    public int getDuration() {
        return duration;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "EnergyRewardInstance{" +
                "type=" + type +
                ", start=" + start +
                ", duration=" + duration +
                ", amount=" + amount +
                '}';
    }
}
