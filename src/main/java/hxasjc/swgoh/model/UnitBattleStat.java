package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.RelicTier;
import hxasjc.swgoh.enums.ThreatLevel;
import hxasjc.swgoh.enums.UnitTier;

import java.util.Arrays;

@SuppressWarnings("unused")
public class UnitBattleStat {
    private int actionCountMin;
    private int actionCountMax;
    private StatDef battleStat;
    private int level;
    private UnitTier tier;
    private EquipmentSlot[] equipment;
    private Skill[] skill;
    private StatMod[] statMod;
    private String unitDefId;
    private String unitId;
    private RelicTier unitRelicTier;
    private String[] purchasedAbilityTier;
    private double overrideAllStatsMultiplier;
    private Stat[] overrideStatMultiplier;
    private boolean skipStatsOverwrite;
    private boolean enableLeaderAbility;
    private ThreatLevel ThreatLevelOverride;
    private String overrideAllStatsTable;

    public int getActionCountMin() {
        return actionCountMin;
    }

    public int getActionCountMax() {
        return actionCountMax;
    }

    public StatDef getBattleStat() {
        return battleStat;
    }

    public int getLevel() {
        return level;
    }

    public UnitTier getTier() {
        return tier;
    }

    public EquipmentSlot[] getEquipment() {
        return equipment;
    }

    public Skill[] getSkill() {
        return skill;
    }

    public StatMod[] getStatMod() {
        return statMod;
    }

    public String getUnitDefId() {
        return unitDefId;
    }

    public String getUnitId() {
        return unitId;
    }

    public RelicTier getUnitRelicTier() {
        return unitRelicTier;
    }

    public String[] getPurchasedAbilityTier() {
        return purchasedAbilityTier;
    }

    public double getOverrideAllStatsMultiplier() {
        return overrideAllStatsMultiplier;
    }

    public Stat[] getOverrideStatMultiplier() {
        return overrideStatMultiplier;
    }

    public boolean isSkipStatsOverwrite() {
        return skipStatsOverwrite;
    }

    public boolean isEnableLeaderAbility() {
        return enableLeaderAbility;
    }

    public ThreatLevel getThreatLevelOverride() {
        return ThreatLevelOverride;
    }

    public String getOverrideAllStatsTable() {
        return overrideAllStatsTable;
    }

    @Override
    public String toString() {
        return "UnitBattleStat{" +
                "actionCountMin=" + actionCountMin +
                ", actionCountMax=" + actionCountMax +
                ", battleStat=" + battleStat +
                ", level=" + level +
                ", tier=" + tier +
                ", equipment=" + Arrays.toString(equipment) +
                ", skill=" + Arrays.toString(skill) +
                ", statMod=" + Arrays.toString(statMod) +
                ", unitDefId='" + unitDefId + '\'' +
                ", unitId='" + unitId + '\'' +
                ", unitRelicTier=" + unitRelicTier +
                ", purchasedAbilityTier=" + Arrays.toString(purchasedAbilityTier) +
                ", overrideAllStatsMultiplier=" + overrideAllStatsMultiplier +
                ", overrideStatMultiplier=" + Arrays.toString(overrideStatMultiplier) +
                ", skipStatsOverwrite=" + skipStatsOverwrite +
                ", enableLeaderAbility=" + enableLeaderAbility +
                ", ThreatLevelOverride=" + ThreatLevelOverride +
                ", overrideAllStatsTable='" + overrideAllStatsTable + '\'' +
                '}';
    }
}
