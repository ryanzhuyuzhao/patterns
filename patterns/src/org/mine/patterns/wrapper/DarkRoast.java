package org.mine.patterns.wrapper;

/**
 * @ClassName DarkRoast
 * @Description 深烘咖啡
 * @Author Administrator
 * @Date 2021/3/23 0023 22:39
 * @Version 1.0
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
