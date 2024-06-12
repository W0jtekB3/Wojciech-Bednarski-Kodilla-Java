package com.kodilla.food2door;

public class OrderService {

    public boolean order(FoodProducer foodProducer, OrderRequest orderRequest) {
        return foodProducer.process(orderRequest);
    }
}
