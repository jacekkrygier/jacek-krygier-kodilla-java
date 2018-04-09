package com.kodilla.good.patterns.Food2Door;

public class OrderRequest {
    private Customer customer;
    private Product product;
    private Shop shop;

    public OrderRequest(Customer customer, Product product, Shop shop) {
        this.customer = customer;
        this.product = product;
        this.shop = shop;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public Shop getShop() {
        return shop;
    }


    @Override
    public String toString() {
        return "OrderRequest{" +
                "customer=" + customer +
                ", product=" + product +
                ", shop=" + shop +
                '}';
    }
}
