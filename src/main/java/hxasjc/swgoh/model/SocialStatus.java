package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class SocialStatus {
    private SocialStatusIcon[] chatIcons;
    private SocialStatusTitle[] chatTitles;
    private SocialStatusGuildBannerLogo[] guildLogo;
    private SocialStatusGuildBannerColor[] guildColor;
    private SocialStatusPortrait[] chatPortraits;

    public SocialStatusIcon[] getChatIcons() {
        return chatIcons;
    }

    public SocialStatusTitle[] getChatTitles() {
        return chatTitles;
    }

    public SocialStatusGuildBannerLogo[] getGuildLogo() {
        return guildLogo;
    }

    public SocialStatusGuildBannerColor[] getGuildColor() {
        return guildColor;
    }

    public SocialStatusPortrait[] getChatPortraits() {
        return chatPortraits;
    }

    @Override
    public String toString() {
        return "SocialStatus{" +
                "chatIcons=" + Arrays.toString(chatIcons) +
                ", chatTitles=" + Arrays.toString(chatTitles) +
                ", guildLogo=" + Arrays.toString(guildLogo) +
                ", guildColor=" + Arrays.toString(guildColor) +
                ", chatPortraits=" + Arrays.toString(chatPortraits) +
                '}';
    }
}
