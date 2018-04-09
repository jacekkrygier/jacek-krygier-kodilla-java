package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfProductsClass implements ListOfProducts {

    public void checkAvailability(Product product, Shop shop) {

        List<Product> availableProducts = new ArrayList<>();

        Product egg = new Product("egg", 1, 2);
        Product apple = new Product("apple", 2.50, 9);
        Product bread = new Product("bread", 5, 0);

        availableProducts.add(egg);
        availableProducts.add(apple);
        availableProducts.add(bread);
        Map<Shop, List<Product>> listOfProducts = new HashMap<>();
        Shop biedronka = new HealthyShop("Biedronka");

        listOfProducts.put(biedronka, availableProducts);


        if(listOfProducts.containsKey(shop.getName()) && listOfProducts.containsValue(product.getName()) && product.getQuantity() > 0) {
            System.out.println("Your order will be done");
        } else {
            System.out.println("Sorry. We cannot make your order. This product is not available at the moment");
        }

    }
}