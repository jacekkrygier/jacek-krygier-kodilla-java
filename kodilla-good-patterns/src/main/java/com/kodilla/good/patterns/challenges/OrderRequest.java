package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private Customer customer;
    private Product product;
    private String orderID;

    public OrderRequest(Customer customer, Product product, String orderID) {
        this.customer = customer;
        this.product = product;
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public String getOrderID() {
        return orderID;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "customer=" + customer +
                ", product=" + product +
                ", orderID='" + orderID + '\'' +
                '}';
    }
}

