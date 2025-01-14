package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.RelicTier;
import hxasjc.swgoh.enums.UnitTier;

import java.util.Arrays;

@SuppressWarnings("unused")
public class RaidModifier {
    private String descKey;
    private MissionGrantedAbility[] grantedAbility;
    private long scoreMultiplierUnscaled;
    private UnitTier requiredUnitTier;
    private RelicTier requiredRelicTier;
    private RaidAbilityOverride[] abilityOverride;

    public String getDescKey() {
        return descKey;
    }

    public MissionGrantedAbility[] getGrantedAbility() {
        return grantedAbility;
    }

    public long getScoreMultiplierUnscaled() {
        return scoreMultiplierUnscaled;
    }

    public UnitTier getRequiredUnitTier() {
        return requiredUnitTier;
    }

    public RelicTier getRequiredRelicTier() {
        return requiredRelicTier;
    }

    public RaidAbilityOverride[] getAbilityOverride() {
        return abilityOverride;
    }

    @Override
    public String toString() {
        return "RaidModifier{" +
                "descKey='" + descKey + '\'' +
                ", grantedAbility=" + Arrays.toString(grantedAbility) +
                ", scoreMultiplierUnscaled=" + scoreMultiplierUnscaled +
                ", requiredUnitTier=" + requiredUnitTier +
                ", requiredRelicTier=" + requiredRelicTier +
                ", abilityOverride=" + Arrays.toString(abilityOverride) +
                '}';
    }
}
