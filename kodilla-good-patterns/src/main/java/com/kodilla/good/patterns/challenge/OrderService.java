package com.kodilla.good.patterns.challenge;

public class OrderService {
    public boolean placeOrder(User user, Product product) {
        // Simulate order placement logic
        System.out.println("Placing order for user: " + user.getName() + ", product: " + product.getName());
        return true; // Simulate successful order placement
    }
}