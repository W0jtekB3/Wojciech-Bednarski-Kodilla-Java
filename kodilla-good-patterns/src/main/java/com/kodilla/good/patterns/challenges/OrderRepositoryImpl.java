package com.kodilla.good.patterns.challenges;

public class OrderRepositoryImpl implements OrderRepository {
    @Override
    public void createOrder(User user, Product product) {
        System.out.println("Creating order in the repository for " + user.getUsername());
    }

    @Override
    public void createOrder(User user, Product product, int quantity) {

    }
}
