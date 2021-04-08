package org.mine.patterns.iteratorpattern.compose;

import java.util.Iterator;

/**
 * @ClassName Waitress
 * @Description
 * @Author Administrator
 * @Date 2021/3/31 0031 7:57
 * @Version 1.0
 */
public class Waitress {
    private MenuComponent allMenus;


    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            if (menuComponent.isVegetarian()) {
                menuComponent.print();
            }
        }
    }
}
