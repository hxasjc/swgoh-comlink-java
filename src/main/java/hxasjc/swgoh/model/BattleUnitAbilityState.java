package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class BattleUnitAbilityState {
    private String abilityId;
    private int cooldown;

    public String getAbilityId() {
        return abilityId;
    }

    public int getCooldown() {
        return cooldown;
    }

    @Override
    public String toString() {
        return "BattleUnitAbilityState{" +
                "abilityId='" + abilityId + '\'' +
                ", cooldown=" + cooldown +
                '}';
    }
}
