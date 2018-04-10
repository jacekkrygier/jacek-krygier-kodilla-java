package com.kodilla.good.patterns.Food2Door;

public class ProductOrderService {
    private OrderRetrieve orderRetrieve;
    private Shop shop;

    public ProductOrderService(final OrderRetrieve orderRetrieve,
                               final Shop shop) {
        this.orderRetrieve = orderRetrieve;
        this.shop = shop;
    }

    public OrderDto order(final OrderRequest orderRequest) {
        boolean isOrdered = orderRetrieve.retrieve(orderRequest.getCustomer(), orderRequest.getProduct(), orderRequest.getShop());

        if(isOrdered) {
            shop.process(orderRequest.getProduct());
            return new OrderDto(orderRequest.getCustomer(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), false);
        }
    }
}