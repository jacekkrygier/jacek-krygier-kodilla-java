package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigMacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("salad")
                .bun("normal size")
                .sauce("barbecue")
                .burgers(2)
                .ingredient("onion")
                .ingredient("tomato")
                .ingredient("cheese")
                .build();

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}
