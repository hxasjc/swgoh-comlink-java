package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryTournamentDefinition {
    private String id;
    private String nameKey;
    private String descriptionKey;
    private String prefabName;
    private String iconPrefab;
    private String detailImage;
    private String territoryCategory;
    private String minimapPrefab;
    private int roundCOunt;
    private int roundTallyDefinition;
    private int matchmakingDuration;
    private DynamicDescription[] dynamicDescription;
    private RankRewardPreview[] completeRankRewardPreview;
    private MissionGrantedAbility[] grantedAbilities;
    private TerritoryLocalNote[] localNotifications;
    private boolean restrictSetupDuringAttackPhase;
    private TerritoryTournamentConflictZoneDefinition[] conflictZoneDefinition;
    private TerritoryTournamentDuelZoneDefinition[] duelZoneDefinition;
    private int noJoinDuration;
    private double defensiveCharacterDeployWarningThreshold;
    private double defensiveShipDeployWarningThreshold;
    private int matchCount;
    private RankRewardPreview[] roundRewardPreview;
    private int seasonPointsPerBannerPercent;
    private String roundSeasonRewardTableId;
    private int minimumBannerRoundRewardThreshold;
    private int minimumBannerEventRewardThreshold;
    private String savedSquadConfigId;

    public String getId() {
        return id;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String getDescriptionKey() {
        return descriptionKey;
    }

    public String getPrefabName() {
        return prefabName;
    }

    public String getIconPrefab() {
        return iconPrefab;
    }

    public String getDetailImage() {
        return detailImage;
    }

    public String getTerritoryCategory() {
        return territoryCategory;
    }

    public String getMinimapPrefab() {
        return minimapPrefab;
    }

    public int getRoundCOunt() {
        return roundCOunt;
    }

    public int getRoundTallyDefinition() {
        return roundTallyDefinition;
    }

    public int getMatchmakingDuration() {
        return matchmakingDuration;
    }

    public DynamicDescription[] getDynamicDescription() {
        return dynamicDescription;
    }

    public RankRewardPreview[] getCompleteRankRewardPreview() {
        return completeRankRewardPreview;
    }

    public MissionGrantedAbility[] getGrantedAbilities() {
        return grantedAbilities;
    }

    public TerritoryLocalNote[] getLocalNotifications() {
        return localNotifications;
    }

    public boolean isRestrictSetupDuringAttackPhase() {
        return restrictSetupDuringAttackPhase;
    }

    public TerritoryTournamentConflictZoneDefinition[] getConflictZoneDefinition() {
        return conflictZoneDefinition;
    }

    public TerritoryTournamentDuelZoneDefinition[] getDuelZoneDefinition() {
        return duelZoneDefinition;
    }

    public int getNoJoinDuration() {
        return noJoinDuration;
    }

    public double getDefensiveCharacterDeployWarningThreshold() {
        return defensiveCharacterDeployWarningThreshold;
    }

    public double getDefensiveShipDeployWarningThreshold() {
        return defensiveShipDeployWarningThreshold;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public RankRewardPreview[] getRoundRewardPreview() {
        return roundRewardPreview;
    }

    public int getSeasonPointsPerBannerPercent() {
        return seasonPointsPerBannerPercent;
    }

    public String getRoundSeasonRewardTableId() {
        return roundSeasonRewardTableId;
    }

    public int getMinimumBannerRoundRewardThreshold() {
        return minimumBannerRoundRewardThreshold;
    }

    public int getMinimumBannerEventRewardThreshold() {
        return minimumBannerEventRewardThreshold;
    }

    public String getSavedSquadConfigId() {
        return savedSquadConfigId;
    }

    @Override
    public String toString() {
        return "TerritoryTournamentDefinition{" +
                "id='" + id + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", descriptionKey='" + descriptionKey + '\'' +
                ", prefabName='" + prefabName + '\'' +
                ", iconPrefab='" + iconPrefab + '\'' +
                ", detailImage='" + detailImage + '\'' +
                ", territoryCategory='" + territoryCategory + '\'' +
                ", minimapPrefab='" + minimapPrefab + '\'' +
                ", roundCOunt=" + roundCOunt +
                ", roundTallyDefinition=" + roundTallyDefinition +
                ", matchmakingDuration=" + matchmakingDuration +
                ", dynamicDescription=" + Arrays.toString(dynamicDescription) +
                ", completeRankRewardPreview=" + Arrays.toString(completeRankRewardPreview) +
                ", grantedAbilities=" + Arrays.toString(grantedAbilities) +
                ", localNotifications=" + Arrays.toString(localNotifications) +
                ", restrictSetupDuringAttackPhase=" + restrictSetupDuringAttackPhase +
                ", conflictZoneDefinition=" + Arrays.toString(conflictZoneDefinition) +
                ", duelZoneDefinition=" + Arrays.toString(duelZoneDefinition) +
                ", noJoinDuration=" + noJoinDuration +
                ", defensiveCharacterDeployWarningThreshold=" + defensiveCharacterDeployWarningThreshold +
                ", defensiveShipDeployWarningThreshold=" + defensiveShipDeployWarningThreshold +
                ", matchCount=" + matchCount +
                ", roundRewardPreview=" + Arrays.toString(roundRewardPreview) +
                ", seasonPointsPerBannerPercent=" + seasonPointsPerBannerPercent +
                ", roundSeasonRewardTableId='" + roundSeasonRewardTableId + '\'' +
                ", minimumBannerRoundRewardThreshold=" + minimumBannerRoundRewardThreshold +
                ", minimumBannerEventRewardThreshold=" + minimumBannerEventRewardThreshold +
                ", savedSquadConfigId='" + savedSquadConfigId + '\'' +
                '}';
    }
}
