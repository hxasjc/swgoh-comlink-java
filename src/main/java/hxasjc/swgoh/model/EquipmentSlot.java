package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class EquipmentSlot {
    private String equipmentId;
    private int slot;

    public String getEquipmentId() {
        return equipmentId;
    }

    public int getSlot() {
        return slot;
    }

    @Override
    public String toString() {
        return "EquipmentSlot{" +
                "equipmentId='" + equipmentId + '\'' +
                ", slot=" + slot +
                '}';
    }
}
