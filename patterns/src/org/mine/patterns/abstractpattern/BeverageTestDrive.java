package org.mine.patterns.abstractpattern;

/**
 * @ClassName BeverageTestDrive
 * @Description
 * @Author Administrator
 * @Date 2021/3/29 0029 21:00
 * @Version 1.0
 */
public class BeverageTestDrive {

    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        System.out.println("\nMarking coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
