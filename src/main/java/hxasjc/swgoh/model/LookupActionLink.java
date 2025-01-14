package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class LookupActionLink {
    private String deskKey;
    private ActionLink actionLink;

    public String getDeskKey() {
        return deskKey;
    }

    public ActionLink getActionLink() {
        return actionLink;
    }

    @Override
    public String toString() {
        return "LookupActionLink{" +
                "deskKey='" + deskKey + '\'' +
                ", actionLink=" + actionLink +
                '}';
    }
}
