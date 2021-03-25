package org.mine.patterns.factory;

import org.mine.patterns.factory.abstractfactory.PizzaIngredientFactory;
import org.mine.patterns.factory.product.*;
import org.mine.patterns.factory.product.impl.*;

/**
 * @ClassName NYPizzaIngredientFactory
 * @Description
 * @Author Administrator
 * @Date 2021/3/25 0025 20:50
 * @Version 1.0
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
