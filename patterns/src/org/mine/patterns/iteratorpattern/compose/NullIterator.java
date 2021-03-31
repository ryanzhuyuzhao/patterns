package org.mine.patterns.iteratorpattern.compose;


import java.util.Iterator;

/**
 * @ClassName NullIterator
 * @Description
 * @Author Administrator
 * @Date 2021/3/31 0031 19:58
 * @Version 1.0
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
