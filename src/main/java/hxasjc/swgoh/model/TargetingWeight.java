package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class TargetingWeight {
    private String type;
    private String param;
    private int valueDecimal;

    public String getType() {
        return type;
    }

    public String getParam() {
        return param;
    }

    public int getValueDecimal() {
        return valueDecimal;
    }

    @Override
    public String toString() {
        return "TargetingWeight{" +
                "type='" + type + '\'' +
                ", param='" + param + '\'' +
                ", valueDecimal=" + valueDecimal +
                '}';
    }
}
