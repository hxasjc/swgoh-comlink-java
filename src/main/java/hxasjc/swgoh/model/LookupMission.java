package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class LookupMission {
    private CampaignElementIdentifier missionIdentifier;
    private String[] requirementIds;

    public CampaignElementIdentifier getMissionIdentifier() {
        return missionIdentifier;
    }

    public String[] getRequirementIds() {
        return requirementIds;
    }

    @Override
    public String toString() {
        return "LookupMission{" +
                "missionIdentifier=" + missionIdentifier +
                ", requirementIds=" + Arrays.toString(requirementIds) +
                '}';
    }
}
