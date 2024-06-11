package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        User user = new User("john_doe", "john.doe@example.com");
        Product product = new Product("Toothbrush");

        OrderRequest orderRequest = new OrderRequest(user, product);

        InformationService informationService = new EmailService();
        OrderService orderService = new ProductOrderServiceImpl();
        OrderRepository orderRepository = new OrderRepositoryImpl();

        ProductOrderService productOrderService = new ProductOrderService(informationService, orderService, orderRepository);

        OrderDto orderDto = productOrderService.process(orderRequest);

        System.out.println("Order status: " + (orderDto.isOrdered() ? "Success" : "Failure"));
    }
}
