package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.CampaignNodeDifficulty;
import hxasjc.swgoh.enums.CombatType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class WarDef {
    private String id;
    private CombatType type;
    private CampaignNodeDifficulty difficulty;
    private String dailyResetCapKey;
    private WarNodeDef[] node;
    private WarBracketDef[] bracket;

    public String getId() {
        return id;
    }

    public CombatType getType() {
        return type;
    }

    public CampaignNodeDifficulty getDifficulty() {
        return difficulty;
    }

    public String getDailyResetCapKey() {
        return dailyResetCapKey;
    }

    public WarNodeDef[] getNode() {
        return node;
    }

    public WarBracketDef[] getBracket() {
        return bracket;
    }

    @Override
    public String toString() {
        return "WarDef{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", difficulty=" + difficulty +
                ", dailyResetCapKey='" + dailyResetCapKey + '\'' +
                ", node=" + Arrays.toString(node) +
                ", bracket=" + Arrays.toString(bracket) +
                '}';
    }
}
