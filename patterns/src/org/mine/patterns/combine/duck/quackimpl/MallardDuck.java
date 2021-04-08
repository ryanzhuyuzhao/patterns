package org.mine.patterns.combine.duck.quackimpl;

import org.mine.patterns.combine.Observable;
import org.mine.patterns.combine.Observer;
import org.mine.patterns.combine.duck.Quackable;

/**
 * @ClassName MallardDuck
 * @Description
 * @Author Administrator
 * @Date 2021/4/7 0007 20:47
 * @Version 1.0
 */
public class MallardDuck implements Quackable {
    private Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
