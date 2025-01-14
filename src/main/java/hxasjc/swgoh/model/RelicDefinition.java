package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class RelicDefinition {
    private String[] relicTierDefinitionId;
    private String upgradeTableId;
    private String alignmentColorOverride;
    private String texture;
    private String nameKey;

    public String[] getRelicTierDefinitionId() {
        return relicTierDefinitionId;
    }

    public String getUpgradeTableId() {
        return upgradeTableId;
    }

    public String getAlignmentColorOverride() {
        return alignmentColorOverride;
    }

    public String getTexture() {
        return texture;
    }

    public String getNameKey() {
        return nameKey;
    }

    @Override
    public String toString() {
        return "RelicDefinition{" +
                "relicTierDefinitionId=" + Arrays.toString(relicTierDefinitionId) +
                ", upgradeTableId='" + upgradeTableId + '\'' +
                ", alignmentColorOverride='" + alignmentColorOverride + '\'' +
                ", texture='" + texture + '\'' +
                ", nameKey='" + nameKey + '\'' +
                '}';
    }
}
