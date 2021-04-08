package org.mine.patterns.combine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName Observable
 * @Description
 * @Author Administrator
 * @Date 2021/4/7 0007 23:13
 * @Version 1.0
 */
public class Observable implements QuackObservable{
    private List<Observer> observers = new ArrayList<>();
    private QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
