package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class PersistentVfx {
    private String id;
    private String prefab;
    private int priority;
    private String lineOverride;

    public String getId() {
        return id;
    }

    public String getPrefab() {
        return prefab;
    }

    public int getPriority() {
        return priority;
    }

    public String getLineOverride() {
        return lineOverride;
    }

    @Override
    public String toString() {
        return "PersistentVfx{" +
                "id='" + id + '\'' +
                ", prefab='" + prefab + '\'' +
                ", priority=" + priority +
                ", lineOverride='" + lineOverride + '\'' +
                '}';
    }
}
