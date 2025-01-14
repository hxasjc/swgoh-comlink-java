package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.CampaignElementProgress;

@SuppressWarnings("unused")
public class GuildRaidProgress {
    private CampaignElementIdentifier identifier;
    private CampaignElementProgress progress;
    private int winCount;

    public CampaignElementIdentifier getIdentifier() {
        return identifier;
    }

    public CampaignElementProgress getProgress() {
        return progress;
    }

    public int getWinCount() {
        return winCount;
    }

    @Override
    public String toString() {
        return "GuildRaidProgress{" +
                "identifier=" + identifier +
                ", progress=" + progress +
                ", winCount=" + winCount +
                '}';
    }
}
