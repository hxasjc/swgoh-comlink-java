package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.ClientCacheDomain;

@SuppressWarnings("unused")
public class ClientCacheEntry {
    private ClientCacheDomain domain;
    private int version;

    public ClientCacheDomain getDomain() {
        return domain;
    }

    public int getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "ClientCacheEntry{" +
                "domain=" + domain +
                ", version=" + version +
                '}';
    }
}
