package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class ScaleItemModifier {
    private int scale;
    private ModifierItem target;

    public int getScale() {
        return scale;
    }

    public ModifierItem getTarget() {
        return target;
    }

    @Override
    public String toString() {
        return "ScaleItemModifier{" +
                "scale=" + scale +
                ", target=" + target +
                '}';
    }
}
