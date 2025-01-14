package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class TerritoryTournamentLeagueDefinition {
    private String id;
    private String nameKey;
    private String icon;
    private int rank;
    private String sprite;
    private String portraitFrame;
    private String blankIcon;

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

    public String getBlankIcon() {
        return blankIcon;
    }

    @Override
    public String toString() {
        return "TerritoryTournamentLeagueDefinition{" +
                "id='" + id + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", icon='" + icon + '\'' +
                ", rank=" + rank +
                ", sprite='" + sprite + '\'' +
                ", portraitFrame='" + portraitFrame + '\'' +
                ", blankIcon='" + blankIcon + '\'' +
                '}';
    }
}
