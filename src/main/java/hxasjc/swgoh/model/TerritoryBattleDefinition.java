package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.ForceAlignment;
import hxasjc.swgoh.enums.GuildMemberLevel;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryBattleDefinition {
    private String id;
    private String nameKey;
    private String descriptionKey;
    private String prefabName;
    private long roundDuration;
    private int roundCount;
    private TerritoryBattleConflictZoneDefinition[] conflictZoneDefinition;
    private TerritoryStrikeZoneDefinition[] strikeZoneDefinition;
    private TerritoryReconZoneDefinition[] reconZoneDefinition;
    private String iconPrefab;
    private RankRewardPreview[] rankRewardPreview;
    private String detailImage;
    private DynamicDescription[] dynamicDescription;
    private TerritoryCovertZoneDefinition[] covertZoneDefinition;
    private TerritoryMapStatCategory[] statCategory;
    private String territoryCategory;
    private int roundTallyDuration;
    private MissionGrantedAbility[] grantedAbilities;
    private TerritoryLocalNote[] localNotifications;
    private GuildMemberLevel minMemberLevelForCommandingGuild;
    private int commandNotificationCooldownDuration;
    private String minimapPrefab;
    private String searchImage;
    private String infoImage;
    private ForceAlignment forceAlignment;
    private String environmentNameKey;
    private String environmentPrefab;
    private boolean territoryBattleVersion_3;
    private TerritoryBonusZoneDefinition[] bonusZoneDefinition;

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

    public long getRoundDuration() {
        return roundDuration;
    }

    public int getRoundCount() {
        return roundCount;
    }

    public TerritoryBattleConflictZoneDefinition[] getConflictZoneDefinition() {
        return conflictZoneDefinition;
    }

    public TerritoryStrikeZoneDefinition[] getStrikeZoneDefinition() {
        return strikeZoneDefinition;
    }

    public TerritoryReconZoneDefinition[] getReconZoneDefinition() {
        return reconZoneDefinition;
    }

    public String getIconPrefab() {
        return iconPrefab;
    }

    public RankRewardPreview[] getRankRewardPreview() {
        return rankRewardPreview;
    }

    public String getDetailImage() {
        return detailImage;
    }

    public DynamicDescription[] getDynamicDescription() {
        return dynamicDescription;
    }

    public TerritoryCovertZoneDefinition[] getCovertZoneDefinition() {
        return covertZoneDefinition;
    }

    public TerritoryMapStatCategory[] getStatCategory() {
        return statCategory;
    }

    public String getTerritoryCategory() {
        return territoryCategory;
    }

    public int getRoundTallyDuration() {
        return roundTallyDuration;
    }

    public MissionGrantedAbility[] getGrantedAbilities() {
        return grantedAbilities;
    }

    public TerritoryLocalNote[] getLocalNotifications() {
        return localNotifications;
    }

    public GuildMemberLevel getMinMemberLevelForCommandingGuild() {
        return minMemberLevelForCommandingGuild;
    }

    public int getCommandNotificationCooldownDuration() {
        return commandNotificationCooldownDuration;
    }

    public String getMinimapPrefab() {
        return minimapPrefab;
    }

    public String getSearchImage() {
        return searchImage;
    }

    public String getInfoImage() {
        return infoImage;
    }

    public ForceAlignment getForceAlignment() {
        return forceAlignment;
    }

    public String getEnvironmentNameKey() {
        return environmentNameKey;
    }

    public String getEnvironmentPrefab() {
        return environmentPrefab;
    }

    public boolean isTerritoryBattleVersion_3() {
        return territoryBattleVersion_3;
    }

    public TerritoryBonusZoneDefinition[] getBonusZoneDefinition() {
        return bonusZoneDefinition;
    }

    @Override
    public String toString() {
        return "TerritoryBattleDefinition{" +
                "id='" + id + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", descriptionKey='" + descriptionKey + '\'' +
                ", prefabName='" + prefabName + '\'' +
                ", roundDuration=" + roundDuration +
                ", roundCount=" + roundCount +
                ", conflictZoneDefinition=" + Arrays.toString(conflictZoneDefinition) +
                ", strikeZoneDefinition=" + Arrays.toString(strikeZoneDefinition) +
                ", reconZoneDefinition=" + Arrays.toString(reconZoneDefinition) +
                ", iconPrefab='" + iconPrefab + '\'' +
                ", rankRewardPreview=" + Arrays.toString(rankRewardPreview) +
                ", detailImage='" + detailImage + '\'' +
                ", dynamicDescription=" + Arrays.toString(dynamicDescription) +
                ", covertZoneDefinition=" + Arrays.toString(covertZoneDefinition) +
                ", statCategory=" + Arrays.toString(statCategory) +
                ", territoryCategory='" + territoryCategory + '\'' +
                ", roundTallyDuration=" + roundTallyDuration +
                ", grantedAbilities=" + Arrays.toString(grantedAbilities) +
                ", localNotifications=" + Arrays.toString(localNotifications) +
                ", minMemberLevelForCommandingGuild=" + minMemberLevelForCommandingGuild +
                ", commandNotificationCooldownDuration=" + commandNotificationCooldownDuration +
                ", minimapPrefab='" + minimapPrefab + '\'' +
                ", searchImage='" + searchImage + '\'' +
                ", infoImage='" + infoImage + '\'' +
                ", forceAlignment=" + forceAlignment +
                ", environmentNameKey='" + environmentNameKey + '\'' +
                ", environmentPrefab='" + environmentPrefab + '\'' +
                ", territoryBattleVersion_3=" + territoryBattleVersion_3 +
                ", bonusZoneDefinition=" + Arrays.toString(bonusZoneDefinition) +
                '}';
    }
}
