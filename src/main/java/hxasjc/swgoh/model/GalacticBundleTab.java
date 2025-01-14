package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class GalacticBundleTab {
    private GalacticBundleMainElement mainElement;
    private String image;
    private String text;

    public GalacticBundleMainElement getMainElement() {
        return mainElement;
    }

    public String getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "GalacticBundleTab{" +
                "mainElement=" + mainElement +
                ", image='" + image + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
