package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class RaidAbilityOverride {
    private String abilityId;
    private String targetRuleId;
    private String locKey;
    private String icon;

    public String getAbilityId() {
        return abilityId;
    }

    public String getTargetRuleId() {
        return targetRuleId;
    }

    public String getLocKey() {
        return locKey;
    }

    public String getIcon() {
        return icon;
    }

    @Override
    public String toString() {
        return "RaidAbilityOverride{" +
                "abilityId='" + abilityId + '\'' +
                ", targetRuleId='" + targetRuleId + '\'' +
                ", locKey='" + locKey + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
