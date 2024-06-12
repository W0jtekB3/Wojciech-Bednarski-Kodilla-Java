package com.kodilla.food2door;

public class Application {

    public static void main(String[] args) {
        OrderRequest orderRequest1 = new OrderRequest("Apples", 10);
        OrderRequest orderRequest2 = new OrderRequest("Bananas", 20);
        OrderRequest orderRequest3 = new OrderRequest("Gluten-free bread", 5);

        FoodProducer extraFoodShop = new ExtraFoodShop();
        FoodProducer healthyShop = new HealthyShop();
        FoodProducer glutenFreeShop = new GlutenFreeShop();

        OrderService orderService = new OrderService();

        System.out.println("Order 1 status: " + orderService.order(extraFoodShop, orderRequest1));
        System.out.println("Order 2 status: " + orderService.order(healthyShop, orderRequest2));
        System.out.println("Order 3 status: " + orderService.order(glutenFreeShop, orderRequest3));
    }
}
