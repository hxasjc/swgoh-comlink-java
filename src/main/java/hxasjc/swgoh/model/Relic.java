package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.RelicTier;

@SuppressWarnings("unused")
public class Relic {
    private RelicTier currentTier;

    public RelicTier getCurrentTier() {
        return currentTier;
    }

    @Override
    public String toString() {
        return "Relic{" +
                "currentTier=" + currentTier +
                '}';
    }
}
