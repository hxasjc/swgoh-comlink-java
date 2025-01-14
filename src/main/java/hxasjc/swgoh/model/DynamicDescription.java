package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.DynamicDescriptionTextAlignmentType;
import hxasjc.swgoh.enums.DynamicDescriptionType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class DynamicDescription {
    private DynamicDescriptionType descriptionType;
    private String unitTexture;
    private String unitNameKey;
    private String abilityNameKey;
    private String abilityDescriptionKey;
    private String abilityTexture;
    private String headerKey;
    private String textKey;
    private int marginLeft;
    private DynamicDescriptionTextColumn[] textColumn;
    private DynamicDescriptionTextAlignmentType textAlignment;
    private String backgroundOverrideSprite;

    public DynamicDescriptionType getDescriptionType() {
        return descriptionType;
    }

    public String getUnitTexture() {
        return unitTexture;
    }

    public String getUnitNameKey() {
        return unitNameKey;
    }

    public String getAbilityNameKey() {
        return abilityNameKey;
    }

    public String getAbilityDescriptionKey() {
        return abilityDescriptionKey;
    }

    public String getAbilityTexture() {
        return abilityTexture;
    }

    public String getHeaderKey() {
        return headerKey;
    }

    public String getTextKey() {
        return textKey;
    }

    public int getMarginLeft() {
        return marginLeft;
    }

    public DynamicDescriptionTextColumn[] getTextColumn() {
        return textColumn;
    }

    public DynamicDescriptionTextAlignmentType getTextAlignment() {
        return textAlignment;
    }

    public String getBackgroundOverrideSprite() {
        return backgroundOverrideSprite;
    }

    @Override
    public String toString() {
        return "DynamicDescription{" +
                "descriptionType=" + descriptionType +
                ", unitTexture='" + unitTexture + '\'' +
                ", unitNameKey='" + unitNameKey + '\'' +
                ", abilityNameKey='" + abilityNameKey + '\'' +
                ", abilityDescriptionKey='" + abilityDescriptionKey + '\'' +
                ", abilityTexture='" + abilityTexture + '\'' +
                ", headerKey='" + headerKey + '\'' +
                ", textKey='" + textKey + '\'' +
                ", marginLeft=" + marginLeft +
                ", textColumn=" + Arrays.toString(textColumn) +
                ", textAlignment=" + textAlignment +
                ", backgroundOverrideSprite='" + backgroundOverrideSprite + '\'' +
                '}';
    }
}
