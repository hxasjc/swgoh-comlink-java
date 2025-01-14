package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.UnitGuideActivityType;

@SuppressWarnings("unused")
public class UnitGuideDefinition {
    private String unitBaseId;
    private UnitGuideActivityType type;
    private String activityId;
    private String descriptionKey;
    private String recommendationRequirementId;
    private String overrideTexture;
    private String titleKey;
    private String subtitleKey;
    private String additionalActivationRequirementId;
    private boolean displayEnabled;
    private String actionLinkImage;
    private String actionLink;
    private boolean inPreview;
    private int hiddenUnitCount;
    private String previewArtImage;
    private String upcomingEventKey;
    private boolean featured;
    private CampaignElementIdentifier campaignElementIdentifier;
    private EntryCategoryAllowed characterRecommendedEntryCategory;
    private EntryCategoryAllowed shipRecommendedEntryCategory;
    private boolean galacticLegend;
    private String bannerImage;
    private String bannerImageSubtextKey;
    private String unitStagePrefab;

    public String getUnitBaseId() {
        return unitBaseId;
    }

    public UnitGuideActivityType getType() {
        return type;
    }

    public String getActivityId() {
        return activityId;
    }

    public String getDescriptionKey() {
        return descriptionKey;
    }

    public String getRecommendationRequirementId() {
        return recommendationRequirementId;
    }

    public String getOverrideTexture() {
        return overrideTexture;
    }

    public String getTitleKey() {
        return titleKey;
    }

    public String getSubtitleKey() {
        return subtitleKey;
    }

    public String getAdditionalActivationRequirementId() {
        return additionalActivationRequirementId;
    }

    public boolean isDisplayEnabled() {
        return displayEnabled;
    }

    public String getActionLinkImage() {
        return actionLinkImage;
    }

    public String getActionLink() {
        return actionLink;
    }

    public boolean isInPreview() {
        return inPreview;
    }

    public int getHiddenUnitCount() {
        return hiddenUnitCount;
    }

    public String getPreviewArtImage() {
        return previewArtImage;
    }

    public String getUpcomingEventKey() {
        return upcomingEventKey;
    }

    public boolean isFeatured() {
        return featured;
    }

    public CampaignElementIdentifier getCampaignElementIdentifier() {
        return campaignElementIdentifier;
    }

    public EntryCategoryAllowed getCharacterRecommendedEntryCategory() {
        return characterRecommendedEntryCategory;
    }

    public EntryCategoryAllowed getShipRecommendedEntryCategory() {
        return shipRecommendedEntryCategory;
    }

    public boolean isGalacticLegend() {
        return galacticLegend;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public String getBannerImageSubtextKey() {
        return bannerImageSubtextKey;
    }

    public String getUnitStagePrefab() {
        return unitStagePrefab;
    }

    @Override
    public String toString() {
        return "UnitGuideDefinition{" +
                "unitBaseId='" + unitBaseId + '\'' +
                ", type=" + type +
                ", activityId='" + activityId + '\'' +
                ", descriptionKey='" + descriptionKey + '\'' +
                ", recommendationRequirementId='" + recommendationRequirementId + '\'' +
                ", overrideTexture='" + overrideTexture + '\'' +
                ", titleKey='" + titleKey + '\'' +
                ", subtitleKey='" + subtitleKey + '\'' +
                ", additionalActivationRequirementId='" + additionalActivationRequirementId + '\'' +
                ", displayEnabled=" + displayEnabled +
                ", actionLinkImage='" + actionLinkImage + '\'' +
                ", actionLink='" + actionLink + '\'' +
                ", inPreview=" + inPreview +
                ", hiddenUnitCount=" + hiddenUnitCount +
                ", previewArtImage='" + previewArtImage + '\'' +
                ", upcomingEventKey='" + upcomingEventKey + '\'' +
                ", featured=" + featured +
                ", campaignElementIdentifier=" + campaignElementIdentifier +
                ", characterRecommendedEntryCategory=" + characterRecommendedEntryCategory +
                ", shipRecommendedEntryCategory=" + shipRecommendedEntryCategory +
                ", galacticLegend=" + galacticLegend +
                ", bannerImage='" + bannerImage + '\'' +
                ", bannerImageSubtextKey='" + bannerImageSubtextKey + '\'' +
                ", unitStagePrefab='" + unitStagePrefab + '\'' +
                '}';
    }
}
