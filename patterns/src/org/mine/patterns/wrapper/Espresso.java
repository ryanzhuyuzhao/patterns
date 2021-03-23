package org.mine.patterns.wrapper;

/**
 * @ClassName Espresso
 * @Description
 * @Author Administrator
 * @Date 2021/3/23 0023 22:34
 * @Version 1.0
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
