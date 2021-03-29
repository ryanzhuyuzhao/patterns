package org.mine.patterns.abstractpattern;

/**
 * @ClassName Tea
 * @Description
 * @Author Administrator
 * @Date 2021/3/29 0029 20:47
 * @Version 1.0
 */
public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
