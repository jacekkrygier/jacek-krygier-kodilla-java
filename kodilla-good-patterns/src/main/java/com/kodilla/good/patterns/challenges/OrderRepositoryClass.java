package com.kodilla.good.patterns.challenges;

public class OrderRepositoryClass implements OrderRepository {
    public boolean createOrder(OrderRequest orderRequest) {
        System.out.println("Order " + orderRequest.getOrderID() + " added to repository.");
        return true;
    }
}