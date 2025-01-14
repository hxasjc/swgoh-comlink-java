package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class EventSampling {
    private String eventId;
    private int spenderValue;
    private int nonSpenderValue;

    public String getEventId() {
        return eventId;
    }

    public int getSpenderValue() {
        return spenderValue;
    }

    public int getNonSpenderValue() {
        return nonSpenderValue;
    }

    @Override
    public String toString() {
        return "EventSampling{" +
                "eventId='" + eventId + '\'' +
                ", spenderValue=" + spenderValue +
                ", nonSpenderValue=" + nonSpenderValue +
                '}';
    }
}
