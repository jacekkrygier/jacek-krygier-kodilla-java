package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;


    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product laptop = new Product("laptop");
        Product phone = new Product("phone");
        Item item1 = new Item(new BigDecimal(100), 2, new BigDecimal(200));
        Item item2 = new Item(new BigDecimal(300), 3, new BigDecimal(900));
        Invoice invoice = new Invoice("123ABC");
        laptop.getItems().add(item1);
        phone.getItems().add(item2);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setProduct(laptop);
        item2.setProduct(phone);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        productDao.save(laptop);
        productDao.save(phone);
        itemDao.save(item1);
        itemDao.save(item2);
        int id = invoice.getId();
        int laptopId = laptop.getId();
        int phoneId = phone.getId();

        //Then
        Assert.assertNotEquals(0, id);
        Assert.assertNotEquals(0, laptopId);
        Assert.assertNotEquals(0,phoneId);
        Assert.assertEquals(2, itemDao.count());


        //CleanUp
        itemDao.deleteAll();
        invoiceDao.delete(id);
        productDao.deleteAll();
    }
}
