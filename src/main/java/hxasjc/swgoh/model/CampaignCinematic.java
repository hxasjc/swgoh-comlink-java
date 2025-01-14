package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class CampaignCinematic {
    private CinematicTrigger trigger;
    private Environment environment;
    private Environment subsequentViewingEnvironment;

    public CinematicTrigger getTrigger() {
        return trigger;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public Environment getSubsequentViewingEnvironment() {
        return subsequentViewingEnvironment;
    }

    @Override
    public String toString() {
        return "CampaignCinematic{" +
                "trigger=" + trigger +
                ", environment=" + environment +
                ", subsequentViewingEnvironment=" + subsequentViewingEnvironment +
                '}';
    }
}
