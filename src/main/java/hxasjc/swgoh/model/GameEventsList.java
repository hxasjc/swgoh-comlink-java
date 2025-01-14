package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class GameEventsList {
    private GameEvent[] gameEvent;

    public GameEvent[] getGameEvent() {
        return gameEvent;
    }

    @Override
    public String toString() {
        return "GameEventsList{" +
                "gameEvent=" + Arrays.toString(gameEvent) +
                '}';
    }
}
