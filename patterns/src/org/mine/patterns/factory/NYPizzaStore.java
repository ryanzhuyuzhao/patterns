package org.mine.patterns.factory;

import org.mine.patterns.factory.abstractfactory.PizzaIngredientFactory;
import org.mine.patterns.factory.factory.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }else if ("clam".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("ew York Style Clam Pizza");
        }else if ("pepperoni".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("ew York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
