package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class SaveSquadConfig {
    private String id;
    private String descKey;
    private String tournamentMapDefinitionId;

    public String getId() {
        return id;
    }

    public String getDescKey() {
        return descKey;
    }

    public String getTournamentMapDefinitionId() {
        return tournamentMapDefinitionId;
    }

    @Override
    public String toString() {
        return "SaveSquadConfig{" +
                "id='" + id + '\'' +
                ", descKey='" + descKey + '\'' +
                ", tournamentMapDefinitionId='" + tournamentMapDefinitionId + '\'' +
                '}';
    }
}
