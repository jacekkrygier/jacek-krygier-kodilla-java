package com.kodilla.good.patterns.Food2Door;

public class ProductOrderService {
    private OrderRetrieve orderRetrieve;
    private ListOfProducts listOfProducts;
    private Shop shop;

    public ProductOrderService(final OrderRetrieve orderRetrieve,
                               final ListOfProducts listOfProducts,
                               final Shop shop) {
        this.orderRetrieve = orderRetrieve;
        this.listOfProducts = listOfProducts;
        this.shop = shop;
    }

    public OrderDto order(final OrderRequest orderRequest) {
        boolean isOrdered = orderRetrieve.retrieve(orderRequest.getCustomer(), orderRequest.getProduct(), orderRequest.getShop());

        if(isOrdered) {
            shop.process(orderRequest.getProduct());
            listOfProducts.checkAvailability(orderRequest.getProduct(), orderRequest.getShop());
            return new OrderDto(orderRequest.getCustomer(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), false);
        }
    }
}