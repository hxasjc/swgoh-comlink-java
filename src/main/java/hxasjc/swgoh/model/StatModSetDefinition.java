package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class StatModSetDefinition {
    private String id;
    private String name;
    private String icon;
    private StatModSetBonus completeBonus;
    private StatModSetBonus maxLevelBonus;
    private int setCount;
    private StatModSetBonus overclockBonus;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public StatModSetBonus getCompleteBonus() {
        return completeBonus;
    }

    public StatModSetBonus getMaxLevelBonus() {
        return maxLevelBonus;
    }

    public int getSetCount() {
        return setCount;
    }

    public StatModSetBonus getOverclockBonus() {
        return overclockBonus;
    }

    @Override
    public String toString() {
        return "StatModSetDefinition{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", completeBonus=" + completeBonus +
                ", maxLevelBonus=" + maxLevelBonus +
                ", setCount=" + setCount +
                ", overclockBonus=" + overclockBonus +
                '}';
    }
}
