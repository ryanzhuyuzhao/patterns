package org.mine.patterns.abstractpattern;

/**
 * @ClassName CaffeineBeverageWithHook
 * @Description
 * @Author Administrator
 * @Date 2021/3/29 0029 20:50
 * @Version 1.0
 */
public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }

}
