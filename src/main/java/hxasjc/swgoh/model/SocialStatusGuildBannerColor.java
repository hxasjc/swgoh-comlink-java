package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class SocialStatusGuildBannerColor {
    private int id;
    private String guildBannerColorId;

    public int getId() {
        return id;
    }

    public String getGuildBannerColorId() {
        return guildBannerColorId;
    }

    @Override
    public String toString() {
        return "SocialStatusGuildBannerColor{" +
                "id=" + id +
                ", guildBannerColorId='" + guildBannerColorId + '\'' +
                '}';
    }
}
