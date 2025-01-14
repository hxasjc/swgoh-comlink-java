package hxasjc.swgoh.payloads;

public abstract class EndpointPayload {
    public RequestPayload build() {
        return new RequestPayload(this);
    }
}
