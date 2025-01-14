package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class HelpTile {
    private String textKey;
    private String image;
    private String titleKey;

    public String getTextKey() {
        return textKey;
    }

    public String getImage() {
        return image;
    }

    public String getTitleKey() {
        return titleKey;
    }

    @Override
    public String toString() {
        return "HelpTile{" +
                "textKey='" + textKey + '\'' +
                ", image='" + image + '\'' +
                ", titleKey='" + titleKey + '\'' +
                '}';
    }
}
