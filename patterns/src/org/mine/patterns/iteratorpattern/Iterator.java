package org.mine.patterns.iteratorpattern;

import org.mine.patterns.observer.Observer;

/**
 * @ClassName Iterator
 * @Description
 * @Author Administrator
 * @Date 2021/3/29 0029 23:01
 * @Version 1.0
 */
public interface Iterator {
    boolean hasNext();

    Object next();
}
