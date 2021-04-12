package org.mine.patterns.observer.StarWar;

/**
 * @ClassName Subject
 * @Description
 * @Author Administrator
 * @Date 2021/4/12 0012 20:02
 * @Version 1.0
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
