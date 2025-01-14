package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class WarBracketDef {
    private int min;
    private int max;
    private WarNodeDef[] node;

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public WarNodeDef[] getNode() {
        return node;
    }

    @Override
    public String toString() {
        return "WarBracketDef{" +
                "min=" + min +
                ", max=" + max +
                ", node=" + Arrays.toString(node) +
                '}';
    }
}
