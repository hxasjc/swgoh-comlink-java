package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class CinematicTrigger {
    private String triggerCondition;

    public String getTriggerCondition() {
        return triggerCondition;
    }

    @Override
    public String toString() {
        return "CinematicTrigger{" +
                "triggerCondition='" + triggerCondition + '\'' +
                '}';
    }
}
