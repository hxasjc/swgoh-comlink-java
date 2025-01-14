package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class PlayerRating {
    private PlayerSkillRating playerSkillRating;
    private PlayerRankStatus playerRankStatus;

    public PlayerSkillRating getPlayerSkillRating() {
        return playerSkillRating;
    }

    public PlayerRankStatus getPlayerRankStatus() {
        return playerRankStatus;
    }

    @Override
    public String toString() {
        return "PlayerRating{" +
                "playerSkillRating=" + playerSkillRating +
                ", playerRankStatus=" + playerRankStatus +
                '}';
    }
}
