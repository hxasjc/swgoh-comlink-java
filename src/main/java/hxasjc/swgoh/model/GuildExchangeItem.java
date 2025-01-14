package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class GuildExchangeItem {
    private BucketItem item;

    public BucketItem getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "GuildExchangeItem{" +
                "item=" + item +
                '}';
    }
}
