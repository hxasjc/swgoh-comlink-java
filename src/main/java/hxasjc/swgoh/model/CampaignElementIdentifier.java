package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.CampaignNodeDifficulty;

@SuppressWarnings("unused")
public class CampaignElementIdentifier {
    private String campaignId;
    private String campaignMapId;
    private String campaignNodeId;
    private CampaignNodeDifficulty campaignNodeDifficulty;
    private String campaignMissionId;

    public String getCampaignId() {
        return campaignId;
    }

    public String getCampaignMapId() {
        return campaignMapId;
    }

    public String getCampaignNodeId() {
        return campaignNodeId;
    }

    public CampaignNodeDifficulty getCampaignNodeDifficulty() {
        return campaignNodeDifficulty;
    }

    public String getCampaignMissionId() {
        return campaignMissionId;
    }

    @Override
    public String toString() {
        return "CampaignElementIdentifier{" +
                "campaignId='" + campaignId + '\'' +
                ", campaignMapId='" + campaignMapId + '\'' +
                ", campaignNodeId='" + campaignNodeId + '\'' +
                ", campaignNodeDifficulty=" + campaignNodeDifficulty +
                ", campaignMissionId='" + campaignMissionId + '\'' +
                '}';
    }
}
