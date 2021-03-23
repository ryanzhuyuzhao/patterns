package org.mine.patterns.wrapper;

/**
 * @ClassName Soy
 * @Description 豆浆咖啡
 * @Author Administrator
 * @Date 2021/3/23 0023 23:15
 * @Version 1.0
 */
public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
