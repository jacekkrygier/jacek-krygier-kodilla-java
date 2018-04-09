package com.kodilla.good.patterns.Food2Door;

public class OrderRetrieveClass implements OrderRetrieve {
    public boolean retrieve(Customer customer, Product product, Shop shop) {
        System.out.println("Customer " + customer.getUsername() + " wants to order " + product.getQuantity() + " quantity of " + product.getName() +  " in " + shop);
        return true;
    }
}