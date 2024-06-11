package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository {
    @Override
    public void createOrder(User user, Product product) {
        System.out.println("Creating order for product: " + product.getName() + " for user: " + user.getUsername());
    }

    @Override
    public void createOrder(User user, Product product, int quantity) {

    }
}
