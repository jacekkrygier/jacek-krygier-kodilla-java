package com.kodilla.good.patterns.Food2Door;

public class OrderDto {
    private Customer customer;
    private boolean isOrdered;

    public OrderDto(Customer customer, boolean isOrdered) {
        this.customer = customer;
        this.isOrdered = isOrdered;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "customer=" + customer +
                ", isOrdered=" + isOrdered +
                '}';
    }
}