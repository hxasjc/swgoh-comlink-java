package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class UnlockAnnouncementDefinition {
    private String feature;
    private int startOffset;
    private int interval;
    private String messageKey;

    public String getFeature() {
        return feature;
    }

    public int getStartOffset() {
        return startOffset;
    }

    public int getInterval() {
        return interval;
    }

    public String getMessageKey() {
        return messageKey;
    }

    @Override
    public String toString() {
        return "UnlockAnnouncementDefinition{" +
                "feature='" + feature + '\'' +
                ", startOffset=" + startOffset +
                ", interval=" + interval +
                ", messageKey='" + messageKey + '\'' +
                '}';
    }
}
