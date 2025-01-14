package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.TerritoryWarSquadStatus;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryWarSquad {
    private String playerId;
    private String playerName;
    private int power;
    private Squad squad;
    private Squad squadId;
    private TerritoryWarSquadStatus squadStatus;
    private String lockName;
    private int successfulDefends;
    private UnitTierSummary[] crewInfo;

    public String getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPower() {
        return power;
    }

    public Squad getSquad() {
        return squad;
    }

    public Squad getSquadId() {
        return squadId;
    }

    public TerritoryWarSquadStatus getSquadStatus() {
        return squadStatus;
    }

    public String getLockName() {
        return lockName;
    }

    public int getSuccessfulDefends() {
        return successfulDefends;
    }

    public UnitTierSummary[] getCrewInfo() {
        return crewInfo;
    }

    @Override
    public String toString() {
        return "TerritoryWarSquad{" +
                "playerId='" + playerId + '\'' +
                ", playerName='" + playerName + '\'' +
                ", power=" + power +
                ", squad=" + squad +
                ", squadId=" + squadId +
                ", squadStatus=" + squadStatus +
                ", lockName='" + lockName + '\'' +
                ", successfulDefends=" + successfulDefends +
                ", crewInfo=" + Arrays.toString(crewInfo) +
                '}';
    }
}
