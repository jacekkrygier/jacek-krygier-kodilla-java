package com.kodilla.good.patterns.Food2Door;

public class ProductOrderServiceApplication {
    public  static void main(String[] args) {

        Customer jacekkrygier = new Customer("Jacek", "Krygier","jacekkrygier1705");
        Product apple = new Product("apple", 5, 1);
        Shop biedronka = new HealthyShop("Biedronka");
        OrderRequest orderRequest = new OrderRequest(jacekkrygier, apple, biedronka);
        ListOfProductsClass listOfProducts = new ListOfProductsClass();
        OrderRetrieveClass orderRetrieve = new OrderRetrieveClass();

        ProductOrderService productOrderService = new ProductOrderService(orderRetrieve, listOfProducts, biedronka);
        productOrderService.order(orderRequest);
    }
}

