package com.kodilla.good.patterns.challenges;

public class InformationServiceClass implements InformationService {
    public void sendMessage(Customer customer) {
        System.out.println(customer.getUsername() +", Your order has been placed.");
    }
}
