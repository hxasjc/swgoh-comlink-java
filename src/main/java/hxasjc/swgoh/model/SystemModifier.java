package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class SystemModifier {
    private String id;
    private ScaleItemModifier scaleItemModifier;
    private ModifierLocation location;
    private AdditionalItemModifier additionalItemModifier;
    private String descKey;
    private ActionLink actionLink;

    public String getId() {
        return id;
    }

    public ScaleItemModifier getScaleItemModifier() {
        return scaleItemModifier;
    }

    public ModifierLocation getLocation() {
        return location;
    }

    public AdditionalItemModifier getAdditionalItemModifier() {
        return additionalItemModifier;
    }

    public String getDescKey() {
        return descKey;
    }

    public ActionLink getActionLink() {
        return actionLink;
    }

    @Override
    public String toString() {
        return "SystemModifier{" +
                "id='" + id + '\'' +
                ", scaleItemModifier=" + scaleItemModifier +
                ", location=" + location +
                ", additionalItemModifier=" + additionalItemModifier +
                ", descKey='" + descKey + '\'' +
                ", actionLink=" + actionLink +
                '}';
    }
}
