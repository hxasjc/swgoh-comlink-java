package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.DynamicDescriptionTextAlignmentType;

@SuppressWarnings("unused")
public class DynamicDescriptionTextColumn {
    private String headerKey;
    private String bodyKey;
    private DynamicDescriptionTextAlignmentType bodyAlignment;
    private String tag;

    public String getHeaderKey() {
        return headerKey;
    }

    public String getBodyKey() {
        return bodyKey;
    }

    public DynamicDescriptionTextAlignmentType getBodyAlignment() {
        return bodyAlignment;
    }

    public String getTag() {
        return tag;
    }

    @Override
    public String toString() {
        return "DynamicDescriptionTextColumn{" +
                "headerKey='" + headerKey + '\'' +
                ", bodyKey='" + bodyKey + '\'' +
                ", bodyAlignment=" + bodyAlignment +
                ", tag='" + tag + '\'' +
                '}';
    }
}
