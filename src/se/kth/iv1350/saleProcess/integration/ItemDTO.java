package se.kth.iv1350.saleProcess.integration;

public class ItemDTO {
    boolean validItem;
    String itemDescription;
    int priceOfItem;
    int quantity;

    public ItemDTO(boolean validItem, String itemDescription, int priceOfItem, int quantity) {
        this.validItem = validItem;
        this.itemDescription = itemDescription;
        this.priceOfItem = priceOfItem;
        this.quantity = quantity;
    }

    public boolean isValidItem() {
        return validItem;
    }

    public int getPriceOfItem() {
        return priceOfItem;
    }

    public String getItemDescription() {
        return itemDescription;
    }
}
