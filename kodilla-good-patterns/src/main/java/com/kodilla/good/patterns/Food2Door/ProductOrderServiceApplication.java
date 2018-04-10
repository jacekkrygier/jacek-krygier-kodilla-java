package com.kodilla.good.patterns.Food2Door;

public class ProductOrderServiceApplication {
    public  static void main(String[] args) {

        Customer jacekkrygier = new Customer("Jacek", "Krygier","jacekkrygier1705");

        Product apple = new Product("apple", 5, 1);
        Product ham = new Product("ham", 20, 22);
        Product soya = new Product("soya", 7, 3);

        Shop biedronka = new HealthyShop("Biedronka");
        Shop morliny = new ExtraFoodShop("Morliny");
        Shop stokrotka = new GlutenFreeShop("Stokrotka");
        OrderRetrieve orderRetrieve = new OrderRetrieveClass();

        OrderRequest orderRequest1 = new OrderRequest(jacekkrygier, apple, biedronka);
        OrderRequest orderRequest2 = new OrderRequest(jacekkrygier, ham, morliny);
        OrderRequest orderRequest3 = new OrderRequest(jacekkrygier, soya, stokrotka);

        ProductOrderService productOrderService1 = new ProductOrderService(orderRetrieve, biedronka);
        ProductOrderService productOrderService2 = new ProductOrderService(orderRetrieve, morliny);
        ProductOrderService productOrderService3 = new ProductOrderService(orderRetrieve, stokrotka);

        productOrderService1.order(orderRequest1);
        productOrderService2.order(orderRequest2);
        productOrderService3.order(orderRequest3);
    }
}

