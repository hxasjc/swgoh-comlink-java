package hxasjc.swgoh.payloads;

public class ClientSpecs {
    public String platform;
    public String bundleId;
    public String externalVersion;
    public String internalVersion;
    public String region;

    public ClientSpecs setPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    public ClientSpecs setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    public ClientSpecs setExternalVersion(String externalVersion) {
        this.externalVersion = externalVersion;
        return this;
    }

    public ClientSpecs setInternalVersion(String internalVersion) {
        this.internalVersion = internalVersion;
        return this;
    }

    public ClientSpecs setRegion(String region) {
        this.region = region;
        return this;
    }

    @Override
    public String toString() {
        return "ClientSpecs{" +
                "platform='" + platform + '\'' +
                ", bundleId='" + bundleId + '\'' +
                ", externalVersion='" + externalVersion + '\'' +
                ", internalVersion='" + internalVersion + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
