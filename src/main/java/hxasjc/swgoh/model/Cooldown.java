package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class Cooldown {
    private String id;
    private BucketItem refreshCost;

    public String getId() {
        return id;
    }

    public BucketItem getRefreshCost() {
        return refreshCost;
    }

    @Override
    public String toString() {
        return "Cooldown{" +
                "id='" + id + '\'' +
                ", refreshCost=" + refreshCost +
                '}';
    }
}
