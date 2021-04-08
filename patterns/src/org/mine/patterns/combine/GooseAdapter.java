package org.mine.patterns.combine;

import org.mine.patterns.combine.duck.Quackable;
import org.mine.patterns.combine.goose.Goose;

/**
 * @ClassName GooseAdapter
 * @Description
 * @Author Administrator
 * @Date 2021/4/7 0007 21:05
 * @Version 1.0
 */
public class GooseAdapter  implements Quackable {
    private Goose goose;
    private Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
