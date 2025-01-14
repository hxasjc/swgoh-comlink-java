package hxasjc.swgoh.model;

import java.util.Arrays;

@SuppressWarnings("unused")
public class GuildInventory {
    private CurrencyItem[] currencyItem;
    private CurrencyItem[] currentDailyLimit;

    public CurrencyItem[] getCurrencyItem() {
        return currencyItem;
    }

    public CurrencyItem[] getCurrentDailyLimit() {
        return currentDailyLimit;
    }

    @Override
    public String toString() {
        return "GuildInventory{" +
                "currencyItem=" + Arrays.toString(currencyItem) +
                ", currentDailyLimit=" + Arrays.toString(currentDailyLimit) +
                '}';
    }
}
