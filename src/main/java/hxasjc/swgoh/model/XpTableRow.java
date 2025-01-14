package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class XpTableRow {
    private int index;
    private int xp;

    public int getIndex() {
        return index;
    }

    public int getXp() {
        return xp;
    }

    @Override
    public String toString() {
        return "XpTableRow{" +
                "index=" + index +
                ", xp=" + xp +
                '}';
    }
}
