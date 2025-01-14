package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.ActionLinkType;

@SuppressWarnings("unused")
public class ActionLink {
    private String link;
    private ActionLinkType type;

    public String getLink() {
        return link;
    }

    public ActionLinkType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ActionLink{" +
                "link='" + link + '\'' +
                ", type=" + type +
                '}';
    }
}
