package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.UnitTier;

@SuppressWarnings("unused")
public class PowerUpBundle {
    private String id;
    private int targetLevel;
    private UnitTier targetGearTier;
    private boolean autoSelectTier;

    public String getId() {
        return id;
    }

    public int getTargetLevel() {
        return targetLevel;
    }

    public UnitTier getTargetGearTier() {
        return targetGearTier;
    }

    public boolean isAutoSelectTier() {
        return autoSelectTier;
    }

    @Override
    public String toString() {
        return "PowerUpBundle{" +
                "id='" + id + '\'' +
                ", targetLevel=" + targetLevel +
                ", targetGearTier=" + targetGearTier +
                ", autoSelectTier=" + autoSelectTier +
                '}';
    }
}
