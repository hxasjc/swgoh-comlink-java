package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.ColorType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class CampaignNodeEncounter {
    private CampaignCinematic[] encounterCinematics;
    private Environment[] environment;
    private ContextualMessageGroup[] encounterMessage;
    private String audioKey;
    private boolean allowChanceMechanics;
    private ContextualMessageGroup[] firstTimeEncounterMessage;
    private String encounterIcon;
    private String encounterDescKey;
    private int encounterIconPosition;
    private ColorType raidProgressColor;
    private int maxDeployedSquadSize;
    private String environmentCollectionId;
    private String encounterId;
    private long encounterDurationLimit;
    private long scoreToComplete;
    private String detailDescKey;
    private long pointsToComplete;
    private String audioVictoryKey;
    private String[] displayableEnemyId;
    private String[] displayableGrantedAbility;

    public CampaignCinematic[] getEncounterCinematics() {
        return encounterCinematics;
    }

    public Environment[] getEnvironment() {
        return environment;
    }

    public ContextualMessageGroup[] getEncounterMessage() {
        return encounterMessage;
    }

    public String getAudioKey() {
        return audioKey;
    }

    public boolean isAllowChanceMechanics() {
        return allowChanceMechanics;
    }

    public ContextualMessageGroup[] getFirstTimeEncounterMessage() {
        return firstTimeEncounterMessage;
    }

    public String getEncounterIcon() {
        return encounterIcon;
    }

    public String getEncounterDescKey() {
        return encounterDescKey;
    }

    public int getEncounterIconPosition() {
        return encounterIconPosition;
    }

    public ColorType getRaidProgressColor() {
        return raidProgressColor;
    }

    public int getMaxDeployedSquadSize() {
        return maxDeployedSquadSize;
    }

    public String getEnvironmentCollectionId() {
        return environmentCollectionId;
    }

    public String getEncounterId() {
        return encounterId;
    }

    public long getEncounterDurationLimit() {
        return encounterDurationLimit;
    }

    public long getScoreToComplete() {
        return scoreToComplete;
    }

    public String getDetailDescKey() {
        return detailDescKey;
    }

    public long getPointsToComplete() {
        return pointsToComplete;
    }

    public String getAudioVictoryKey() {
        return audioVictoryKey;
    }

    public String[] getDisplayableEnemyId() {
        return displayableEnemyId;
    }

    public String[] getDisplayableGrantedAbility() {
        return displayableGrantedAbility;
    }

    @Override
    public String toString() {
        return "CampaignNodeEncounter{" +
                "encounterCinematics=" + Arrays.toString(encounterCinematics) +
                ", environment=" + Arrays.toString(environment) +
                ", encounterMessage=" + Arrays.toString(encounterMessage) +
                ", audioKey='" + audioKey + '\'' +
                ", allowChanceMechanics=" + allowChanceMechanics +
                ", firstTimeEncounterMessage=" + Arrays.toString(firstTimeEncounterMessage) +
                ", encounterIcon='" + encounterIcon + '\'' +
                ", encounterDescKey='" + encounterDescKey + '\'' +
                ", encounterIconPosition=" + encounterIconPosition +
                ", raidProgressColor=" + raidProgressColor +
                ", maxDeployedSquadSize=" + maxDeployedSquadSize +
                ", environmentCollectionId='" + environmentCollectionId + '\'' +
                ", encounterId='" + encounterId + '\'' +
                ", encounterDurationLimit=" + encounterDurationLimit +
                ", scoreToComplete=" + scoreToComplete +
                ", detailDescKey='" + detailDescKey + '\'' +
                ", pointsToComplete=" + pointsToComplete +
                ", audioVictoryKey='" + audioVictoryKey + '\'' +
                ", displayableEnemyId=" + Arrays.toString(displayableEnemyId) +
                ", displayableGrantedAbility=" + Arrays.toString(displayableGrantedAbility) +
                '}';
    }
}
