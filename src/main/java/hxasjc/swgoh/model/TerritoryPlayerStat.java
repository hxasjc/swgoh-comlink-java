package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryPlayerStat {
    private String memberId;
    private long score;
    private TerritoryStatCovertZoneResult[] covertZoneResult;

    public String getMemberId() {
        return memberId;
    }

    public long getScore() {
        return score;
    }

    public TerritoryStatCovertZoneResult[] getCovertZoneResult() {
        return covertZoneResult;
    }

    @Override
    public String toString() {
        return "TerritoryPlayerStat{" +
                "memberId='" + memberId + '\'' +
                ", score=" + score +
                ", covertZoneResult=" + Arrays.toString(covertZoneResult) +
                '}';
    }
}
