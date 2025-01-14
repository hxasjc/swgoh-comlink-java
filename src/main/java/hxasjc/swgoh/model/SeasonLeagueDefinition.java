package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class SeasonLeagueDefinition {
    private String id;
    private String nameKey;
    private String icon;
    private int rank;
    private String sprite;
    private String portraitFrame;

    public String getId() {
        return id;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String getIcon() {
        return icon;
    }

    public int getRank() {
        return rank;
    }

    public String getSprite() {
        return sprite;
    }

    public String getPortraitFrame() {
        return portraitFrame;
    }

    @Override
    public String toString() {
        return "SeasonLeagueDefinition{" +
                "id='" + id + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", icon='" + icon + '\'' +
                ", rank=" + rank +
                ", sprite='" + sprite + '\'' +
                ", portraitFrame='" + portraitFrame + '\'' +
                '}';
    }
}
