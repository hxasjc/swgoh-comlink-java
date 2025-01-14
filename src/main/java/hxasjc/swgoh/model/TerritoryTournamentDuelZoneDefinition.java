package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryTournamentDuelZoneDefinition {
    private TerritoryZoneDefinition zoneDefinition;
    private String duelImage;
    private String duelRequirement;
    private String duelDetail;
    private EntryCategoryAllowed entryCategoryAllowed;
    private EntryCategoryAllowed defenseEntryCategoryAllowed;
    private Environment[] battleEnvironments;
    private TerritoryWarPointStructure pointStructure;
    private int saveSquadZoneNumber;

    public TerritoryZoneDefinition getZoneDefinition() {
        return zoneDefinition;
    }

    public String getDuelImage() {
        return duelImage;
    }

    public String getDuelRequirement() {
        return duelRequirement;
    }

    public String getDuelDetail() {
        return duelDetail;
    }

    public EntryCategoryAllowed getEntryCategoryAllowed() {
        return entryCategoryAllowed;
    }

    public EntryCategoryAllowed getDefenseEntryCategoryAllowed() {
        return defenseEntryCategoryAllowed;
    }

    public Environment[] getBattleEnvironments() {
        return battleEnvironments;
    }

    public TerritoryWarPointStructure getPointStructure() {
        return pointStructure;
    }

    public int getSaveSquadZoneNumber() {
        return saveSquadZoneNumber;
    }

    @Override
    public String toString() {
        return "TerritoryTournamentDuelZoneDefinition{" +
                "zoneDefinition=" + zoneDefinition +
                ", duelImage='" + duelImage + '\'' +
                ", duelRequirement='" + duelRequirement + '\'' +
                ", duelDetail='" + duelDetail + '\'' +
                ", entryCategoryAllowed=" + entryCategoryAllowed +
                ", defenseEntryCategoryAllowed=" + defenseEntryCategoryAllowed +
                ", battleEnvironments=" + Arrays.toString(battleEnvironments) +
                ", pointStructure=" + pointStructure +
                ", saveSquadZoneNumber=" + saveSquadZoneNumber +
                '}';
    }
}
