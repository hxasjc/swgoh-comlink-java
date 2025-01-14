package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class ContextualStoreItem {
    private String id;
    private String[] storeItemId;

    public String getId() {
        return id;
    }

    public String[] getStoreItemId() {
        return storeItemId;
    }

    @Override
    public String toString() {
        return "ContextualStoreItem{" +
                "id='" + id + '\'' +
                ", storeItemId=" + Arrays.toString(storeItemId) +
                '}';
    }
}
