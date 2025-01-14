package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryZoneDefinition {
    private String zoneId;
    private String prefabName;
    private String nameKey;
    private String descriptionKey;
    private String linkedConflictId;
    private int maxAttemptsAllowed;
    private Requirement unlockRequirement;
    private int maxUnitCountPerPlayer;
    private MissionGrantedAbility[] grantedAbilities;
    private String detailViewIconOverrideName;
    private String mapIconOverrideName;

    public String getZoneId() {
        return zoneId;
    }

    public String getPrefabName() {
        return prefabName;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String getDescriptionKey() {
        return descriptionKey;
    }

    public String getLinkedConflictId() {
        return linkedConflictId;
    }

    public int getMaxAttemptsAllowed() {
        return maxAttemptsAllowed;
    }

    public Requirement getUnlockRequirement() {
        return unlockRequirement;
    }

    public int getMaxUnitCountPerPlayer() {
        return maxUnitCountPerPlayer;
    }

    public MissionGrantedAbility[] getGrantedAbilities() {
        return grantedAbilities;
    }

    public String getDetailViewIconOverrideName() {
        return detailViewIconOverrideName;
    }

    public String getMapIconOverrideName() {
        return mapIconOverrideName;
    }

    @Override
    public String toString() {
        return "TerritoryZoneDefinition{" +
                "zoneId='" + zoneId + '\'' +
                ", prefabName='" + prefabName + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", descriptionKey='" + descriptionKey + '\'' +
                ", linkedConflictId='" + linkedConflictId + '\'' +
                ", maxAttemptsAllowed=" + maxAttemptsAllowed +
                ", unlockRequirement=" + unlockRequirement +
                ", maxUnitCountPerPlayer=" + maxUnitCountPerPlayer +
                ", grantedAbilities=" + Arrays.toString(grantedAbilities) +
                ", detailViewIconOverrideName='" + detailViewIconOverrideName + '\'' +
                ", mapIconOverrideName='" + mapIconOverrideName + '\'' +
                '}';
    }
}
