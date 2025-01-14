package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.PlayerProfileTab;

@SuppressWarnings("unused")
public class PlayerPvpProfile {
    private PlayerProfileTab tab;
    private int rank;
    private Squad squad;
    private String eventId;

    public PlayerProfileTab getTab() {
        return tab;
    }

    public int getRank() {
        return rank;
    }

    public Squad getSquad() {
        return squad;
    }

    public String getEventId() {
        return eventId;
    }

    @Override
    public String toString() {
        return "PlayerPvpProfile{" +
                "tab=" + tab +
                ", rank=" + rank +
                ", squad=" + squad +
                ", eventId='" + eventId + '\'' +
                '}';
    }
}
