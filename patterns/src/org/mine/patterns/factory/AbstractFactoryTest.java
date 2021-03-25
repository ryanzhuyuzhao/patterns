package org.mine.patterns.factory;

/**
 * @ClassName AbstractFactoryTest
 * @Description
 * @Author Administrator
 * @Date 2021/3/25 0025 21:35
 * @Version 1.0
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        /**
         * 抽象工厂模式提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类
         */
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.createPizza("cheese");
        System.out.println(pizza.getName());
    }
}
