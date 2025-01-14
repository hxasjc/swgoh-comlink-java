package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class AbilityTier {
    private String descKey;
    private String upgradeDescKey;
    private int cooldownMaxOverride;
    private EffectReference[] effectReference;
    private EffectTag[] interactsWithTag;
    private String blockingEffectId;
    private String blockedLocKey;

    public String getDescKey() {
        return descKey;
    }

    public String getUpgradeDescKey() {
        return upgradeDescKey;
    }

    public int getCooldownMaxOverride() {
        return cooldownMaxOverride;
    }

    public EffectReference[] getEffectReference() {
        return effectReference;
    }

    public EffectTag[] getInteractsWithTag() {
        return interactsWithTag;
    }

    public String getBlockingEffectId() {
        return blockingEffectId;
    }

    public String getBlockedLocKey() {
        return blockedLocKey;
    }

    @Override
    public String toString() {
        return "AbilityTier{" +
                "descKey='" + descKey + '\'' +
                ", upgradeDescKey='" + upgradeDescKey + '\'' +
                ", cooldownMaxOverride=" + cooldownMaxOverride +
                ", effectReference=" + Arrays.toString(effectReference) +
                ", interactsWithTag=" + Arrays.toString(interactsWithTag) +
                ", blockingEffectId='" + blockingEffectId + '\'' +
                ", blockedLocKey='" + blockedLocKey + '\'' +
                '}';
    }
}
