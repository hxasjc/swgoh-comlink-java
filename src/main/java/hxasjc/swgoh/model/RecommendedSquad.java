package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class RecommendedSquad {
    private String descriptionKey;
    private String thumbnail;
    private String[] unitDefId;
    private String name;
    private Requirement showRequirement;
    private Requirement hideRequirement;
    private ActionLink actionLink;
    private String id;

    public String getDescriptionKey() {
        return descriptionKey;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String[] getUnitDefId() {
        return unitDefId;
    }

    public String getName() {
        return name;
    }

    public Requirement getShowRequirement() {
        return showRequirement;
    }

    public Requirement getHideRequirement() {
        return hideRequirement;
    }

    public ActionLink getActionLink() {
        return actionLink;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "RecommendedSquad{" +
                "descriptionKey='" + descriptionKey + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", unitDefId=" + Arrays.toString(unitDefId) +
                ", name='" + name + '\'' +
                ", showRequirement=" + showRequirement +
                ", hideRequirement=" + hideRequirement +
                ", actionLink=" + actionLink +
                ", id='" + id + '\'' +
                '}';
    }
}
