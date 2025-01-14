package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class MissionGrantedAbility {
    private String abilityId;
    private String targetRuleId;
    private Requirement unlockRequirement;
    private String rankLabelOverrideKey;
    private boolean useOverlayIcon;
    private String overlaySpriteName;
    private String[] zonesToApplyTo;
    private boolean showInPlatoonView;
    private AbilityModifierData modifierData;
    private String conditionDescKey;

    public String getAbilityId() {
        return abilityId;
    }

    public String getTargetRuleId() {
        return targetRuleId;
    }

    public Requirement getUnlockRequirement() {
        return unlockRequirement;
    }

    public String getRankLabelOverrideKey() {
        return rankLabelOverrideKey;
    }

    public boolean isUseOverlayIcon() {
        return useOverlayIcon;
    }

    public String getOverlaySpriteName() {
        return overlaySpriteName;
    }

    public String[] getZonesToApplyTo() {
        return zonesToApplyTo;
    }

    public boolean isShowInPlatoonView() {
        return showInPlatoonView;
    }

    public AbilityModifierData getModifierData() {
        return modifierData;
    }

    public String getConditionDescKey() {
        return conditionDescKey;
    }

    @Override
    public String toString() {
        return "MissionGrantedAbility{" +
                "abilityId='" + abilityId + '\'' +
                ", targetRuleId='" + targetRuleId + '\'' +
                ", unlockRequirement=" + unlockRequirement +
                ", rankLabelOverrideKey='" + rankLabelOverrideKey + '\'' +
                ", useOverlayIcon=" + useOverlayIcon +
                ", overlaySpriteName='" + overlaySpriteName + '\'' +
                ", zonesToApplyTo=" + Arrays.toString(zonesToApplyTo) +
                ", showInPlatoonView=" + showInPlatoonView +
                ", modifierData=" + modifierData +
                ", conditionDescKey='" + conditionDescKey + '\'' +
                '}';
    }
}
