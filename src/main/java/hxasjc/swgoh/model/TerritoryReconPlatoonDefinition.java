package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryReconPlatoonDefinition {
    private String id;
    private String nameId;
    private TerritoryReconSquadDefinition[] squad;
    private TerritoryReward reward;

    public String getId() {
        return id;
    }

    public String getNameId() {
        return nameId;
    }

    public TerritoryReconSquadDefinition[] getSquad() {
        return squad;
    }

    public TerritoryReward getReward() {
        return reward;
    }

    @Override
    public String toString() {
        return "TerritoryReconPlatoonDefinition{" +
                "id='" + id + '\'' +
                ", nameId='" + nameId + '\'' +
                ", squad=" + Arrays.toString(squad) +
                ", reward=" + reward +
                '}';
    }
}
