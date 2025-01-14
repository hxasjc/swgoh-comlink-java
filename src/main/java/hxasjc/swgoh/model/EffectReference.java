package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class EffectReference {
    private String id;
    private int[] contextIndex;
    private int maxBonusMove;

    public String getId() {
        return id;
    }

    public int[] getContextIndex() {
        return contextIndex;
    }

    public int getMaxBonusMove() {
        return maxBonusMove;
    }

    @Override
    public String toString() {
        return "EffectReference{" +
                "id='" + id + '\'' +
                ", contextIndex=" + Arrays.toString(contextIndex) +
                ", maxBonusMove=" + maxBonusMove +
                '}';
    }
}
