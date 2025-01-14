package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.ModifierLocationType;

@SuppressWarnings("unused")
public class ModifierLocation {
    private ModifierLocationType type;
    private String identifier;

    public ModifierLocationType getType() {
        return type;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return "ModifierLocation{" +
                "type=" + type +
                ", identifier='" + identifier + '\'' +
                '}';
    }
}
