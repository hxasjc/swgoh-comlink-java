package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class Position {
    private String x;
    private String y;
    private String z;

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public String getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x='" + x + '\'' +
                ", y='" + y + '\'' +
                ", z='" + z + '\'' +
                '}';
    }
}
