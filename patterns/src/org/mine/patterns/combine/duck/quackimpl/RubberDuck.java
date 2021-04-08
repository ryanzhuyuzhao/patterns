package org.mine.patterns.combine.duck.quackimpl;

import org.mine.patterns.combine.Observable;
import org.mine.patterns.combine.Observer;
import org.mine.patterns.combine.duck.Quackable;

/**
 * @ClassName RubberDuck
 * @Description
 * @Author Administrator
 * @Date 2021/4/7 0007 20:50
 * @Version 1.0
 */
public class RubberDuck implements Quackable {
    private Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
        observable.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        notifyObservers();
    }
}
