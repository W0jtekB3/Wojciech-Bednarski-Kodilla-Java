package com.kodilla.good.patterns.challenges;

public interface OrderRepository {
    void createOrder(User user, Product product);

    void createOrder(User user, Product product, int quantity);
}
