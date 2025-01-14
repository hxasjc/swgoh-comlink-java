package hxasjc.swgoh.payloads;

public class PlayerPayload extends EndpointPayload {
    public String allyCode;
    public String playerId;

    public PlayerPayload setAllyCode(String allyCode) {
        this.allyCode = allyCode;
        return this;
    }

    public PlayerPayload setPlayerId(String playerId) {
        this.playerId = playerId;
        return this;
    }

    @Override
    public String toString() {
        return "PlayerPayload{" +
                "allyCode='" + allyCode + '\'' +
                ", playerId='" + playerId + '\'' +
                '}';
    }
}
