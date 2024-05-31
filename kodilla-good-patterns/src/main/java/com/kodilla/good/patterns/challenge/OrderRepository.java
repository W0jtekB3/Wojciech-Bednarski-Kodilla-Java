package com.kodilla.good.patterns.challenge;

public class OrderRepository {
    public void storeOrder(User user, Product product) {
        // Simulate storing order logic
        System.out.println("Storing order for user: " + user.getName() + ", product: " + product.getName());
    }
}
