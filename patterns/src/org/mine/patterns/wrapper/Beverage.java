package org.mine.patterns.wrapper;

/**
 * @ClassName Beverage
 * @Description 饮料抽象类
 * @Author Administrator
 * @Date 2021/3/23 0023 22:24
 * @Version 1.0
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
