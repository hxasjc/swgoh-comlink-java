package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.GalacticBundleMainElementInventoryType;
import hxasjc.swgoh.enums.GalacticBundleMainElementType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class GalacticBundleMainElement {
    private GalacticBundleMainElementPage[] page;
    private GalacticBundleMainElementType elementType;
    private String image;
    private String title;
    private String description;
    private GalacticBundleMainElementInventoryType inventoryType;

    public GalacticBundleMainElementPage[] getPage() {
        return page;
    }

    public GalacticBundleMainElementType getElementType() {
        return elementType;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public GalacticBundleMainElementInventoryType getInventoryType() {
        return inventoryType;
    }

    @Override
    public String toString() {
        return "GalacticBundleMainElement{" +
                "page=" + Arrays.toString(page) +
                ", elementType=" + elementType +
                ", image='" + image + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", inventoryType=" + inventoryType +
                '}';
    }
}
