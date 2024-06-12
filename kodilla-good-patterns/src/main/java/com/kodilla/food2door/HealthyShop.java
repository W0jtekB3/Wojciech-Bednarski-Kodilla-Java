package com.kodilla.food2door;

public class HealthyShop implements FoodProducer {

    @Override
    public boolean process(OrderRequest orderRequest) {
        // Specific implementation for HealthyShop
        System.out.println("Processing order at HealthyShop for " + orderRequest.getProduct() + ", quantity: " + orderRequest.getQuantity());
        return true; // Assuming the order is always successful
    }
}
