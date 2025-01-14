package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class MessageDialog {
    private String titleKey;
    private String descKey;

    public String getTitleKey() {
        return titleKey;
    }

    public String getDescKey() {
        return descKey;
    }

    @Override
    public String toString() {
        return "MessageDialog{" +
                "titleKey='" + titleKey + '\'' +
                ", descKey='" + descKey + '\'' +
                '}';
    }
}
