package hxasjc.swgoh.payloads.old;

public class EventsPayload {
    public boolean enums;

    public static class Builder {
        public EventsPayload payload = new EventsPayload();

        public Builder enums(boolean b) {
            payload.enums = b;
            return this;
        }

        public Builder enums() {
            payload.enums = !payload.enums;
            return this;
        }

        public EventsPayload build() {
            return payload;
        }
    }
}
