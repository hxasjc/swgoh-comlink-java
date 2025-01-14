package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class Environment {
    private String prefab;
    private String layout;
    private String layoutPrefab;

    public String getPrefab() {
        return prefab;
    }

    public String getLayout() {
        return layout;
    }

    public String getLayoutPrefab() {
        return layoutPrefab;
    }

    @Override
    public String toString() {
        return "Environment{" +
                "prefab='" + prefab + '\'' +
                ", layout='" + layout + '\'' +
                ", layoutPrefab='" + layoutPrefab + '\'' +
                '}';
    }
}
