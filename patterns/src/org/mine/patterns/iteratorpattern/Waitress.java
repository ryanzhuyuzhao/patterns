package org.mine.patterns.iteratorpattern;

import java.util.Iterator;

/**
 * @ClassName Waitress
 * @Description
 * @Author Administrator
 * @Date 2021/3/30 0030 19:45
 * @Version 1.0
 */
public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dineMenu;
    private Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dineMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dineMenu = dineMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        java.util.Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        java.util.Iterator dinerIterator = dineMenu.createIterator();
        java.util.Iterator cafeIterator = cafeMenu.createIterator();
        System.out.println("MENU\n---\nBREAKFASTE");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
        System.out.println("\nDINNER");
        printMenu(cafeIterator
        );
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDesciption());
        }
    }
}
