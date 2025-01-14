package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class GuildBannerLogoDef {
    private String id;
    private String logo;
    private String uiLogo;
    private boolean hidden;

    public String getId() {
        return id;
    }

    public String getLogo() {
        return logo;
    }

    public String getUiLogo() {
        return uiLogo;
    }

    public boolean isHidden() {
        return hidden;
    }

    @Override
    public String toString() {
        return "GuildBannerLogoDef{" +
                "id='" + id + '\'' +
                ", logo='" + logo + '\'' +
                ", uiLogo='" + uiLogo + '\'' +
                ", hidden=" + hidden +
                '}';
    }
}
