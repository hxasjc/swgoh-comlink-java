package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.AbilityButtonLocationType;
import hxasjc.swgoh.enums.AbilityCooldownType;
import hxasjc.swgoh.enums.AbilityType;
import hxasjc.swgoh.enums.UnitDetailsAbilityLocation;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Ability {
    private String id;
    private String nameKey;
    private String descKey;
    private String prefabName;
    private BattleCondition[] triggerCondition;
    private String stackingLineOverride;
    private AbilityTier[] tier;
    private int cooldown;
    private String icon;
    private String applyTypeTooltipKey;
    private EffectTag[] descriptiveTag;
    private EffectReference[] effectReference;
    private MessageDialog confirmationMessage;
    private AbilityButtonLocationType buttonLocation;
    private String shortDescKey;
    private AbilityType abilityType;
    private UnitDetailsAbilityLocation detailLocation;
    private String allyTargetingRuleId;
    private boolean useAsReinforcementDesc;
    private EffectTag[] interactsWithTag;
    private String subIcon;
    private AbilityAiParams aiParams;
    private AbilityCooldownType cooldownType;
    private boolean alwaysDisplayInBattleUi;
    private boolean highlightWhenReadyInBattleUi;
    private boolean hideCooldownDescription;
    private String blockingEffectId;
    private String blockedLocKey;
    private int[] ultimateChargeRequired;
    private int grantedPriority;
    private AbilitySynergy synergy;
    private EffectTarget visualTarget;

    public String getId() {
        return id;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String getDescKey() {
        return descKey;
    }

    public String getPrefabName() {
        return prefabName;
    }

    public BattleCondition[] getTriggerCondition() {
        return triggerCondition;
    }

    public String getStackingLineOverride() {
        return stackingLineOverride;
    }

    public AbilityTier[] getTier() {
        return tier;
    }

    public int getCooldown() {
        return cooldown;
    }

    public String getIcon() {
        return icon;
    }

    public String getApplyTypeTooltipKey() {
        return applyTypeTooltipKey;
    }

    public EffectTag[] getDescriptiveTag() {
        return descriptiveTag;
    }

    public EffectReference[] getEffectReference() {
        return effectReference;
    }

    public MessageDialog getConfirmationMessage() {
        return confirmationMessage;
    }

    public AbilityButtonLocationType getButtonLocation() {
        return buttonLocation;
    }

    public String getShortDescKey() {
        return shortDescKey;
    }

    public AbilityType getAbilityType() {
        return abilityType;
    }

    public UnitDetailsAbilityLocation getDetailLocation() {
        return detailLocation;
    }

    public String getAllyTargetingRuleId() {
        return allyTargetingRuleId;
    }

    public boolean isUseAsReinforcementDesc() {
        return useAsReinforcementDesc;
    }

    public EffectTag[] getInteractsWithTag() {
        return interactsWithTag;
    }

    public String getSubIcon() {
        return subIcon;
    }

    public AbilityAiParams getAiParams() {
        return aiParams;
    }

    public AbilityCooldownType getCooldownType() {
        return cooldownType;
    }

    public boolean isAlwaysDisplayInBattleUi() {
        return alwaysDisplayInBattleUi;
    }

    public boolean isHighlightWhenReadyInBattleUi() {
        return highlightWhenReadyInBattleUi;
    }

    public boolean isHideCooldownDescription() {
        return hideCooldownDescription;
    }

    public String getBlockingEffectId() {
        return blockingEffectId;
    }

    public String getBlockedLocKey() {
        return blockedLocKey;
    }

    public int[] getUltimateChargeRequired() {
        return ultimateChargeRequired;
    }

    public int getGrantedPriority() {
        return grantedPriority;
    }

    public AbilitySynergy getSynergy() {
        return synergy;
    }

    public EffectTarget getVisualTarget() {
        return visualTarget;
    }

    @Override
    public String toString() {
        return "Ability{" +
                "id='" + id + '\'' +
                ", nameKey='" + nameKey + '\'' +
                ", descKey='" + descKey + '\'' +
                ", prefabName='" + prefabName + '\'' +
                ", triggerCondition=" + Arrays.toString(triggerCondition) +
                ", stackingLineOverride='" + stackingLineOverride + '\'' +
                ", tier=" + Arrays.toString(tier) +
                ", cooldown=" + cooldown +
                ", icon='" + icon + '\'' +
                ", applyTypeTooltipKey='" + applyTypeTooltipKey + '\'' +
                ", descriptiveTag=" + Arrays.toString(descriptiveTag) +
                ", effectReference=" + Arrays.toString(effectReference) +
                ", confirmationMessage=" + confirmationMessage +
                ", buttonLocation=" + buttonLocation +
                ", shortDescKey='" + shortDescKey + '\'' +
                ", abilityType=" + abilityType +
                ", detailLocation=" + detailLocation +
                ", allyTargetingRuleId='" + allyTargetingRuleId + '\'' +
                ", useAsReinforcementDesc=" + useAsReinforcementDesc +
                ", interactsWithTag=" + Arrays.toString(interactsWithTag) +
                ", subIcon='" + subIcon + '\'' +
                ", aiParams=" + aiParams +
                ", cooldownType=" + cooldownType +
                ", alwaysDisplayInBattleUi=" + alwaysDisplayInBattleUi +
                ", highlightWhenReadyInBattleUi=" + highlightWhenReadyInBattleUi +
                ", hideCooldownDescription=" + hideCooldownDescription +
                ", blockingEffectId='" + blockingEffectId + '\'' +
                ", blockedLocKey='" + blockedLocKey + '\'' +
                ", ultimateChargeRequired=" + Arrays.toString(ultimateChargeRequired) +
                ", grantedPriority=" + grantedPriority +
                ", synergy=" + synergy +
                ", visualTarget=" + visualTarget +
                '}';
    }
}
