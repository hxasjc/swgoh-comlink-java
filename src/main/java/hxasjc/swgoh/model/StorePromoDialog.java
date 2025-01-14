package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class StorePromoDialog {
    private String storeItemId;
    private String descriptionTexture;
    private String buttonKey;
    private boolean showPrice;

    public String getStoreItemId() {
        return storeItemId;
    }

    public String getDescriptionTexture() {
        return descriptionTexture;
    }

    public String getButtonKey() {
        return buttonKey;
    }

    public boolean isShowPrice() {
        return showPrice;
    }

    @Override
    public String toString() {
        return "StorePromoDialog{" +
                "storeItemId='" + storeItemId + '\'' +
                ", descriptionTexture='" + descriptionTexture + '\'' +
                ", buttonKey='" + buttonKey + '\'' +
                ", showPrice=" + showPrice +
                '}';
    }
}
