package com.kodilla.food2door;

public class GlutenFreeShop implements FoodProducer {

    @Override
    public boolean process(OrderRequest orderRequest) {
        // Specific implementation for GlutenFreeShop
        System.out.println("Processing order at GlutenFreeShop for " + orderRequest.getProduct() + ", quantity: " + orderRequest.getQuantity());
        return true; // Assuming the order is always successful
    }
}
