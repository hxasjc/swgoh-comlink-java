package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.UnitTier;

@SuppressWarnings("unused")
public class UnitModRecommendations {
    private String recommendationSetId;
    private UnitTier unitTier;

    public String getRecommendationSetId() {
        return recommendationSetId;
    }

    public UnitTier getUnitTier() {
        return unitTier;
    }

    @Override
    public String toString() {
        return "UnitModRecommendations{" +
                "recommendationSetId='" + recommendationSetId + '\'' +
                ", unitTier=" + unitTier +
                '}';
    }
}
