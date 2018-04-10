package com.kodilla.good.patterns.Food2Door;


import java.util.HashMap;
import java.util.Map;

public class HealthyShopStorage implements Storage {
    public void checkAvailability(Product product) {
        Map<String, Integer> availableProductsOfHealthyShop = new HashMap<>();
        availableProductsOfHealthyShop.put("egg",2);
        availableProductsOfHealthyShop.put("apple",0);
        availableProductsOfHealthyShop.put("bread",50);


        if(availableProductsOfHealthyShop.containsKey(product.getName())&& availableProductsOfHealthyShop.get(product.getName()) >= product.getQuantity())  {
            System.out.println("Your order will be done. Thank you for using Healthy Shop.\n");
        } else {
            System.out.println("Sorry. We cannot make your order. We have " + availableProductsOfHealthyShop.get(product.getName())+ " quantity of " + product.getName() +  " in stock.\n");
        }
    }
}