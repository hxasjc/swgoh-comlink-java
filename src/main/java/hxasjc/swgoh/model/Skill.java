package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class Skill {
    private String id;
    private int tier;

    public String getId() {
        return id;
    }

    public int getTier() {
        return tier;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id='" + id + '\'' +
                ", tier=" + tier +
                '}';
    }
}
