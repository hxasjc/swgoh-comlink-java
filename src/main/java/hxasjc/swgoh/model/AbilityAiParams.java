package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class AbilityAiParams {
    private String preferredAllyTargetingRuleId;
    private String preferredEnemyTargetingRuleId;
    private boolean requireEnemyPreferredTargets;
    private boolean requireAllyTargets;
    private String[] preferredAllyTargetingRuleIdList;
    private String[] preferredEnemyTargetingRuleIdList;

    public String getPreferredAllyTargetingRuleId() {
        return preferredAllyTargetingRuleId;
    }

    public String getPreferredEnemyTargetingRuleId() {
        return preferredEnemyTargetingRuleId;
    }

    public boolean isRequireEnemyPreferredTargets() {
        return requireEnemyPreferredTargets;
    }

    public boolean isRequireAllyTargets() {
        return requireAllyTargets;
    }

    public String[] getPreferredAllyTargetingRuleIdList() {
        return preferredAllyTargetingRuleIdList;
    }

    public String[] getPreferredEnemyTargetingRuleIdList() {
        return preferredEnemyTargetingRuleIdList;
    }

    @Override
    public String toString() {
        return "AbilityAiParams{" +
                "preferredAllyTargetingRuleId='" + preferredAllyTargetingRuleId + '\'' +
                ", preferredEnemyTargetingRuleId='" + preferredEnemyTargetingRuleId + '\'' +
                ", requireEnemyPreferredTargets=" + requireEnemyPreferredTargets +
                ", requireAllyTargets=" + requireAllyTargets +
                ", preferredAllyTargetingRuleIdList=" + Arrays.toString(preferredAllyTargetingRuleIdList) +
                ", preferredEnemyTargetingRuleIdList=" + Arrays.toString(preferredEnemyTargetingRuleIdList) +
                '}';
    }
}
