package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.Rarity;
import hxasjc.swgoh.enums.RelicTier;
import hxasjc.swgoh.enums.UnitTier;

@SuppressWarnings("unused")
public class SkillDefinitionReference {
    private String skillId;
    private UnitTier requiredTier;
    private Rarity requiredRarity;
    private RelicTier requiredRelicTier;

    public String getSkillId() {
        return skillId;
    }

    public UnitTier getRequiredTier() {
        return requiredTier;
    }

    public Rarity getRequiredRarity() {
        return requiredRarity;
    }

    public RelicTier getRequiredRelicTier() {
        return requiredRelicTier;
    }

    @Override
    public String toString() {
        return "SkillDefinitionReference{" +
                "skillId='" + skillId + '\'' +
                ", requiredTier=" + requiredTier +
                ", requiredRarity=" + requiredRarity +
                ", requiredRelicTier=" + requiredRelicTier +
                '}';
    }
}
