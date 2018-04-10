package com.kodilla.good.patterns.Food2Door;

public class HealthyShop implements Shop {
    private String name;

    public HealthyShop(String name) {
        this.name = name;
    }

    public void process(Product product) {
        System.out.println("You have just bought "  + product.getQuantity() + " quantity of " + product.getName() + " for " + product.getPrice() + " each. Now we are checking availability.");
        Storage storage = new HealthyShopStorage();
        storage.checkAvailability(product);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "HealthyShop{" +
                "name='" + name + '\'' +
                '}';
    }
}