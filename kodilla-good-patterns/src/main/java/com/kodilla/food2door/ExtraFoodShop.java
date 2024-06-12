package com.kodilla.food2door;

public class ExtraFoodShop implements FoodProducer {

    @Override
    public boolean process(OrderRequest orderRequest) {
        // Specific implementation for ExtraFoodShop
        System.out.println("Processing order at ExtraFoodShop for " + orderRequest.getProduct() + ", quantity: " + orderRequest.getQuantity());
        return true; // Assuming the order is always successful
    }
}