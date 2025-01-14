package testing;

import hxasjc.swgoh.Comlink;
import hxasjc.swgoh.ComlinkBuilder;
import hxasjc.swgoh.model.*;

import java.net.URL;
import java.util.NoSuchElementException;

public class CommonUtil {
    public static Campaign getCampaign(GameData gameData, CampaignElementIdentifier campaignElementIdentifier) {
        for (Campaign campaign : gameData.getCampaign()) {
            if (campaign.getId().equals(campaignElementIdentifier.getCampaignId())) {
                return campaign;
            }
        }

        throw new NoSuchElementException(); // TODO: 2025-01-12 more specific error message
    }

    public static CampaignMap getCampaignMap(GameData gameData, CampaignElementIdentifier campaignElementIdentifier) {
        for (CampaignMap map : getCampaign(gameData, campaignElementIdentifier).getCampaignMap()) {
            if (map.getId().equals(campaignElementIdentifier.getCampaignMapId())) {
                return map;
            }
        }

        throw new NoSuchElementException(); // TODO: 2025-01-12 more specific error message
    }

    public static CampaignNodeDifficultyGroup getCampaignNodeDifficultyGroup(GameData gameData, CampaignElementIdentifier campaignElementIdentifier) {
        for (CampaignNodeDifficultyGroup nodeDifficultyGroup : getCampaignMap(gameData, campaignElementIdentifier).getCampaignNodeDifficultyGroup()) {
            if (nodeDifficultyGroup.getCampaignNodeDifficulty().equals(campaignElementIdentifier.getCampaignNodeDifficulty())) {
                return nodeDifficultyGroup;
            }
        }

        throw new NoSuchElementException(); // TODO: 2025-01-12 more specific error message
    }

    public static CampaignNode getCampaignNode(GameData gameData, CampaignElementIdentifier campaignElementIdentifier) {
        for (CampaignNode node : getCampaignNodeDifficultyGroup(gameData, campaignElementIdentifier).getCampaignNode()) {
            if (node.getId().equals(campaignElementIdentifier.getCampaignNodeId())) {
                return node;
            }
        }

        throw new NoSuchElementException(); // TODO: 2025-01-12 more specific error message
    }

    public static CampaignNodeMission getCampaignNodeMission(GameData gameData, CampaignElementIdentifier campaignElementIdentifier) {
        for (CampaignNodeMission mission : getCampaignNode(gameData, campaignElementIdentifier).getCampaignNodeMission()) {
            if (mission.getId().equals(campaignElementIdentifier.getCampaignMissionId())) {
                return mission;
            }
        }

        throw new NoSuchElementException(); // TODO: 2025-01-12 more specific error message
    }
}
