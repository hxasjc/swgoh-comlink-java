package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.RelicTier;
import hxasjc.swgoh.enums.UnitTier;

@SuppressWarnings("unused")
public class UnitTierSummary {
    private String baseId;
    private UnitTier tier;
    private RelicTier unitRelicTier;

    public String getBaseId() {
        return baseId;
    }

    public UnitTier getTier() {
        return tier;
    }

    public RelicTier getUnitRelicTier() {
        return unitRelicTier;
    }

    @Override
    public String toString() {
        return "UnitTierSummary{" +
                "baseId='" + baseId + '\'' +
                ", tier=" + tier +
                ", unitRelicTier=" + unitRelicTier +
                '}';
    }
}
