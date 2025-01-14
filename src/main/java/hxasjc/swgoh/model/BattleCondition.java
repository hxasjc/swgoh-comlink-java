package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.ConditionType;

@SuppressWarnings("unused")
public class BattleCondition {
    private ConditionType conditionType;
    private String conditionValue;
    private int priority;

    public ConditionType getConditionType() {
        return conditionType;
    }

    public String getConditionValue() {
        return conditionValue;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "BattleCondition{" +
                "conditionType=" + conditionType +
                ", conditionValue='" + conditionValue + '\'' +
                ", priority=" + priority +
                '}';
    }
}
