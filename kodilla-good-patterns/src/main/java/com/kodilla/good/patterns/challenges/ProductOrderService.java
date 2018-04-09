package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getCustomer(), orderRequest.getProduct());

        if(isOrdered) {
            informationService.sendMessage(orderRequest.getCustomer());
            orderRepository.createOrder(orderRequest);
            return new OrderDto(orderRequest.getCustomer(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), false);
        }
    }
}