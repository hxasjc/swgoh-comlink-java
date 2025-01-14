package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class TerritoryGuildProfile {
    private String id;
    private String name;
    private String logoBackground;
    private String bannerColorId;
    private String bannerLogoId;
    private long guildGalacticPower;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLogoBackground() {
        return logoBackground;
    }

    public String getBannerColorId() {
        return bannerColorId;
    }

    public String getBannerLogoId() {
        return bannerLogoId;
    }

    public long getGuildGalacticPower() {
        return guildGalacticPower;
    }

    @Override
    public String toString() {
        return "TerritoryGuildProfile{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", logoBackground='" + logoBackground + '\'' +
                ", bannerColorId='" + bannerColorId + '\'' +
                ", bannerLogoId='" + bannerLogoId + '\'' +
                ", guildGalacticPower=" + guildGalacticPower +
                '}';
    }
}
