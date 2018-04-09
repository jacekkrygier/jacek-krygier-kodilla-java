package com.kodilla.good.patterns.challenges;

public interface OrderRepository {
    public boolean createOrder(OrderRequest orderRequest);
}