package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class TimeZoneDefinition {
    private int timeZoneOffsetMinutes;
    private boolean primary;

    public int getTimeZoneOffsetMinutes() {
        return timeZoneOffsetMinutes;
    }

    public boolean isPrimary() {
        return primary;
    }

    @Override
    public String toString() {
        return "TimeZoneDefinition{" +
                "timeZoneOffsetMinutes=" + timeZoneOffsetMinutes +
                ", primary=" + primary +
                '}';
    }
}
