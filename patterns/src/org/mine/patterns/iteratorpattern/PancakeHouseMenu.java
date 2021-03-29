package org.mine.patterns.iteratorpattern;

import java.util.List;

/**
 * @ClassName PancakeHouseMenu
 * @Description
 * @Author Administrator
 * @Date 2021/3/29 0029 22:52
 * @Version 1.0
 */
public class PancakeHouseMenu {
    private List<MenuItem> menuItems;


    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description,vegetarian, price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
