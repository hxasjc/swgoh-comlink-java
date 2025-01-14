package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class ConversionSet {
    private ConversionItemPrioritized output;
    private ConversionItem[] consumable;
    private ConversionItem surplus;

    public ConversionItemPrioritized getOutput() {
        return output;
    }

    public ConversionItem[] getConsumable() {
        return consumable;
    }

    public ConversionItem getSurplus() {
        return surplus;
    }

    @Override
    public String toString() {
        return "ConversionSet{" +
                "output=" + output +
                ", consumable=" + Arrays.toString(consumable) +
                ", surplus=" + surplus +
                '}';
    }
}
