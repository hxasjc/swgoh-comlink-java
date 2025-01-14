package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class ModRecommendationSetBonus {
    private String modSetId;
    private int quantity;

    public String getModSetId() {
        return modSetId;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ModRecommendationSetBonus{" +
                "modSetId='" + modSetId + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
