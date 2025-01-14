package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class BattleUnitState {
    private String unitId;
    private String healthPercent;
    private BattleUnitAbilityState[] abilityState;
    private boolean progressItem;
    private long currentHealth;
    private String shieldPercent;
    private String turnPercent;
    private long maxHealth;
    private boolean hasFled;
    private long maxShield;
    private boolean isCommander;
    private boolean isDeployed;
    private long currentShield;
    private boolean overkillItem;
    private long overkillDamage;
    private long battleContextMaxShield;
    private boolean isUnscathed;

    public String getUnitId() {
        return unitId;
    }

    public String getHealthPercent() {
        return healthPercent;
    }

    public BattleUnitAbilityState[] getAbilityState() {
        return abilityState;
    }

    public boolean isProgressItem() {
        return progressItem;
    }

    public long getCurrentHealth() {
        return currentHealth;
    }

    public String getShieldPercent() {
        return shieldPercent;
    }

    public String getTurnPercent() {
        return turnPercent;
    }

    public long getMaxHealth() {
        return maxHealth;
    }

    public boolean isHasFled() {
        return hasFled;
    }

    public long getMaxShield() {
        return maxShield;
    }

    public boolean isCommander() {
        return isCommander;
    }

    public boolean isDeployed() {
        return isDeployed;
    }

    public long getCurrentShield() {
        return currentShield;
    }

    public boolean isOverkillItem() {
        return overkillItem;
    }

    public long getOverkillDamage() {
        return overkillDamage;
    }

    public long getBattleContextMaxShield() {
        return battleContextMaxShield;
    }

    public boolean isUnscathed() {
        return isUnscathed;
    }

    @Override
    public String toString() {
        return "BattleUnitState{" +
                "unitId='" + unitId + '\'' +
                ", healthPercent='" + healthPercent + '\'' +
                ", abilityState=" + Arrays.toString(abilityState) +
                ", progressItem=" + progressItem +
                ", currentHealth=" + currentHealth +
                ", shieldPercent='" + shieldPercent + '\'' +
                ", turnPercent='" + turnPercent + '\'' +
                ", maxHealth=" + maxHealth +
                ", hasFled=" + hasFled +
                ", maxShield=" + maxShield +
                ", isCommander=" + isCommander +
                ", isDeployed=" + isDeployed +
                ", currentShield=" + currentShield +
                ", overkillItem=" + overkillItem +
                ", overkillDamage=" + overkillDamage +
                ", battleContextMaxShield=" + battleContextMaxShield +
                ", isUnscathed=" + isUnscathed +
                '}';
    }
}
