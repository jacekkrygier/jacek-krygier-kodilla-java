package com.kodilla.good.patterns.challenges;

public class ProductOrderServiceApplication {
    public  static void main(String[] args) {

        Customer jacekkrygier = new Customer("Jacek", "Krygier","jacekkrygier1705");
        Product ps4 = new Product("PlayStation 4", 799.99, 1);
        OrderRequest orderRequest = new OrderRequest(jacekkrygier, ps4, "FS33728278");
        InformationService informationService = new InformationServiceClass();
        OrderRepository orderRepository = new OrderRepositoryClass();
        OrderService orderService = new OrderServiceClass();

        ProductOrderService productOrderService = new ProductOrderService(informationService, orderService, orderRepository);
        productOrderService.process(orderRequest);
    }
}
