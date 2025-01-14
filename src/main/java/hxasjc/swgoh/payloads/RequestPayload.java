package hxasjc.swgoh.payloads;

public class RequestPayload {
    private boolean enums = true;
    public final EndpointPayload payload;

    public RequestPayload(EndpointPayload payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "RequestPayload{" +
                "enums=" + enums +
                ", payload=" + payload +
                '}';
    }
}
