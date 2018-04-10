package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShopStorage implements Storage {
    public void checkAvailability(Product product) {
        Map<String, Integer> availableProductsOfExtraFoodShop = new HashMap<>();
        availableProductsOfExtraFoodShop.put("ham",21);
        availableProductsOfExtraFoodShop.put("chicken",0);
        availableProductsOfExtraFoodShop.put("sausage",25);

        if(availableProductsOfExtraFoodShop.containsKey(product.getName())&& availableProductsOfExtraFoodShop.get(product.getName()) >= product.getQuantity())  {
            System.out.println("Your order will be done. Thank you for using Extra Food Shop.\n");
        } else {
            System.out.println("Sorry. We cannot make your order. We have " + availableProductsOfExtraFoodShop.get(product.getName())+ " quantity of " + product.getName() +  " in stock.\n");
        }
    }
}
