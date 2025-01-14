package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class ForcedPlayerSquad {
    private Squad squad;
    private Unit[] squadUnit;

    public Squad getSquad() {
        return squad;
    }

    public Unit[] getSquadUnit() {
        return squadUnit;
    }

    @Override
    public String toString() {
        return "ForcedPlayerSquad{" +
                "squad=" + squad +
                ", squadUnit=" + Arrays.toString(squadUnit) +
                '}';
    }
}
