package com.kodilla.good.patterns.challenges;

public class OrderServiceClass implements OrderService{
    public boolean order(Customer customer, Product product){
        System.out.println("Congratulations " + customer.getUsername() + ", you have just bought: " + product.getQuantity() + " " + product.getName() + " for " + product.getPrice() + "!");
        return true;
    }
}

