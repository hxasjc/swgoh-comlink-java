package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class GuildBannerColorDef {
    private String id;
    private String tintColor;
    private String backgroundColor;
    private boolean hidden;

    public String getId() {
        return id;
    }

    public String getTintColor() {
        return tintColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public boolean isHidden() {
        return hidden;
    }

    @Override
    public String toString() {
        return "GuildBannerColorDef{" +
                "id='" + id + '\'' +
                ", tintColor='" + tintColor + '\'' +
                ", backgroundColor='" + backgroundColor + '\'' +
                ", hidden=" + hidden +
                '}';
    }
}
