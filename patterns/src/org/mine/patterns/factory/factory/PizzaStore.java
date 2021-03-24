package org.mine.patterns.factory.factory;

import org.mine.patterns.factory.Pizza;

/**
 *工厂方法模式
 * abstract Product factoryMethod(String type)
 * 所有的工厂模式都用来封装对象的创建。工厂方法模式通过让子类决定该创建的对象是什么，来达到将对象
 * 创建的过程封装的目的。
 * 工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
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
