package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.RelicTier;
import hxasjc.swgoh.enums.UnitStat;
import hxasjc.swgoh.enums.UnitTier;

import java.util.Arrays;

@SuppressWarnings("unused")
public class DatacronAffix {
    private String targetRule;
    private String abilityId;
    private UnitStat statType;
    private long statValue;
    private String[] tag;
    private UnitTier requiredUnitTier;
    private RelicTier requiredRelicTier;
    private String scopeIcon;

    public String getTargetRule() {
        return targetRule;
    }

    public String getAbilityId() {
        return abilityId;
    }

    public UnitStat getStatType() {
        return statType;
    }

    public long getStatValue() {
        return statValue;
    }

    public String[] getTag() {
        return tag;
    }

    public UnitTier getRequiredUnitTier() {
        return requiredUnitTier;
    }

    public RelicTier getRequiredRelicTier() {
        return requiredRelicTier;
    }

    public String getScopeIcon() {
        return scopeIcon;
    }

    @Override
    public String toString() {
        return "DatacronAffix{" +
                "targetRule='" + targetRule + '\'' +
                ", abilityId='" + abilityId + '\'' +
                ", statType=" + statType +
                ", statValue=" + statValue +
                ", tag=" + Arrays.toString(tag) +
                ", requiredUnitTier=" + requiredUnitTier +
                ", requiredRelicTier=" + requiredRelicTier +
                ", scopeIcon='" + scopeIcon + '\'' +
                '}';
    }
}
