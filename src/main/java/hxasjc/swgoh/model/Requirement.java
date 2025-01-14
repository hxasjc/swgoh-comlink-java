package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.EvaluationType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Requirement {
    private EvaluationType evalType;
    private RequirementItem[] requirementItem;
    private String id;
    private String descKey;

    public EvaluationType getEvalType() {
        return evalType;
    }

    public RequirementItem[] getRequirementItem() {
        return requirementItem;
    }

    public String getId() {
        return id;
    }

    public String getDescKey() {
        return descKey;
    }

    @Override
    public String toString() {
        return "Requirement{" +
                "evalType=" + evalType +
                ", requirementItem=" + Arrays.toString(requirementItem) +
                ", id='" + id + '\'' +
                ", descKey='" + descKey + '\'' +
                '}';
    }
}
