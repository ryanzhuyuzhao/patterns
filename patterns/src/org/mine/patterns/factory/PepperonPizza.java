package org.mine.patterns.factory;

import org.mine.patterns.factory.abstractfactory.PizzaIngredientFactory;

public class PepperonPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperonPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClams();
        pepperoni = ingredientFactory.createPepperoni();
    }
}