package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class PlayerTitleDefinition {
    private String id;
    private String nameKey;
    private String descKey;
    private boolean obtainable;
    private boolean hidden;
    private String shortDescKey;

    public String getId() {
        return id;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String getDescKey() {
        return descKey;
    }

    public boolean isObtainable() {
        return obtainable;
    }

    public boolean isHidden() {
        return hidden;
    }

    public String getShortDescKey() {
        return shortDescKey;
    }

    @Override
    public String toString() {
        return "PlayerTitleDefinition{" +
                "id='" + id + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", descKey='" + descKey + '\'' +
                ", obtainable=" + obtainable +
                ", hidden=" + hidden +
                ", shortDescKey='" + shortDescKey + '\'' +
                '}';
    }
}
