package org.mine.patterns.iteratorpattern.compose;

import java.util.Iterator;
import java.util.Stack;

/**
 * @ClassName CompositeIterator
 * @Description
 * @Author Administrator
 * @Date 2021/3/31 0031 19:43
 * @Version 1.0
 */
public class CompositeIterator implements Iterator {
    private Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        this.stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        }else {
            Iterator iterator = (Iterator) stack.peek();
            if (iterator.hasNext()) {
                stack.pop();
                return hasNext();
            }else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                stack.push(((Menu) component).createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
