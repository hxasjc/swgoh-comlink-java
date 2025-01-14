package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TimeZoneChangeConfig {
    private int allowedChangesPerPeriod;
    private String allowedChangedLocKey;
    private String allowedChangesResetLocKey;
    private int maxTimeZoneChangeHoursExclusive;
    private TimeZoneDefinition[] timeZoneDefinition;
    private String timeZoneChangeCooldownId;

    public int getAllowedChangesPerPeriod() {
        return allowedChangesPerPeriod;
    }

    public String getAllowedChangedLocKey() {
        return allowedChangedLocKey;
    }

    public String getAllowedChangesResetLocKey() {
        return allowedChangesResetLocKey;
    }

    public int getMaxTimeZoneChangeHoursExclusive() {
        return maxTimeZoneChangeHoursExclusive;
    }

    public TimeZoneDefinition[] getTimeZoneDefinition() {
        return timeZoneDefinition;
    }

    public String getTimeZoneChangeCooldownId() {
        return timeZoneChangeCooldownId;
    }

    @Override
    public String toString() {
        return "TimeZoneChangeConfig{" +
                "allowedChangesPerPeriod=" + allowedChangesPerPeriod +
                ", allowedChangedLocKey='" + allowedChangedLocKey + '\'' +
                ", allowedChangesResetLocKey='" + allowedChangesResetLocKey + '\'' +
                ", maxTimeZoneChangeHoursExclusive=" + maxTimeZoneChangeHoursExclusive +
                ", timeZoneDefinition=" + Arrays.toString(timeZoneDefinition) +
                ", timeZoneChangeCooldownId='" + timeZoneChangeCooldownId + '\'' +
                '}';
    }
}
