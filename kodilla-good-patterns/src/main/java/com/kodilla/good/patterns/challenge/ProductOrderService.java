package com.kodilla.good.patterns.challenge;

class ProductOrderApp {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public static void main(String[] args) {
        ProductOrderApp app = new ProductOrderApp();
        app.run();
    }

    public void run() {
        // Initialize services and repositories
        this.informationService = new InformationService();
        this.orderService = new OrderService();
        this.orderRepository = new OrderRepository();

        // Example order request
        User user = new User("John Doe");
        Product product = new Product("Laptop");
        OrderRequest orderRequest = new OrderRequest(user, product);

        // Process the order
        OrderDto result = processOrder(orderRequest);
        System.out.println("Order placed: " + result.isOrdered());
    }

    public OrderDto processOrder(OrderRequest orderRequest) {
        boolean isOrdered = orderService.placeOrder(orderRequest.getUser(), orderRequest.getProduct());
        if (isOrdered) {
            informationService.informUser(orderRequest.getUser());
            orderRepository.storeOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
