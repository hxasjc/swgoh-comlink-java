package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class CrewMember {
    private String unitId;
    private int slot;
    private SkillDefinitionReference[] skillReference;
    private String skilllessCrewAbilityId;

    public String getUnitId() {
        return unitId;
    }

    public int getSlot() {
        return slot;
    }

    public SkillDefinitionReference[] getSkillReference() {
        return skillReference;
    }

    public String getSkilllessCrewAbilityId() {
        return skilllessCrewAbilityId;
    }

    @Override
    public String toString() {
        return "CrewMember{" +
                "unitId='" + unitId + '\'' +
                ", slot=" + slot +
                ", skillReference=" + Arrays.toString(skillReference) +
                ", skilllessCrewAbilityId='" + skilllessCrewAbilityId + '\'' +
                '}';
    }
}
