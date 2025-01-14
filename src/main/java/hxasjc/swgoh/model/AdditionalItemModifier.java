package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class AdditionalItemModifier {
    private BucketItem[] addedItems;

    public BucketItem[] getAddedItems() {
        return addedItems;
    }

    @Override
    public String toString() {
        return "AdditionalItemModifier{" +
                "addedItems=" + Arrays.toString(addedItems) +
                '}';
    }
}
