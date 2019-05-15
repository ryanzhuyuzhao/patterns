package org.mine.patterns.factory;

import org.mine.patterns.factory.factory.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(pizza.getName() + "\n");
    }
}
