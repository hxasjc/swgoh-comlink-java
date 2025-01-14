package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.ItemType;
import hxasjc.swgoh.enums.MaterialType;

@SuppressWarnings("unused")
public class ModifierItem {
    private ItemType type;
    private MaterialType materialType;
    private String id;
    private String category;

    public ItemType getType() {
        return type;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    public String getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "ModifierItem{" +
                "type=" + type +
                ", materialType=" + materialType +
                ", id='" + id + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
