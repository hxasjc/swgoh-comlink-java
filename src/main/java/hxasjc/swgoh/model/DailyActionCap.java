package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class DailyActionCap {
    private String id;
    private int maxActions;
    private BucketItem[] purchaseCost;
    private boolean unlimitedPurchases;

    public String getId() {
        return id;
    }

    public int getMaxActions() {
        return maxActions;
    }

    public BucketItem[] getPurchaseCost() {
        return purchaseCost;
    }

    public boolean isUnlimitedPurchases() {
        return unlimitedPurchases;
    }

    @Override
    public String toString() {
        return "DailyActionCap{" +
                "id='" + id + '\'' +
                ", maxActions=" + maxActions +
                ", purchaseCost=" + Arrays.toString(purchaseCost) +
                ", unlimitedPurchases=" + unlimitedPurchases +
                '}';
    }
}
