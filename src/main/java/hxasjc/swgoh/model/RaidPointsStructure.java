package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class RaidPointsStructure {
    private RaidBlackboardPointSource[] blackboardPointSource;
    private RaidModifier[] modifier;

    public RaidBlackboardPointSource[] getBlackboardPointSource() {
        return blackboardPointSource;
    }

    public RaidModifier[] getModifier() {
        return modifier;
    }

    @Override
    public String toString() {
        return "RaidPointsStructure{" +
                "blackboardPointSource=" + Arrays.toString(blackboardPointSource) +
                ", modifier=" + Arrays.toString(modifier) +
                '}';
    }
}
