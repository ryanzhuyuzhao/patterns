package org.mine.patterns.iteratorpattern;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * @ClassName CafeMenu
 * @Description
 * @Author Administrator
 * @Date 2021/3/30 0030 20:57
 * @Version 1.0
 */
public class CafeMenu implements Menu{
    private Hashtable menuItems = new Hashtable();

    public CafeMenu() {
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.put(menuItem.getName(),menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
