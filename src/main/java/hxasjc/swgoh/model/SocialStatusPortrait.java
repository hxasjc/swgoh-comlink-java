package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class SocialStatusPortrait {
    private int id;
    private String playerPortraitId;

    public int getId() {
        return id;
    }

    public String getPlayerPortraitId() {
        return playerPortraitId;
    }

    @Override
    public String toString() {
        return "SocialStatusPortrait{" +
                "id=" + id +
                ", playerPortraitId='" + playerPortraitId + '\'' +
                '}';
    }
}
