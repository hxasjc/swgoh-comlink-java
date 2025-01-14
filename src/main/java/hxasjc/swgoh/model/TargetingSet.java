package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TargetingSet {
    private String id;
    private TargetingWeight[] weight;

    public String getId() {
        return id;
    }

    public TargetingWeight[] getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "TargetingSet{" +
                "id='" + id + '\'' +
                ", weight=" + Arrays.toString(weight) +
                '}';
    }
}
