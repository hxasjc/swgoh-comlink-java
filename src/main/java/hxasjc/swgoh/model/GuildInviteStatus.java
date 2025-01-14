package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.GuildInviteType;

@SuppressWarnings("unused")
public class GuildInviteStatus {
    private String guildId;
    private long expireTime;
    private String playerId;
    private GuildInviteType type;
    private Unit leaderUnit;
    private long sentTime;
    private int playerLevel;
    private String playerName;

    public String getGuildId() {
        return guildId;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public String getPlayerId() {
        return playerId;
    }

    public GuildInviteType getType() {
        return type;
    }

    public Unit getLeaderUnit() {
        return leaderUnit;
    }

    public long getSentTime() {
        return sentTime;
    }

    public int getPlayerLevel() {
        return playerLevel;
    }

    public String getPlayerName() {
        return playerName;
    }

    @Override
    public String toString() {
        return "GuildInviteStatus{" +
                "guildId='" + guildId + '\'' +
                ", expireTime=" + expireTime +
                ", playerId='" + playerId + '\'' +
                ", type=" + type +
                ", leaderUnit=" + leaderUnit +
                ", sentTime=" + sentTime +
                ", playerLevel=" + playerLevel +
                ", playerName='" + playerName + '\'' +
                '}';
    }
}
