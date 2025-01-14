package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.GuildMemberLevel;

import java.util.Arrays;

@SuppressWarnings("unused")
public class GuildMember {
    private String playerId;
    private String playerName;
    private int playerLevel;
    private GuildMemberLevel memberLevel;
    private int guildXp;
    private long lastActivityTime;
    private int squadPower;
    private GuildMemberContribution[] memberContribution;
    private long guildJoinTime;
    private long galacticPower;
    private String playerTitle;
    private String playerPortrait;
    private SeasonStatus[] seasonStatus;
    private long lifetimeSeasonScore;
    private String leagueId;
    private long shipGalacticPower;
    private long characterGalacticPower;
    private String nucleusId;

    public String getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerLevel() {
        return playerLevel;
    }

    public GuildMemberLevel getMemberLevel() {
        return memberLevel;
    }

    public int getGuildXp() {
        return guildXp;
    }

    public long getLastActivityTime() {
        return lastActivityTime;
    }

    public int getSquadPower() {
        return squadPower;
    }

    public GuildMemberContribution[] getMemberContribution() {
        return memberContribution;
    }

    public long getGuildJoinTime() {
        return guildJoinTime;
    }

    public long getGalacticPower() {
        return galacticPower;
    }

    public String getPlayerTitle() {
        return playerTitle;
    }

    public String getPlayerPortrait() {
        return playerPortrait;
    }

    public SeasonStatus[] getSeasonStatus() {
        return seasonStatus;
    }

    public long getLifetimeSeasonScore() {
        return lifetimeSeasonScore;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public long getShipGalacticPower() {
        return shipGalacticPower;
    }

    public long getCharacterGalacticPower() {
        return characterGalacticPower;
    }

    public String getNucleusId() {
        return nucleusId;
    }

    @Override
    public String toString() {
        return "GuildMember{" +
                "playerId='" + playerId + '\'' +
                ", playerName='" + playerName + '\'' +
                ", playerLevel=" + playerLevel +
                ", memberLevel=" + memberLevel +
                ", guildXp=" + guildXp +
                ", lastActivityTime=" + lastActivityTime +
                ", squadPower=" + squadPower +
                ", memberContribution=" + Arrays.toString(memberContribution) +
                ", guildJoinTime=" + guildJoinTime +
                ", galacticPower=" + galacticPower +
                ", playerTitle='" + playerTitle + '\'' +
                ", playerPortrait='" + playerPortrait + '\'' +
                ", seasonStatus=" + Arrays.toString(seasonStatus) +
                ", lifetimeSeasonScore=" + lifetimeSeasonScore +
                ", leagueId='" + leagueId + '\'' +
                ", shipGalacticPower=" + shipGalacticPower +
                ", characterGalacticPower=" + characterGalacticPower +
                ", nucleusId='" + nucleusId + '\'' +
                '}';
    }
}
