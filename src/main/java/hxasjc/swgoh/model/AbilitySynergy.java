package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class AbilitySynergy {
    private String[] separateCategoryId;
    private String[] groupedCategoryId;

    public String[] getSeparateCategoryId() {
        return separateCategoryId;
    }

    public String[] getGroupedCategoryId() {
        return groupedCategoryId;
    }

    @Override
    public String toString() {
        return "AbilitySynergy{" +
                "separateCategoryId=" + Arrays.toString(separateCategoryId) +
                ", groupedCategoryId=" + Arrays.toString(groupedCategoryId) +
                '}';
    }
}
