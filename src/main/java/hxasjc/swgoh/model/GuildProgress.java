package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class GuildProgress {
    private GuildRaidProgress[] raidProgress;

    public GuildRaidProgress[] getRaidProgress() {
        return raidProgress;
    }

    @Override
    public String toString() {
        return "GuildProgress{" +
                "raidProgress=" + Arrays.toString(raidProgress) +
                '}';
    }
}
