package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class ConversionItemPrioritized {
    private ConversionItem item;
    private int priority;

    public ConversionItem getItem() {
        return item;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "ConversionItemPrioritized{" +
                "item=" + item +
                ", priority=" + priority +
                '}';
    }
}
