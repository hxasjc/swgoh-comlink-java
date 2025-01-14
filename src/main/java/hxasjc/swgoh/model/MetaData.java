package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class MetaData {
    private ConfigEntry[] config;
    private int assetVersion;
    private String assetSubpath;
    private String texFormat;
    private long serverTimestamp;
    private boolean debugMode;
    private String latestLocalizationBundleVersion;
    private String latestGamedataVersion;
    private int resourceCacheMemoryLimit;
    private String gamedataRevision;
    private int monoExtremeMemoryAllocationDivisor;
    private ClientQualityData qualityData;
    private String latestLocalizationRevision;
    private String serverVersion;
    private ClientCacheEntry[] clientCache;

    public ConfigEntry[] getConfig() {
        return config;
    }

    public int getAssetVersion() {
        return assetVersion;
    }

    public String getAssetSubpath() {
        return assetSubpath;
    }

    public String getTexFormat() {
        return texFormat;
    }

    public long getServerTimestamp() {
        return serverTimestamp;
    }

    public boolean isDebugMode() {
        return debugMode;
    }

    public String getLatestLocalizationBundleVersion() {
        return latestLocalizationBundleVersion;
    }

    public String getLatestGamedataVersion() {
        return latestGamedataVersion;
    }

    public int getResourceCacheMemoryLimit() {
        return resourceCacheMemoryLimit;
    }

    public String getGamedataRevision() {
        return gamedataRevision;
    }

    public int getMonoExtremeMemoryAllocationDivisor() {
        return monoExtremeMemoryAllocationDivisor;
    }

    public ClientQualityData getQualityData() {
        return qualityData;
    }

    public String getLatestLocalizationRevision() {
        return latestLocalizationRevision;
    }

    public String getServerVersion() {
        return serverVersion;
    }

    public ClientCacheEntry[] getClientCache() {
        return clientCache;
    }

    @Override
    public String toString() {
        return "MetaData{" +
                "config=" + Arrays.toString(config) +
                ", assetVersion=" + assetVersion +
                ", assetSubpath='" + assetSubpath + '\'' +
                ", texFormat='" + texFormat + '\'' +
                ", serverTimestamp=" + serverTimestamp +
                ", debugMode=" + debugMode +
                ", latestLocalizationBundleVersion='" + latestLocalizationBundleVersion + '\'' +
                ", latestGamedataVersion='" + latestGamedataVersion + '\'' +
                ", resourceCacheMemoryLimit=" + resourceCacheMemoryLimit +
                ", gamedataRevision='" + gamedataRevision + '\'' +
                ", monoExtremeMemoryAllocationDivisor=" + monoExtremeMemoryAllocationDivisor +
                ", qualityData=" + qualityData +
                ", latestLocalizationRevision='" + latestLocalizationRevision + '\'' +
                ", serverVersion='" + serverVersion + '\'' +
                ", clientCache=" + Arrays.toString(clientCache) +
                '}';
    }
}
