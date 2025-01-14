package hxasjc.swgoh.payloads.old;

public class PlayerProfilePayload {
    public boolean enums = false;
    public Payload payload = new Payload();

    public static class Payload {
        public String allyCode;
        public String playerId;
    }

    public static class Builder {
        PlayerProfilePayload payload = new PlayerProfilePayload();

        public Builder enums(boolean b) {
            payload.enums = b;
            return this;
        }

        public Builder allyCode(String s) {
            payload.payload.allyCode = s;
            return this;
        }

        public Builder playerId(String s) {
            payload.payload.playerId = s;
            return this;
        }

        public PlayerProfilePayload build() {
            return payload;
        }
    }
}
