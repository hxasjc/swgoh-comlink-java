package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.*;

import java.util.Arrays;

@SuppressWarnings("unused")
public class GameEvent {
    private String id;
    private int priority;
    private String nameKey;
    private String summaryKey;
    private String descKey;
    private String image;
    private GameEventType type;
    private GameEventInstance[] instance;
    private GameEventStatus status;
    private CampaignElementIdentifier campaignElementIdentifier;
    private SquadType squadType;
    private String previewKey;
    private String reviewKey;
    private GameEventUiLocation uiLocation;
    private String icon;
    private boolean defensiveSquadUsageCostEnabled;
    private ContextualMessageType[] encounterMessage;
    private Environment[] environment;
    private String descKeyUnitCriteriaMet;
    private SquadType defensiveSquadType;
    private CombatType combatType;
    private String imageEffect;
    private String unlockRequirementLocalizationKey;
    private String territoryMapId;
    private String pushNotificationTitleKey;
    private String pushNotificationDescKey;
    private String seasonDefId;
    private String unlockRequirementId;
    private Feat[] feat;
    private String[] linkedStoreItemId;
    private String factionImage;
    private GameEventDetailsType detailsType;
    private String conquestId;
    private RankRewardPreview[] rankRewardPreview;
    private String iconJoin;
    private String iconSetDefense;
    private String iconAttack;

    public String getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String getSummaryKey() {
        return summaryKey;
    }

    public String getDescKey() {
        return descKey;
    }

    public String getImage() {
        return image;
    }

    public GameEventType getType() {
        return type;
    }

    public GameEventInstance[] getInstance() {
        return instance;
    }

    public GameEventStatus getStatus() {
        return status;
    }

    public CampaignElementIdentifier getCampaignElementIdentifier() {
        return campaignElementIdentifier;
    }

    public SquadType getSquadType() {
        return squadType;
    }

    public String getPreviewKey() {
        return previewKey;
    }

    public String getReviewKey() {
        return reviewKey;
    }

    public GameEventUiLocation getUiLocation() {
        return uiLocation;
    }

    public String getIcon() {
        return icon;
    }

    public boolean isDefensiveSquadUsageCostEnabled() {
        return defensiveSquadUsageCostEnabled;
    }

    public ContextualMessageType[] getEncounterMessage() {
        return encounterMessage;
    }

    public Environment[] getEnvironment() {
        return environment;
    }

    public String getDescKeyUnitCriteriaMet() {
        return descKeyUnitCriteriaMet;
    }

    public SquadType getDefensiveSquadType() {
        return defensiveSquadType;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public String getImageEffect() {
        return imageEffect;
    }

    public String getUnlockRequirementLocalizationKey() {
        return unlockRequirementLocalizationKey;
    }

    public String getTerritoryMapId() {
        return territoryMapId;
    }

    public String getPushNotificationTitleKey() {
        return pushNotificationTitleKey;
    }

    public String getPushNotificationDescKey() {
        return pushNotificationDescKey;
    }

    public String getSeasonDefId() {
        return seasonDefId;
    }

    public String getUnlockRequirementId() {
        return unlockRequirementId;
    }

    public Feat[] getFeat() {
        return feat;
    }

    public String[] getLinkedStoreItemId() {
        return linkedStoreItemId;
    }

    public String getFactionImage() {
        return factionImage;
    }

    public GameEventDetailsType getDetailsType() {
        return detailsType;
    }

    public String getConquestId() {
        return conquestId;
    }

    public RankRewardPreview[] getRankRewardPreview() {
        return rankRewardPreview;
    }

    public String getIconJoin() {
        return iconJoin;
    }

    public String getIconSetDefense() {
        return iconSetDefense;
    }

    public String getIconAttack() {
        return iconAttack;
    }

    @Override
    public String toString() {
        return "GameEvent{" +
                "id='" + id + '\'' +
                ", priority=" + priority +
                ", nameKey='" + nameKey + '\'' +
                ", summaryKey='" + summaryKey + '\'' +
                ", descKey='" + descKey + '\'' +
                ", image='" + image + '\'' +
                ", type=" + type +
                ", instance=" + Arrays.toString(instance) +
                ", status=" + status +
                ", campaignElementIdentifier=" + campaignElementIdentifier +
                ", squadType=" + squadType +
                ", previewKey='" + previewKey + '\'' +
                ", reviewKey='" + reviewKey + '\'' +
                ", uiLocation=" + uiLocation +
                ", icon='" + icon + '\'' +
                ", defensiveSquadUsageCostEnabled=" + defensiveSquadUsageCostEnabled +
                ", encounterMessage=" + Arrays.toString(encounterMessage) +
                ", environment=" + Arrays.toString(environment) +
                ", descKeyUnitCriteriaMet='" + descKeyUnitCriteriaMet + '\'' +
                ", defensiveSquadType=" + defensiveSquadType +
                ", combatType=" + combatType +
                ", imageEffect='" + imageEffect + '\'' +
                ", unlockRequirementLocalizationKey='" + unlockRequirementLocalizationKey + '\'' +
                ", territoryMapId='" + territoryMapId + '\'' +
                ", pushNotificationTitleKey='" + pushNotificationTitleKey + '\'' +
                ", pushNotificationDescKey='" + pushNotificationDescKey + '\'' +
                ", seasonDefId='" + seasonDefId + '\'' +
                ", unlockRequirementId='" + unlockRequirementId + '\'' +
                ", feat=" + Arrays.toString(feat) +
                ", linkedStoreItemId=" + Arrays.toString(linkedStoreItemId) +
                ", factionImage='" + factionImage + '\'' +
                ", detailsType=" + detailsType +
                ", conquestId='" + conquestId + '\'' +
                ", rankRewardPreview=" + Arrays.toString(rankRewardPreview) +
                ", iconJoin='" + iconJoin + '\'' +
                ", iconSetDefense='" + iconSetDefense + '\'' +
                ", iconAttack='" + iconAttack + '\'' +
                '}';
    }
}
