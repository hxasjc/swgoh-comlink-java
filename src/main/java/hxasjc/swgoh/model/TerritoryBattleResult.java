package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TerritoryBattleResult {
    private String instanceId;
    private String definitionId;
    private long endTime;
    private long totalStars;
    private TerritoryMapStat[] finalStat;

    public String getInstanceId() {
        return instanceId;
    }

    public String getDefinitionId() {
        return definitionId;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getTotalStars() {
        return totalStars;
    }

    public TerritoryMapStat[] getFinalStat() {
        return finalStat;
    }

    @Override
    public String toString() {
        return "TerritoryBattleResult{" +
                "instanceId='" + instanceId + '\'' +
                ", definitionId='" + definitionId + '\'' +
                ", endTime=" + endTime +
                ", totalStars=" + totalStars +
                ", finalStat=" + Arrays.toString(finalStat) +
                '}';
    }
}
