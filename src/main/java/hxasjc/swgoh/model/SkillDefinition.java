package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.OmicronMode;
import hxasjc.swgoh.enums.SkillType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class SkillDefinition {
    private String id;
    private String nameKey;
    private String iconKey;
    private SkillTierDefinition[] tier;
    private String abilityReference;
    private SkillType skillType;
    private boolean isZeta;
    private OmicronMode omicronMode;

    public String getId() {
        return id;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String getIconKey() {
        return iconKey;
    }

    public SkillTierDefinition[] getTier() {
        return tier;
    }

    public String getAbilityReference() {
        return abilityReference;
    }

    public SkillType getSkillType() {
        return skillType;
    }

    public boolean isZeta() {
        return isZeta;
    }

    public OmicronMode getOmicronMode() {
        return omicronMode;
    }

    @Override
    public String toString() {
        return "SkillDefinition{" +
                "id='" + id + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", iconKey='" + iconKey + '\'' +
                ", tier=" + Arrays.toString(tier) +
                ", abilityReference='" + abilityReference + '\'' +
                ", skillType=" + skillType +
                ", isZeta=" + isZeta +
                ", omicronMode=" + omicronMode +
                '}';
    }
}
