package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.UnitStat;

@SuppressWarnings("unused")
public class Stat {
    private UnitStat unitStatId;
    private long statValueDecimal;
    private long unscaledDecimalValue;
    private long uiDisplayOverrideValue;
    private long scalar;

    public UnitStat getUnitStatId() {
        return unitStatId;
    }

    public long getStatValueDecimal() {
        return statValueDecimal;
    }

    public long getUnscaledDecimalValue() {
        return unscaledDecimalValue;
    }

    public long getUiDisplayOverrideValue() {
        return uiDisplayOverrideValue;
    }

    public long getScalar() {
        return scalar;
    }

    @Override
    public String toString() {
        return "Stat{" +
                "unitStatId=" + unitStatId +
                ", statValueDecimal=" + statValueDecimal +
                ", unscaledDecimalValue=" + unscaledDecimalValue +
                ", uiDisplayOverrideValue=" + uiDisplayOverrideValue +
                ", scalar=" + scalar +
                '}';
    }
}
