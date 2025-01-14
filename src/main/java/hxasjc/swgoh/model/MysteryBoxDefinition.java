package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class MysteryBoxDefinition {
    private String id;
    private String texture;
    private String titleKey;
    private String descKey;
    private String detailsTitleKey;
    private String detailsDescKey;
    private String iconTextKey;
    private BucketItem[] previewItem;
    private boolean showPrimaryRewards;

    public String getId() {
        return id;
    }

    public String getTexture() {
        return texture;
    }

    public String getTitleKey() {
        return titleKey;
    }

    public String getDescKey() {
        return descKey;
    }

    public String getDetailsTitleKey() {
        return detailsTitleKey;
    }

    public String getDetailsDescKey() {
        return detailsDescKey;
    }

    public String getIconTextKey() {
        return iconTextKey;
    }

    public BucketItem[] getPreviewItem() {
        return previewItem;
    }

    public boolean isShowPrimaryRewards() {
        return showPrimaryRewards;
    }

    @Override
    public String toString() {
        return "MysteryBoxDefinition{" +
                "id='" + id + '\'' +
                ", texture='" + texture + '\'' +
                ", titleKey='" + titleKey + '\'' +
                ", descKey='" + descKey + '\'' +
                ", detailsTitleKey='" + detailsTitleKey + '\'' +
                ", detailsDescKey='" + detailsDescKey + '\'' +
                ", iconTextKey='" + iconTextKey + '\'' +
                ", previewItem=" + Arrays.toString(previewItem) +
                ", showPrimaryRewards=" + showPrimaryRewards +
                '}';
    }
}
