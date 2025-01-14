package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.BattleUnitStateStat;
import hxasjc.swgoh.enums.UnitStat;

@SuppressWarnings("unused")
public class StatValueRange {
    private UnitStat stat;
    private BattleUnitStateStat battleStat;
    private StatValueRangeNumber min;
    private StatValueRangeNumber max;

    public UnitStat getStat() {
        return stat;
    }

    public BattleUnitStateStat getBattleStat() {
        return battleStat;
    }

    public StatValueRangeNumber getMin() {
        return min;
    }

    public StatValueRangeNumber getMax() {
        return max;
    }

    @Override
    public String toString() {
        return "StatValueRange{" +
                "stat=" + stat +
                ", battleStat=" + battleStat +
                ", min=" + min +
                ", max=" + max +
                '}';
    }
}
