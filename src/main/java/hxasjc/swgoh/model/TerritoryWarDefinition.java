package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.GuildMemberLevel;
import hxasjc.swgoh.enums.TerritoryRewardStructure;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryWarDefinition {
    private String id;
    private String nameKey;
    private String descriptionKey;
    private String prefabKey;
    private int roundCount;
    private String iconPrefab;
    private String detailImage;
    private int roundTallyDuration;
    private DynamicDescription[] dynamicDescription;
    private RankRewardPreview[] firstRewardPreview;
    private RankRewardPreview[] secondRewardPreview;
    private int matchmakingDuration;
    private int setupDuration;
    private MissionGrantedAbility[] grantedAbilities;
    private String joinEventActionCapKey;
    private int minParticipants;
    private long minScoreRequirement;
    private TerritoryWarConflictZoneDefinition[] warConflictZoneDefinition;
    private TerritoryReconZoneDefinition[] reconZoneDefinition;
    private TerritoryMapStatCategory[] statCategory;
    private TerritoryRewardStructure rewardStructure;
    private String uniqueJoinId;
    private boolean hideLeaderboardId;
    private TerritoryLocalNote[] localNotifications;
    private GuildMemberLevel minMemberLevelForReportingOpponents;
    private GuildMemberLevel minMemberLevelForCommandingGuild;
    private int commandNotificationCooldownDuration;
    private String mapTypeNameKey;
    private boolean showTimerOnEvent;
    private boolean restrictSetupDuringAttackPhase;
    private Environment[] defaultCharacterBattleEnvironments;
    private Environment[] defaultShipBattleEnvironments;
    private String minimapPrefab;
    private double defensiveCharacterDeployWarningThreshold;
    private double defensiveShipDeployWarningThreshold;
    private String leaderboardKey;
    private int minPlayerScoreRequirement;

    public String getId() {
        return id;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String getDescriptionKey() {
        return descriptionKey;
    }

    public String getPrefabKey() {
        return prefabKey;
    }

    public int getRoundCount() {
        return roundCount;
    }

    public String getIconPrefab() {
        return iconPrefab;
    }

    public String getDetailImage() {
        return detailImage;
    }

    public int getRoundTallyDuration() {
        return roundTallyDuration;
    }

    public DynamicDescription[] getDynamicDescription() {
        return dynamicDescription;
    }

    public RankRewardPreview[] getFirstRewardPreview() {
        return firstRewardPreview;
    }

    public RankRewardPreview[] getSecondRewardPreview() {
        return secondRewardPreview;
    }

    public int getMatchmakingDuration() {
        return matchmakingDuration;
    }

    public int getSetupDuration() {
        return setupDuration;
    }

    public MissionGrantedAbility[] getGrantedAbilities() {
        return grantedAbilities;
    }

    public String getJoinEventActionCapKey() {
        return joinEventActionCapKey;
    }

    public int getMinParticipants() {
        return minParticipants;
    }

    public long getMinScoreRequirement() {
        return minScoreRequirement;
    }

    public TerritoryWarConflictZoneDefinition[] getWarConflictZoneDefinition() {
        return warConflictZoneDefinition;
    }

    public TerritoryReconZoneDefinition[] getReconZoneDefinition() {
        return reconZoneDefinition;
    }

    public TerritoryMapStatCategory[] getStatCategory() {
        return statCategory;
    }

    public TerritoryRewardStructure getRewardStructure() {
        return rewardStructure;
    }

    public String getUniqueJoinId() {
        return uniqueJoinId;
    }

    public boolean isHideLeaderboardId() {
        return hideLeaderboardId;
    }

    public TerritoryLocalNote[] getLocalNotifications() {
        return localNotifications;
    }

    public GuildMemberLevel getMinMemberLevelForReportingOpponents() {
        return minMemberLevelForReportingOpponents;
    }

    public GuildMemberLevel getMinMemberLevelForCommandingGuild() {
        return minMemberLevelForCommandingGuild;
    }

    public int getCommandNotificationCooldownDuration() {
        return commandNotificationCooldownDuration;
    }

    public String getMapTypeNameKey() {
        return mapTypeNameKey;
    }

    public boolean isShowTimerOnEvent() {
        return showTimerOnEvent;
    }

    public boolean isRestrictSetupDuringAttackPhase() {
        return restrictSetupDuringAttackPhase;
    }

    public Environment[] getDefaultCharacterBattleEnvironments() {
        return defaultCharacterBattleEnvironments;
    }

    public Environment[] getDefaultShipBattleEnvironments() {
        return defaultShipBattleEnvironments;
    }

    public String getMinimapPrefab() {
        return minimapPrefab;
    }

    public double getDefensiveCharacterDeployWarningThreshold() {
        return defensiveCharacterDeployWarningThreshold;
    }

    public double getDefensiveShipDeployWarningThreshold() {
        return defensiveShipDeployWarningThreshold;
    }

    public String getLeaderboardKey() {
        return leaderboardKey;
    }

    public int getMinPlayerScoreRequirement() {
        return minPlayerScoreRequirement;
    }

    @Override
    public String toString() {
        return "TerritoryWarDefinition{" +
                "id='" + id + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", descriptionKey='" + descriptionKey + '\'' +
                ", prefabKey='" + prefabKey + '\'' +
                ", roundCount=" + roundCount +
                ", iconPrefab='" + iconPrefab + '\'' +
                ", detailImage='" + detailImage + '\'' +
                ", roundTallyDuration=" + roundTallyDuration +
                ", dynamicDescription=" + Arrays.toString(dynamicDescription) +
                ", firstRewardPreview=" + Arrays.toString(firstRewardPreview) +
                ", secondRewardPreview=" + Arrays.toString(secondRewardPreview) +
                ", matchmakingDuration=" + matchmakingDuration +
                ", setupDuration=" + setupDuration +
                ", grantedAbilities=" + Arrays.toString(grantedAbilities) +
                ", joinEventActionCapKey='" + joinEventActionCapKey + '\'' +
                ", minParticipants=" + minParticipants +
                ", minScoreRequirement=" + minScoreRequirement +
                ", warConflictZoneDefinition=" + Arrays.toString(warConflictZoneDefinition) +
                ", reconZoneDefinition=" + Arrays.toString(reconZoneDefinition) +
                ", statCategory=" + Arrays.toString(statCategory) +
                ", rewardStructure=" + rewardStructure +
                ", uniqueJoinId='" + uniqueJoinId + '\'' +
                ", hideLeaderboardId=" + hideLeaderboardId +
                ", localNotifications=" + Arrays.toString(localNotifications) +
                ", minMemberLevelForReportingOpponents=" + minMemberLevelForReportingOpponents +
                ", minMemberLevelForCommandingGuild=" + minMemberLevelForCommandingGuild +
                ", commandNotificationCooldownDuration=" + commandNotificationCooldownDuration +
                ", mapTypeNameKey='" + mapTypeNameKey + '\'' +
                ", showTimerOnEvent=" + showTimerOnEvent +
                ", restrictSetupDuringAttackPhase=" + restrictSetupDuringAttackPhase +
                ", defaultCharacterBattleEnvironments=" + Arrays.toString(defaultCharacterBattleEnvironments) +
                ", defaultShipBattleEnvironments=" + Arrays.toString(defaultShipBattleEnvironments) +
                ", minimapPrefab='" + minimapPrefab + '\'' +
                ", defensiveCharacterDeployWarningThreshold=" + defensiveCharacterDeployWarningThreshold +
                ", defensiveShipDeployWarningThreshold=" + defensiveShipDeployWarningThreshold +
                ", leaderboardKey='" + leaderboardKey + '\'' +
                ", minPlayerScoreRequirement=" + minPlayerScoreRequirement +
                '}';
    }
}
