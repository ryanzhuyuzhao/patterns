package org.mine.patterns.wrapper;

/**
 * @ClassName Whip
 * @Description 牛奶咖啡
 * @Author Administrator
 * @Date 2021/3/23 0023 23:16
 * @Version 1.0
 */
public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
