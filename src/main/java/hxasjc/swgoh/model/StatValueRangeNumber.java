package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class StatValueRangeNumber {
    private int value;
    private boolean inclusive;

    public int getValue() {
        return value;
    }

    public boolean isInclusive() {
        return inclusive;
    }

    @Override
    public String toString() {
        return "StatValueRangeNumber{" +
                "value=" + value +
                ", inclusive=" + inclusive +
                '}';
    }
}
