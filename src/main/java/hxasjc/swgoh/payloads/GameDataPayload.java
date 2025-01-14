package hxasjc.swgoh.payloads;

import hxasjc.swgoh.GameDataItems;

public class GameDataPayload extends EndpointPayload {
    public String version;
    public boolean includePveUnits;
    public String devicePlatform;
    //public int requestSegment;
    public String items;

    public GameDataPayload setVersion(String version) {
        this.version = version;
        return this;
    }

    public GameDataPayload setIncludePveUnits(boolean includePveUnits) {
        this.includePveUnits = includePveUnits;
        return this;
    }

    public GameDataPayload setDevicePlatform(String devicePlatform) {
        this.devicePlatform = devicePlatform;
        return this;
    }

    /*public GameDataPayload setRequestSegment(int requestSegment) {
        this.requestSegment = requestSegment;
        return this;
    }*/

    public GameDataPayload setItems(String items) {
        this.items = items;
        return this;
    }

    public GameDataPayload setItems(GameDataItems... items) {
        this.items = String.valueOf(GameDataItems.sum(items));
        return this;
    }

    @Override
    public String toString() {
        return "GameDataPayload{" +
                "version='" + version + '\'' +
                ", includePveUnits=" + includePveUnits +
                ", devicePlatform='" + devicePlatform + '\'' +
                //", requestSegment=" + requestSegment +
                ", items='" + items + '\'' +
                '}';
    }
}
