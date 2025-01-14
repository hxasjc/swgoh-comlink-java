package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class EffectTagCriteria {
    private String tag;
    private boolean exclude;

    public String getTag() {
        return tag;
    }

    public boolean isExclude() {
        return exclude;
    }

    @Override
    public String toString() {
        return "EffectTagCriteria{" +
                "tag='" + tag + '\'' +
                ", exclude=" + exclude +
                '}';
    }
}
