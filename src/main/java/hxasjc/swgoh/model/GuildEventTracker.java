package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class GuildEventTracker {
    private String definitionId;
    private long completedStars;
    private long endTime;

    public String getDefinitionId() {
        return definitionId;
    }

    public long getCompletedStars() {
        return completedStars;
    }

    public long getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "GuildEventTracker{" +
                "definitionId='" + definitionId + '\'' +
                ", completedStars=" + completedStars +
                ", endTime=" + endTime +
                '}';
    }
}
