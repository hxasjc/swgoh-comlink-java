package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class EffectTargetCategoryCriteria {
    private boolean exclude;
    private String[] categoryId;
    private EffectTargetCategory[] category;

    public boolean isExclude() {
        return exclude;
    }

    public String[] getCategoryId() {
        return categoryId;
    }

    public EffectTargetCategory[] getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "EffectTargetCategoryCriteria{" +
                "exclude=" + exclude +
                ", categoryId=" + Arrays.toString(categoryId) +
                ", category=" + Arrays.toString(category) +
                '}';
    }
}
