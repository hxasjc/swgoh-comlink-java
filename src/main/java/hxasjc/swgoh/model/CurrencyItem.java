package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.CurrencyType;

@SuppressWarnings("unused")
public class CurrencyItem {
    private CurrencyType currency;
    private long quantity;
    private int bonusQuantity;

    public CurrencyType getCurrency() {
        return currency;
    }

    public long getQuantity() {
        return quantity;
    }

    public int getBonusQuantity() {
        return bonusQuantity;
    }

    @Override
    public String toString() {
        return "CurrencyItem{" +
                "currency=" + currency +
                ", quantity=" + quantity +
                ", bonusQuantity=" + bonusQuantity +
                '}';
    }
}
