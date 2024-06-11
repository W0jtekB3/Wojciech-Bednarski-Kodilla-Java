package com.kodilla.good.patterns.challenges;

public class ProductOrderServiceImpl implements OrderService {
    @Override
    public boolean order(User user, Product product) {
        System.out.println("Ordering product: " + product.getName() + " for user: " + user.getUsername());
        return true; // assuming the order is always successful
    }

    @Override
    public boolean order(User user, Product product, int quantity) {
        return false;
    }
}
