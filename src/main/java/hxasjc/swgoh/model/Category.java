package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.CombatType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Category {
    private String id;
    private String descKey;
    private boolean visible;
    private CombatType[] uiFilter;

    public String getId() {
        return id;
    }

    public String getDescKey() {
        return descKey;
    }

    public boolean isVisible() {
        return visible;
    }

    public CombatType[] getUiFilter() {
        return uiFilter;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", descKey='" + descKey + '\'' +
                ", visible=" + visible +
                ", uiFilter=" + Arrays.toString(uiFilter) +
                '}';
    }
}
