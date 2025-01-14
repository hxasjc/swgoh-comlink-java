package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class SeasonDivisionDefinition {
    private int id;
    private String nameKey;
    private int minPower;

    public int getId() {
        return id;
    }

    public String getNameKey() {
        return nameKey;
    }

    public int getMinPower() {
        return minPower;
    }

    @Override
    public String toString() {
        return "SeasonDivisionDefinition{" +
                "id=" + id +
                ", nameKey='" + nameKey + '\'' +
                ", minPower=" + minPower +
                '}';
    }
}
