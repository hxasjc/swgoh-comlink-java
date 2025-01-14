package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.StatModSlot;
import hxasjc.swgoh.enums.UnitStat;

import java.util.Arrays;

@SuppressWarnings("unused")
public class ModRecommendationPrimaryStat {
    private StatModSlot slot;
    private UnitStat[] stat;

    public StatModSlot getSlot() {
        return slot;
    }

    public UnitStat[] getStat() {
        return stat;
    }

    @Override
    public String toString() {
        return "ModRecommendationPrimaryStat{" +
                "slot=" + slot +
                ", stat=" + Arrays.toString(stat) +
                '}';
    }
}
