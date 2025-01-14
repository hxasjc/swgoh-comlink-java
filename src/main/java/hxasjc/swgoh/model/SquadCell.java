package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.SquadUnitType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class SquadCell {
    private String unitId;
    private String unitDefId;
    private int cellIndex;
    private UnitBattleStat unitBattleStat;
    private String messageReticle;
    private boolean progressItem;
    private SquadUnitType squadUnitType;
    private UnitBattleStat[] crewBattleStat;
    private BattleUnitState unitState;
    private boolean selectable;
    private boolean overkillItem;
    private String inheritFromDefinitionId;

    public String getUnitId() {
        return unitId;
    }

    public String getUnitDefId() {
        return unitDefId;
    }

    public int getCellIndex() {
        return cellIndex;
    }

    public UnitBattleStat getUnitBattleStat() {
        return unitBattleStat;
    }

    public String getMessageReticle() {
        return messageReticle;
    }

    public boolean isProgressItem() {
        return progressItem;
    }

    public SquadUnitType getSquadUnitType() {
        return squadUnitType;
    }

    public UnitBattleStat[] getCrewBattleStat() {
        return crewBattleStat;
    }

    public BattleUnitState getUnitState() {
        return unitState;
    }

    public boolean isSelectable() {
        return selectable;
    }

    public boolean isOverkillItem() {
        return overkillItem;
    }

    public String getInheritFromDefinitionId() {
        return inheritFromDefinitionId;
    }

    @Override
    public String toString() {
        return "SquadCell{" +
                "unitId='" + unitId + '\'' +
                ", unitDefId='" + unitDefId + '\'' +
                ", cellIndex=" + cellIndex +
                ", unitBattleStat=" + unitBattleStat +
                ", messageReticle='" + messageReticle + '\'' +
                ", progressItem=" + progressItem +
                ", squadUnitType=" + squadUnitType +
                ", crewBattleStat=" + Arrays.toString(crewBattleStat) +
                ", unitState=" + unitState +
                ", selectable=" + selectable +
                ", overkillItem=" + overkillItem +
                ", inheritFromDefinitionId='" + inheritFromDefinitionId + '\'' +
                '}';
    }
}
