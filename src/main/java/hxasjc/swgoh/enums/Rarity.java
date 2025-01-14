package hxasjc.swgoh.enums;

public enum Rarity {
    Rarity_DEFAULT,
    ONESTAR,
    TWOSTAR,
    THREESTAR,
    FOURSTAR,
    FIVESTAR,
    SIXSTAR,
    SEVENSTAR,
    NOSTAR;

    public int friendlyValue() {
        return ordinal();
    }
}
