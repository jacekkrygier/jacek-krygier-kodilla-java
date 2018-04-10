package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShopStorage implements Storage {
    public void checkAvailability(Product product) {
        Map<String, Integer> availableProductsOfGlutenFreeShop = new HashMap<>();
        availableProductsOfGlutenFreeShop.put("soya",5);
        availableProductsOfGlutenFreeShop.put("coconut milk",0);
        availableProductsOfGlutenFreeShop.put("strawberry",25);

        if(availableProductsOfGlutenFreeShop.containsKey(product.getName())&& availableProductsOfGlutenFreeShop.get(product.getName()) >= product.getQuantity())  {
            System.out.println("Your order will be done. Thank you for using Gluten Free Shop.\n");
        } else {
            System.out.println("Sorry. We cannot make your order. We have " + availableProductsOfGlutenFreeShop.get(product.getName())+ " quantity of " + product.getName() +  " in stock.\n");
        }
    }
}

