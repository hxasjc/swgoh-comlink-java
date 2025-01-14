package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.RelicTier;
import hxasjc.swgoh.enums.UnitTier;

@SuppressWarnings("unused")
public class TerritoryReconZoneUnit {
    private String unitIdentifier;
    private int level;
    private String memberId;
    private UnitTier tier;
    private RelicTier unitRelicTier;

    public String getUnitIdentifier() {
        return unitIdentifier;
    }

    public int getLevel() {
        return level;
    }

    public String getMemberId() {
        return memberId;
    }

    public UnitTier getTier() {
        return tier;
    }

    public RelicTier getUnitRelicTier() {
        return unitRelicTier;
    }

    @Override
    public String toString() {
        return "TerritoryReconZoneUnit{" +
                "unitIdentifier='" + unitIdentifier + '\'' +
                ", level=" + level +
                ", memberId='" + memberId + '\'' +
                ", tier=" + tier +
                ", unitRelicTier=" + unitRelicTier +
                '}';
    }
}
