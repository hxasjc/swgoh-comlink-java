package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class SocialStatusGuildBannerLogo {
    private int id;
    private String guildBannerLogoId;

    public int getId() {
        return id;
    }

    public String getGuildBannerLogoId() {
        return guildBannerLogoId;
    }

    @Override
    public String toString() {
        return "SocialStatusGuildBannerLogo{" +
                "id=" + id +
                ", guildBannerLogoId='" + guildBannerLogoId + '\'' +
                '}';
    }
}
