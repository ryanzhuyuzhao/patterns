package org.mine.patterns.wrapper;

/**
 * @ClassName Mocha
 * @Description 摩卡（装饰者）
 * @Author Administrator
 * @Date 2021/3/23 0023 22:44
 * @Version 1.0
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
