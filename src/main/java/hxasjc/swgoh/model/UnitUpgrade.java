package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.Rarity;
import hxasjc.swgoh.enums.RelicTier;
import hxasjc.swgoh.enums.UnitTier;

import java.util.Arrays;

@SuppressWarnings("unused")
public class UnitUpgrade {
    private String id;
    private int level;
    private Rarity rarity;
    private UnitTier tier;
    private int skillTier;
    private SkillUpgrade[] skillOverride;
    private RelicTier relicTier;

    public String getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public UnitTier getTier() {
        return tier;
    }

    public int getSkillTier() {
        return skillTier;
    }

    public SkillUpgrade[] getSkillOverride() {
        return skillOverride;
    }

    public RelicTier getRelicTier() {
        return relicTier;
    }

    @Override
    public String toString() {
        return "UnitUpgrade{" +
                "id='" + id + '\'' +
                ", level=" + level +
                ", rarity=" + rarity +
                ", tier=" + tier +
                ", skillTier=" + skillTier +
                ", skillOverride=" + Arrays.toString(skillOverride) +
                ", relicTier=" + relicTier +
                '}';
    }
}
