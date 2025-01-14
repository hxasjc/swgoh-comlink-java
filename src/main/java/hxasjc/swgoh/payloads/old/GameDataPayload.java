package hxasjc.swgoh.payloads.old;

public class GameDataPayload {
    public boolean enums;
    public Payload payload = new Payload();

    public static class Payload {
        public String version;
        public boolean includePveUnits;
        public String devicePlatform;
        public int requestSegment;
        public String items;
    }

    public static class Builder {
        public GameDataPayload payload = new GameDataPayload();

        public Builder enums(boolean b) {
            payload.enums = b;
            return this;
        }

        public Builder enums() {
            payload.enums = !payload.enums;
            return this;
        }

        public Builder version(String s) {
            payload.payload.version = s;
            return this;
        }

        public Builder includePveUnits(boolean b) {
            payload.payload.includePveUnits = b;
            return this;
        }

        public Builder devicePlatform(String s) {
            payload.payload.devicePlatform = s;
            return this;
        }

        public Builder requestSegment(int i) {
            payload.payload.requestSegment = i;
            return this;
        }

        public Builder items(String s) {
            payload.payload.items = s;
            return this;
        }

        public GameDataPayload build() {
            return payload;
        }
    }
}
