package org.mine.patterns.iteratorpattern.compose;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName Menu
 * @Description
 * @Author Administrator
 * @Date 2021/3/31 0031 7:52
 * @Version 1.0
 */
public class Menu extends MenuComponent{
    private List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        if (menuComponent != null) {
            menuComponents.add(menuComponent);
        }
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }

    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
