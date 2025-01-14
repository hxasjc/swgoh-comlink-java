package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class EventBonus {
    private String id;
    private String nameKey;
    private String descKey;
    private String iconKey;
    private double scoreModifier;

    public String getId() {
        return id;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String getDescKey() {
        return descKey;
    }

    public String getIconKey() {
        return iconKey;
    }

    public double getScoreModifier() {
        return scoreModifier;
    }

    @Override
    public String toString() {
        return "EventBonus{" +
                "id='" + id + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", descKey='" + descKey + '\'' +
                ", iconKey='" + iconKey + '\'' +
                ", scoreModifier=" + scoreModifier +
                '}';
    }
}
