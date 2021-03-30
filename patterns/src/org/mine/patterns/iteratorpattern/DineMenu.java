package org.mine.patterns.iteratorpattern;

import java.util.Iterator;

/**
 * @ClassName DineMenu
 * @Description
 * @Author Administrator
 * @Date 2021/3/29 0029 22:56
 * @Version 1.0
 */
public class DineMenu implements Menu{
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DineMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full! Can't add item to menu");
        }else {
            menuItems[numberOfItems] =  menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
