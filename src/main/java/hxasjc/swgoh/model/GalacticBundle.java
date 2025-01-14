package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class GalacticBundle {
    private String id;
    private int targetPlayerLevel;
    private UnitUpgrade[] unitUpgrade;
    private GalacticBundleTab[] tabs;
    private BucketItem[] inventoryItem;
    private String info;
    private boolean primaryGalacticBundle;

    public String getId() {
        return id;
    }

    public int getTargetPlayerLevel() {
        return targetPlayerLevel;
    }

    public UnitUpgrade[] getUnitUpgrade() {
        return unitUpgrade;
    }

    public GalacticBundleTab[] getTabs() {
        return tabs;
    }

    public BucketItem[] getInventoryItem() {
        return inventoryItem;
    }

    public String getInfo() {
        return info;
    }

    public boolean isPrimaryGalacticBundle() {
        return primaryGalacticBundle;
    }

    @Override
    public String toString() {
        return "GalacticBundle{" +
                "id='" + id + '\'' +
                ", targetPlayerLevel=" + targetPlayerLevel +
                ", unitUpgrade=" + Arrays.toString(unitUpgrade) +
                ", tabs=" + Arrays.toString(tabs) +
                ", inventoryItem=" + Arrays.toString(inventoryItem) +
                ", info='" + info + '\'' +
                ", primaryGalacticBundle=" + primaryGalacticBundle +
                '}';
    }
}
