package org.mine.patterns.observer.StarWar;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName SolarSentinel
 * @Description
 * @Author Administrator
 * @Date 2021/4/12 0012 20:05
 * @Version 1.0
 */
public class SolarSentinel implements Subject {
    private List<Observer> observers;

    public SolarSentinel(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observers != null) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.isEmpty() && observers.indexOf(observer) >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observers.stream().forEach( observer -> {
            observer.update();
        });
    }
}
