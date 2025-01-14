package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.EffectTargetBattleSide;

@SuppressWarnings("unused")
public class AbilityModifierData {
    private EffectTargetBattleSide battleSide;
    private String tint;
    private String tierKey;
    private String icon;

    public EffectTargetBattleSide getBattleSide() {
        return battleSide;
    }

    public String getTint() {
        return tint;
    }

    public String getTierKey() {
        return tierKey;
    }

    public String getIcon() {
        return icon;
    }

    @Override
    public String toString() {
        return "AbilityModifierData{" +
                "battleSide=" + battleSide +
                ", tint='" + tint + '\'' +
                ", tierKey='" + tierKey + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
