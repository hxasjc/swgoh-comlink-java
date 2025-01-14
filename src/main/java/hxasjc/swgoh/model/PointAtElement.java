package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.PointAtRotationBehavior;
import hxasjc.swgoh.enums.PointerType;

@SuppressWarnings("unused")
public class PointAtElement {
    private String elementId;
    private int offsetX;
    private int offsetY;
    private double rotation;
    private int textOffsetX;
    private int textOffsetY;
    private String textOffsetAnchor;
    private boolean update;
    private boolean clamp;
    private PointAtRotationBehavior rotationBehavior;
    private double delaySeconds;
    private boolean showArrow;
    private boolean showHighlight;
    private String imageSource;
    private int imageWidth;
    private int imageHeight;
    private int imageOffsetX;
    private int imageOffsetY;
    private PointerType pointerType;
    private boolean tapDismiss;
    private boolean scrimViewable;
    private boolean scrimBlocking;
    private boolean showText;
    private boolean showBartender;
    private String bartenderTexture;

    public String getElementId() {
        return elementId;
    }

    public int getOffsetX() {
        return offsetX;
    }

    public int getOffsetY() {
        return offsetY;
    }

    public double getRotation() {
        return rotation;
    }

    public int getTextOffsetX() {
        return textOffsetX;
    }

    public int getTextOffsetY() {
        return textOffsetY;
    }

    public String getTextOffsetAnchor() {
        return textOffsetAnchor;
    }

    public boolean isUpdate() {
        return update;
    }

    public boolean isClamp() {
        return clamp;
    }

    public PointAtRotationBehavior getRotationBehavior() {
        return rotationBehavior;
    }

    public double getDelaySeconds() {
        return delaySeconds;
    }

    public boolean isShowArrow() {
        return showArrow;
    }

    public boolean isShowHighlight() {
        return showHighlight;
    }

    public String getImageSource() {
        return imageSource;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public int getImageOffsetX() {
        return imageOffsetX;
    }

    public int getImageOffsetY() {
        return imageOffsetY;
    }

    public PointerType getPointerType() {
        return pointerType;
    }

    public boolean isTapDismiss() {
        return tapDismiss;
    }

    public boolean isScrimViewable() {
        return scrimViewable;
    }

    public boolean isScrimBlocking() {
        return scrimBlocking;
    }

    public boolean isShowText() {
        return showText;
    }

    public boolean isShowBartender() {
        return showBartender;
    }

    public String getBartenderTexture() {
        return bartenderTexture;
    }

    @Override
    public String toString() {
        return "PointAtElement{" +
                "elementId='" + elementId + '\'' +
                ", offsetX=" + offsetX +
                ", offsetY=" + offsetY +
                ", rotation=" + rotation +
                ", textOffsetX=" + textOffsetX +
                ", textOffsetY=" + textOffsetY +
                ", textOffsetAnchor='" + textOffsetAnchor + '\'' +
                ", update=" + update +
                ", clamp=" + clamp +
                ", rotationBehavior=" + rotationBehavior +
                ", delaySeconds=" + delaySeconds +
                ", showArrow=" + showArrow +
                ", showHighlight=" + showHighlight +
                ", imageSource='" + imageSource + '\'' +
                ", imageWidth=" + imageWidth +
                ", imageHeight=" + imageHeight +
                ", imageOffsetX=" + imageOffsetX +
                ", imageOffsetY=" + imageOffsetY +
                ", pointerType=" + pointerType +
                ", tapDismiss=" + tapDismiss +
                ", scrimViewable=" + scrimViewable +
                ", scrimBlocking=" + scrimBlocking +
                ", showText=" + showText +
                ", showBartender=" + showBartender +
                ", bartenderTexture='" + bartenderTexture + '\'' +
                '}';
    }
}
