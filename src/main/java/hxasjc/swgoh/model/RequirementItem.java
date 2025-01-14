package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.RequirementType;

@SuppressWarnings("unused")
public class RequirementItem {
    private RequirementType type;
    private String id;
    private int value;
    private String locKey;
    private boolean negate;

    public RequirementType getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public String getLocKey() {
        return locKey;
    }

    public boolean isNegate() {
        return negate;
    }

    @Override
    public String toString() {
        return "RequirementItem{" +
                "type=" + type +
                ", id='" + id + '\'' +
                ", value=" + value +
                ", locKey='" + locKey + '\'' +
                ", negate=" + negate +
                '}';
    }
}
