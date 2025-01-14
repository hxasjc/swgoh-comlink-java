package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class ConditionalBucket {
    private String requirementId;
    private BucketItem[] bucketItem;

    public String getRequirementId() {
        return requirementId;
    }

    public BucketItem[] getBucketItem() {
        return bucketItem;
    }

    @Override
    public String toString() {
        return "ConditionalBucket{" +
                "requirementId='" + requirementId + '\'' +
                ", bucketItem=" + Arrays.toString(bucketItem) +
                '}';
    }
}
