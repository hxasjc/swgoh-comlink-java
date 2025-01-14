package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.OperationType;

@SuppressWarnings("unused")
public class StatProgression {
    private String id;
    private StatDef stat;
    private OperationType operation;

    public String getId() {
        return id;
    }

    public StatDef getStat() {
        return stat;
    }

    public OperationType getOperation() {
        return operation;
    }

    @Override
    public String toString() {
        return "StatProgression{" +
                "id='" + id + '\'' +
                ", stat=" + stat +
                ", operation=" + operation +
                '}';
    }
}
