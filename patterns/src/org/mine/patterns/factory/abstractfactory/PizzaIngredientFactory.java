package org.mine.patterns.factory.abstractfactory;

import org.mine.patterns.factory.product.*;

/**
 * @ClassName PizzaIngredientFactory
 * @Description
 * @Author Administrator
 * @Date 2021/3/25 0025 20:32
 * @Version 1.0
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();
}
