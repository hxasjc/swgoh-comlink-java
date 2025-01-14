package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.LinkedStoreItemType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class LinkedStoreItem {
    private String linkId;
    private String[] storeItem;
    private LinkedStoreItemType type;
    private ContextualStoreItem[] contextualStoreItem;

    public String getLinkId() {
        return linkId;
    }

    public String[] getStoreItem() {
        return storeItem;
    }

    public LinkedStoreItemType getType() {
        return type;
    }

    public ContextualStoreItem[] getContextualStoreItem() {
        return contextualStoreItem;
    }

    @Override
    public String toString() {
        return "LinkedStoreItem{" +
                "linkId='" + linkId + '\'' +
                ", storeItem=" + Arrays.toString(storeItem) +
                ", type=" + type +
                ", contextualStoreItem=" + Arrays.toString(contextualStoreItem) +
                '}';
    }
}
