package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.UnitStat;

import java.util.Arrays;

@SuppressWarnings("unused")
public class ModRecommendation {
    private String id;
    private ModRecommendationSetBonus[] setRecommendation;
    private ModRecommendationPrimaryStat[] primaryStatRecommendation;
    private UnitStat[] secondaryStatRecommendation;
    private String tipKey;

    public String getId() {
        return id;
    }

    public ModRecommendationSetBonus[] getSetRecommendation() {
        return setRecommendation;
    }

    public ModRecommendationPrimaryStat[] getPrimaryStatRecommendation() {
        return primaryStatRecommendation;
    }

    public UnitStat[] getSecondaryStatRecommendation() {
        return secondaryStatRecommendation;
    }

    public String getTipKey() {
        return tipKey;
    }

    @Override
    public String toString() {
        return "ModRecommendation{" +
                "id='" + id + '\'' +
                ", setRecommendation=" + Arrays.toString(setRecommendation) +
                ", primaryStatRecommendation=" + Arrays.toString(primaryStatRecommendation) +
                ", secondaryStatRecommendation=" + Arrays.toString(secondaryStatRecommendation) +
                ", tipKey='" + tipKey + '\'' +
                '}';
    }
}
