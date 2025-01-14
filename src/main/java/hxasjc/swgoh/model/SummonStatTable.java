package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.Rarity;

@SuppressWarnings("unused")
public class SummonStatTable {
    private Rarity rarity;
    private String statTable;

    public Rarity getRarity() {
        return rarity;
    }

    public String getStatTable() {
        return statTable;
    }

    @Override
    public String toString() {
        return "SummonStatTable{" +
                "rarity=" + rarity +
                ", statTable='" + statTable + '\'' +
                '}';
    }
}
