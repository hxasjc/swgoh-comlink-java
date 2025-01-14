package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class StatModSetBonus {
    private String[] abilityId;
    private Stat stat;

    public String[] getAbilityId() {
        return abilityId;
    }

    public Stat getStat() {
        return stat;
    }

    @Override
    public String toString() {
        return "StatModSetBonus{" +
                "abilityId=" + Arrays.toString(abilityId) +
                ", stat=" + stat +
                '}';
    }
}
