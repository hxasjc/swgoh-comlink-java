package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class SocialStatusTitle {
    private int id;
    private String playerTitleId;

    public int getId() {
        return id;
    }

    public String getPlayerTitleId() {
        return playerTitleId;
    }

    @Override
    public String toString() {
        return "SocialStatusTitle{" +
                "id=" + id +
                ", playerTitleId='" + playerTitleId + '\'' +
                '}';
    }
}
