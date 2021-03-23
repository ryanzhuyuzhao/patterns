package org.mine.patterns.wrapper;

/**
 * @ClassName HouseBlend
 * @Description
 * @Author Administrator
 * @Date 2021/3/23 0023 22:35
 * @Version 1.0
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
