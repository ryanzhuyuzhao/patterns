package org.mine.patterns.combine;

import org.mine.patterns.combine.duck.Quackable;

/**
 * @ClassName AbstractDuckFactory
 * @Description
 * @Author Administrator
 * @Date 2021/4/7 0007 22:26
 * @Version 1.0
 */
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
