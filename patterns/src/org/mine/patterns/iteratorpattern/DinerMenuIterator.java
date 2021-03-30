package org.mine.patterns.iteratorpattern;

import java.util.Iterator;

/**
 * @ClassName DinerMenuIterator
 * @Description
 * @Author Administrator
 * @Date 2021/3/29 0029 23:02
 * @Version 1.0
 */
public class DinerMenuIterator implements Iterator {
    private MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position ++;
        return menuItem;

    }
}
