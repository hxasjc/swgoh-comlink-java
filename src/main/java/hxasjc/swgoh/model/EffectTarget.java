package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.*;

import java.util.Arrays;

@SuppressWarnings("unused")
public class EffectTarget {
    private EffectTargetUnitSelect unitSelect;
    private EffectTargetBattleSide battleSide;
    private UnitClass[] unitClass;
    private ForceAlignment[] forceAlignment;
    private EffectTargetCategoryCriteria category;
    private UnitHealthState healthState;
    private StatValueRange[] statValue;
    private EffectTagCriteria[] activeEffectTagCriteria;
    private BattleDeploymentState battleDeploymentState;
    private String id;
    private boolean excludeSelf;
    private boolean excludeSelectedTarget;
    private EffectTargetCategoryCriteria requiredCategory;
    private EffectTagCriteria[] requiredActiveEffectTagCriteria;

    public EffectTargetUnitSelect getUnitSelect() {
        return unitSelect;
    }

    public EffectTargetBattleSide getBattleSide() {
        return battleSide;
    }

    public UnitClass[] getUnitClass() {
        return unitClass;
    }

    public ForceAlignment[] getForceAlignment() {
        return forceAlignment;
    }

    public EffectTargetCategoryCriteria getCategory() {
        return category;
    }

    public UnitHealthState getHealthState() {
        return healthState;
    }

    public StatValueRange[] getStatValue() {
        return statValue;
    }

    public EffectTagCriteria[] getActiveEffectTagCriteria() {
        return activeEffectTagCriteria;
    }

    public BattleDeploymentState getBattleDeploymentState() {
        return battleDeploymentState;
    }

    public String getId() {
        return id;
    }

    public boolean isExcludeSelf() {
        return excludeSelf;
    }

    public boolean isExcludeSelectedTarget() {
        return excludeSelectedTarget;
    }

    public EffectTargetCategoryCriteria getRequiredCategory() {
        return requiredCategory;
    }

    public EffectTagCriteria[] getRequiredActiveEffectTagCriteria() {
        return requiredActiveEffectTagCriteria;
    }

    @Override
    public String toString() {
        return "EffectTarget{" +
                "unitSelect=" + unitSelect +
                ", battleSide=" + battleSide +
                ", unitClass=" + Arrays.toString(unitClass) +
                ", forceAlignment=" + Arrays.toString(forceAlignment) +
                ", category=" + category +
                ", healthState=" + healthState +
                ", statValue=" + Arrays.toString(statValue) +
                ", activeEffectTagCriteria=" + Arrays.toString(activeEffectTagCriteria) +
                ", battleDeploymentState=" + battleDeploymentState +
                ", id='" + id + '\'' +
                ", excludeSelf=" + excludeSelf +
                ", excludeSelectedTarget=" + excludeSelectedTarget +
                ", requiredCategory=" + requiredCategory +
                ", requiredActiveEffectTagCriteria=" + Arrays.toString(requiredActiveEffectTagCriteria) +
                '}';
    }
}
