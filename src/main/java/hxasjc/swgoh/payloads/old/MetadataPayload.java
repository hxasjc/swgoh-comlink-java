package hxasjc.swgoh.payloads.old;

public class MetadataPayload {
    public boolean enums;
    public Payload payload = new Payload();

    public static class Payload {
        public ClientSpecs clientSpecs;

        public static class ClientSpecs {
            public String platform, bundleId, externalVersion, internalVersion, region;
        }
    }

    public static class Builder {
        public MetadataPayload payload = new MetadataPayload();

        public Builder enums(boolean b) {
            payload.enums = b;
            return this;
        }

        public Builder platform(String s) {
            payload.payload.clientSpecs.platform = s;
            return this;
        }

        public Builder bundleId(String s) {
            payload.payload.clientSpecs.bundleId = s;
            return this;
        }

        public Builder externalVersion(String s) {
            payload.payload.clientSpecs.externalVersion = s;
            return this;
        }

        public Builder internalVersion(String s) {
            payload.payload.clientSpecs.internalVersion = s;
            return this;
        }

        public Builder region(String s) {
            payload.payload.clientSpecs.region = s;
            return this;
        }

        public MetadataPayload build() {
            return payload;
        }
    }
}
