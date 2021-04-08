package org.mine.patterns.combine;

import org.mine.patterns.combine.duck.Quackable;

/**
 * @ClassName QuackCounter
 * @Description
 * @Author Administrator
 * @Date 2021/4/7 0007 22:20
 * @Version 1.0
 */
public class QuackCounter implements Quackable {
    private Quackable duck;
    private static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
