package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class ChallengeTask {
    private String id;
    private String nameKey;
    private String descKey;
    private ActionLink actionLinkDef;
    private boolean hideToast;

    public String getId() {
        return id;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String getDescKey() {
        return descKey;
    }

    public ActionLink getActionLinkDef() {
        return actionLinkDef;
    }

    public boolean isHideToast() {
        return hideToast;
    }

    @Override
    public String toString() {
        return "ChallengeTask{" +
                "id='" + id + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", descKey='" + descKey + '\'' +
                ", actionLinkDef=" + actionLinkDef +
                ", hideToast=" + hideToast +
                '}';
    }
}
