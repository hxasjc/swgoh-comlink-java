package hxasjc.swgoh.model;

import hxasjc.swgoh.model.CampaignElementIdentifier;

@SuppressWarnings("unused")
public class GuildRaidPointsSummary {
    private CampaignElementIdentifier identifier;
    private long totalPoints;

    public CampaignElementIdentifier getIdentifier() {
        return identifier;
    }

    public long getTotalPoints() {
        return totalPoints;
    }

    @Override
    public String toString() {
        return "GuildRaidPointsSummary{" +
                "identifier=" + identifier +
                ", totalPoints=" + totalPoints +
                '}';
    }
}
