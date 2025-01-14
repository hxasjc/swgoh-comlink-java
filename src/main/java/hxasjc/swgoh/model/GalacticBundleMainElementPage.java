package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class GalacticBundleMainElementPage {
    private String image;
    private String title;
    private String[] description;
    private String[] sprite;

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String[] getDescription() {
        return description;
    }

    public String[] getSprite() {
        return sprite;
    }

    @Override
    public String toString() {
        return "GalacticBundleMainElementPage{" +
                "image='" + image + '\'' +
                ", title='" + title + '\'' +
                ", description=" + Arrays.toString(description) +
                ", sprite=" + Arrays.toString(sprite) +
                '}';
    }
}
