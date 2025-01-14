package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class UnitReplacement {
    private String sourceUnitId;
    private String replacementUnitId;

    public String getSourceUnitId() {
        return sourceUnitId;
    }

    public String getReplacementUnitId() {
        return replacementUnitId;
    }

    @Override
    public String toString() {
        return "UnitReplacement{" +
                "sourceUnitId='" + sourceUnitId + '\'' +
                ", replacementUnitId='" + replacementUnitId + '\'' +
                '}';
    }
}