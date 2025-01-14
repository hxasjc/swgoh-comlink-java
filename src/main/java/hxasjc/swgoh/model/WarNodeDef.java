package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.CombatType;
import hxasjc.swgoh.enums.WarNodeType;

@SuppressWarnings("unused")
public class WarNodeDef {
    private String id;
    private WarNodeType type;
    private CombatType combatType;
    private Position position;

    public String getId() {
        return id;
    }

    public WarNodeType getType() {
        return type;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "WarNodeDef{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", combatType=" + combatType +
                ", position=" + position +
                '}';
    }
}
