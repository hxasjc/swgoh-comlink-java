package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class SkillUpgrade {
    private String id;
    private int tier;
    private boolean unlocked;

    public String getId() {
        return id;
    }

    public int getTier() {
        return tier;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    @Override
    public String toString() {
        return "SkillUpgrade{" +
                "id='" + id + '\'' +
                ", tier=" + tier +
                ", unlocked=" + unlocked +
                '}';
    }
}
