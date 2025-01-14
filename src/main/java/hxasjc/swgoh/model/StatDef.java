package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class StatDef {
    private Stat[] stat;

    public Stat[] getStat() {
        return stat;
    }

    @Override
    public String toString() {
        return "StatDef{" +
                "stat=" + Arrays.toString(stat) +
                '}';
    }
}
