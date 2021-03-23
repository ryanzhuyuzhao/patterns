package org.mine.patterns.wrapper;

/**
 * @ClassName Decat
 * @Description 低咖啡因咖啡
 * @Author Administrator
 * @Date 2021/3/23 0023 22:42
 * @Version 1.0
 */
public class Decat extends Beverage {

    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
