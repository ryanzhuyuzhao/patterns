package org.mine.patterns.combine;

import org.mine.patterns.combine.duck.Quackable;
import org.mine.patterns.combine.duck.quackimpl.DuckCall;
import org.mine.patterns.combine.duck.quackimpl.MallardDuck;
import org.mine.patterns.combine.duck.quackimpl.RedheadDuck;
import org.mine.patterns.combine.duck.quackimpl.RubberDuck;

/**
 * @ClassName CountingDuckFactory
 * @Description
 * @Author Administrator
 * @Date 2021/4/7 0007 22:29
 * @Version 1.0
 */
public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
