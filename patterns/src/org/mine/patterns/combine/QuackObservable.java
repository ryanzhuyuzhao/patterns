package org.mine.patterns.combine;



/**
 * @ClassName QuackObservable
 * @Description
 * @Author Administrator
 * @Date 2021/4/7 0007 22:54
 * @Version 1.0
 */
public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();
}
