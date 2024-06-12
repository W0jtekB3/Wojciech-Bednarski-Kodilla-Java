package com.kodilla.food2door;

public class OrderRequest {
    private final String product;
    private final int quantity;

    public OrderRequest(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
