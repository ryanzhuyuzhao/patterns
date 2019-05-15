package org.mine.patterns.factory.factory;

import org.mine.patterns.factory.Pizza;

/**
 *工厂方法模式
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 工厂方法
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}
