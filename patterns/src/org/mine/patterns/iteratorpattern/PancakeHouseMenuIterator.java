package org.mine.patterns.iteratorpattern;

import java.util.Iterator;
import java.util.List;

/**
 * @ClassName PancakeHouseMenuIterator
 * @Description
 * @Author Administrator
 * @Date 2021/3/30 0030 20:16
 * @Version 1.0
 */
public class PancakeHouseMenuIterator implements Iterator {
    private List<MenuItem> menuItems;
    private int position;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
