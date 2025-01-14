package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.BattleTargetingTactic;
import hxasjc.swgoh.enums.SquadType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Squad {
    private SquadCell[] cell;
    private BattleTargetingTactic targetingTactic;
    private SquadType squadType;
    private String targetingSetId;
    private long expireTime;
    private long lastSaveTime;
    private String supportInheritFromDefinitionId;
    private DatacronBattleStat datacron;

    public SquadCell[] getCell() {
        return cell;
    }

    public BattleTargetingTactic getTargetingTactic() {
        return targetingTactic;
    }

    public SquadType getSquadType() {
        return squadType;
    }

    public String getTargetingSetId() {
        return targetingSetId;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public long getLastSaveTime() {
        return lastSaveTime;
    }

    public String getSupportInheritFromDefinitionId() {
        return supportInheritFromDefinitionId;
    }

    public DatacronBattleStat getDatacron() {
        return datacron;
    }

    @Override
    public String toString() {
        return "Squad{" +
                "cell=" + Arrays.toString(cell) +
                ", targetingTactic=" + targetingTactic +
                ", squadType=" + squadType +
                ", targetingSetId='" + targetingSetId + '\'' +
                ", expireTime=" + expireTime +
                ", lastSaveTime=" + lastSaveTime +
                ", supportInheritFromDefinitionId='" + supportInheritFromDefinitionId + '\'' +
                ", datacron=" + datacron +
                '}';
    }
}
