package org.mine.patterns.abstractpattern;

/**
 * @ClassName CaffeineBeverage
 * @Description
 * 模板方法模式：在一个方法中定义一个算法的框架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变
 * 算法结构的情况下，重新定义算法中的某些步骤
 *
 * @Author Administrator
 * @Date 2021/3/29 0029 20:43
 * @Version 1.0
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
