package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.ItemType;

@SuppressWarnings("unused")
public class ConversionItem {
    private String id;
    private ItemType type;
    private int pointValue;

    public String getId() {
        return id;
    }

    public ItemType getType() {
        return type;
    }

    public int getPointValue() {
        return pointValue;
    }

    @Override
    public String toString() {
        return "ConversionItem{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", pointValue=" + pointValue +
                '}';
    }
}
