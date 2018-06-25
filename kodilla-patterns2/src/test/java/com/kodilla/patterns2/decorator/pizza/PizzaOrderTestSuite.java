package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(16), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetIngredients() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String ingredients = theOrder.getIngredients();
        //Then
        assertEquals("Basic pizza (normal crust, tomato sauce and cheese)", ingredients);
    }

    @Test
    public void testExtraCheeseAndStuffedCrustGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new StuffedCrustDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), calculatedCost);
    }

    @Test
    public void testExtraCheeseAndStuffedCrustGetIngredients() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new StuffedCrustDecorator(theOrder);
        //When
        String ingredients = theOrder.getIngredients();
        //Then
        assertEquals("Basic pizza (normal crust, tomato sauce and cheese) + extra cheese + stuffed crust", ingredients);
    }

    @Test
    public void testTwoExtraIngredientsAndExtraLargeSizeGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraIngredientDecorator(theOrder);
        theOrder = new ExtraIngredientDecorator(theOrder);
        theOrder = new ExtraLargeSizeDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(26), calculatedCost);
    }

    @Test
    public void testTwoExtraIngredientsAndExtraLargeSizeGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraIngredientDecorator(theOrder);
        theOrder = new ExtraIngredientDecorator(theOrder);
        theOrder = new ExtraLargeSizeDecorator(theOrder);
        //When
        String ingredients = theOrder.getIngredients();
        //Then
        assertEquals("Basic pizza (normal crust, tomato sauce and cheese) + extra ingredient + extra ingredient + extra large size", ingredients);
    }
}
