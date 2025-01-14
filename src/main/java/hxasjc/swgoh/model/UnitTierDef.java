package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.UnitTier;

import java.util.Arrays;

@SuppressWarnings("unused")
public class UnitTierDef {
    private UnitTier tier;
    private String[] equipmentSet;
    private StatDef baseStat;

    public UnitTier getTier() {
        return tier;
    }

    public String[] getEquipmentSet() {
        return equipmentSet;
    }

    public StatDef getBaseStat() {
        return baseStat;
    }

    @Override
    public String toString() {
        return "UnitTierDef{" +
                "tier=" + tier +
                ", equipmentSet=" + Arrays.toString(equipmentSet) +
                ", baseStat=" + baseStat +
                '}';
    }
}
