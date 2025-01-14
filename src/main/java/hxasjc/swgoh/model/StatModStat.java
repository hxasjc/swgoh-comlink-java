package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class StatModStat {
    private Stat stat;
    private String[] roll;
    private int statRolls;
    private long statRollerBoundsMin;
    private long statRollerBoundsMax;
    private long[] unscaledRollValue;

    public Stat getStat() {
        return stat;
    }

    public String[] getRoll() {
        return roll;
    }

    public int getStatRolls() {
        return statRolls;
    }

    public long getStatRollerBoundsMin() {
        return statRollerBoundsMin;
    }

    public long getStatRollerBoundsMax() {
        return statRollerBoundsMax;
    }

    public long[] getUnscaledRollValue() {
        return unscaledRollValue;
    }

    @Override
    public String toString() {
        return "StatModStat{" +
                "stat=" + stat +
                ", roll=" + Arrays.toString(roll) +
                ", statRolls=" + statRolls +
                ", statRollerBoundsMin=" + statRollerBoundsMin +
                ", statRollerBoundsMax=" + statRollerBoundsMax +
                ", unscaledRollValue=" + Arrays.toString(unscaledRollValue) +
                '}';
    }
}
