package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class MandatoryRosterUnit {
    private String id;
    private int slot;

    public String getId() {
        return id;
    }

    public int getSlot() {
        return slot;
    }

    @Override
    public String toString() {
        return "MandatoryRosterUnit{" +
                "id='" + id + '\'' +
                ", slot=" + slot +
                '}';
    }
}
