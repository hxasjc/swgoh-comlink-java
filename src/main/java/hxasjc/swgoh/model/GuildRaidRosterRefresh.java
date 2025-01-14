package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class GuildRaidRosterRefresh {
    private String type;
    private int[] value;

    public String getType() {
        return type;
    }

    public int[] getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "GuildRaidRosterRefresh{" +
                "type='" + type + '\'' +
                ", value=" + Arrays.toString(value) +
                '}';
    }
}
