package hxasjc.swgoh.payloads;

public class MetadataPayload extends EndpointPayload {
    public ClientSpecs clientSpecs = new ClientSpecs();

    public MetadataPayload setClientSpecs(ClientSpecs clientSpecs) {
        this.clientSpecs = clientSpecs;
        return this;
    }

    public MetadataPayload setPlatform(String platform) {
        this.clientSpecs.platform = platform;
        return this;
    }

    public MetadataPayload setBundleId(String bundleId) {
        this.clientSpecs.bundleId = bundleId;
        return this;
    }

    public MetadataPayload setExternalVersion(String externalVersion) {
        this.clientSpecs.externalVersion = externalVersion;
        return this;
    }

    public MetadataPayload setInternalVersion(String internalVersion) {
        this.clientSpecs.internalVersion = internalVersion;
        return this;
    }

    public MetadataPayload setRegion(String region) {
        this.clientSpecs.region = region;
        return this;
    }

    @Override
    public String toString() {
        return "MetadataPayload{" +
                "clientSpecs=" + clientSpecs +
                '}';
    }
}
