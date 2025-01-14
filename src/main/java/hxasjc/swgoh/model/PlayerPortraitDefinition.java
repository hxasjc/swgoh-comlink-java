package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class PlayerPortraitDefinition {
    private String id;
    private String nameKey;
    private String descKey;
    private boolean obtainable;
    private boolean hidden;
    private String icon;

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

    public String getIcon() {
        return icon;
    }

    @Override
    public String toString() {
        return "PlayerPortraitDefinition{" +
                "id='" + id + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", descKey='" + descKey + '\'' +
                ", obtainable=" + obtainable +
                ", hidden=" + hidden +
                ", icon='" + icon + '\'' +
                '}';
    }
}
