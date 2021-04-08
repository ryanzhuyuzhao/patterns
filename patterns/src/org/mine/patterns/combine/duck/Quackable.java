package org.mine.patterns.combine.duck;

import org.mine.patterns.combine.QuackObservable;

/**
 * @ClassName Quackable
 * @Description
 * @Author Administrator
 * @Date 2021/4/7 0007 20:46
 * @Version 1.0
 */
public interface Quackable extends QuackObservable {

    void quack();
}
