package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class GuildBannerDef {
    private String[] logo;
    private GuildBannerColorDef[] color;
    private GuildBannerLogoDef[] logoDefinition;

    public String[] getLogo() {
        return logo;
    }

    public GuildBannerColorDef[] getColor() {
        return color;
    }

    public GuildBannerLogoDef[] getLogoDefinition() {
        return logoDefinition;
    }

    @Override
    public String toString() {
        return "GuildBannerDef{" +
                "logo=" + Arrays.toString(logo) +
                ", color=" + Arrays.toString(color) +
                ", logoDefinition=" + Arrays.toString(logoDefinition) +
                '}';
    }
}
