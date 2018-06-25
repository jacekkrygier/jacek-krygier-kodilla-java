package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class StuffedCrustDecorator extends AbstractPizzaOrderDecorator{

    public StuffedCrustDecorator(PizzaOrder pizzaOrder) {
    super(pizzaOrder);
}

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + stuffed crust";
    }
}
