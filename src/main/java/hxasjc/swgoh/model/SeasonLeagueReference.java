package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.SeasonLeaguePromoteSystem;

import java.util.Arrays;

@SuppressWarnings("unused")
public class SeasonLeagueReference {
    private String definitionId;
    private SeasonLeaguePromoteSystem promoteSystem;
    private int promoteCondition;
    private LeagueDivisionRewardPreview[] rewardPreview;
    private String promoteConditionTable;

    public String getDefinitionId() {
        return definitionId;
    }

    public SeasonLeaguePromoteSystem getPromoteSystem() {
        return promoteSystem;
    }

    public int getPromoteCondition() {
        return promoteCondition;
    }

    public LeagueDivisionRewardPreview[] getRewardPreview() {
        return rewardPreview;
    }

    public String getPromoteConditionTable() {
        return promoteConditionTable;
    }

    @Override
    public String toString() {
        return "SeasonLeagueReference{" +
                "definitionId='" + definitionId + '\'' +
                ", promoteSystem=" + promoteSystem +
                ", promoteCondition=" + promoteCondition +
                ", rewardPreview=" + Arrays.toString(rewardPreview) +
                ", promoteConditionTable='" + promoteConditionTable + '\'' +
                '}';
    }
}
