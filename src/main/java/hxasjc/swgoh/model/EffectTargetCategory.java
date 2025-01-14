package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class EffectTargetCategory {
    private boolean exclude;
    private String categoryId;

    public boolean isExclude() {
        return exclude;
    }

    public String getCategoryId() {
        return categoryId;
    }

    @Override
    public String toString() {
        return "EffectTargetCategory{" +
                "exclude=" + exclude +
                ", categoryId='" + categoryId + '\'' +
                '}';
    }
}
