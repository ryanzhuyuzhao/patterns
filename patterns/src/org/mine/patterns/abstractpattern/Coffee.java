package org.mine.patterns.abstractpattern;

/**
 * @ClassName Coffee
 * @Description
 * @Author Administrator
 * @Date 2021/3/29 0029 20:49
 * @Version 1.0
 */
public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
