package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.RelicTier;

@SuppressWarnings("unused")
public class RelicTierDefinition {
    private String id;
    private StatDef stat;
    private String relicStatTable;
    private RelicTier tier;

    public String getId() {
        return id;
    }

    public StatDef getStat() {
        return stat;
    }

    public String getRelicStatTable() {
        return relicStatTable;
    }

    public RelicTier getTier() {
        return tier;
    }

    @Override
    public String toString() {
        return "RelicTierDefinition{" +
                "id='" + id + '\'' +
                ", stat=" + stat +
                ", relicStatTable='" + relicStatTable + '\'' +
                ", tier=" + tier +
                '}';
    }
}
