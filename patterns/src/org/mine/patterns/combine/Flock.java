package org.mine.patterns.combine;

import org.mine.patterns.combine.duck.Quackable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName Flock
 * @Description
 * @Author Administrator
 * @Date 2021/4/7 0007 22:33
 * @Version 1.0
 */
public class Flock implements Quackable {

    private List<Quackable> quackers = new ArrayList<>();



    public void add(Quackable qucker) {
        quackers.add(qucker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable) iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.notifyObservers();
        }
    }
}
