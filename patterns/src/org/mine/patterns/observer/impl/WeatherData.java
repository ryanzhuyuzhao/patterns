package org.mine.patterns.observer.impl;

import org.mine.patterns.observer.Observer;
import org.mine.patterns.observer.Subject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName WeatherData
 * @Description
 * @Author Administrator
 * @Date 2021/3/23 0023 20:18
 * @Version 1.0
 */
public class WeatherData implements Subject {
    
    /**所有观察者*/
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        var i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        if (observers.size() > 0) {
            for (Observer o : observers) {
                o.update(temperature,humidity,pressure);
            }
        }
    }
    
    /**
     * @Author Ryan
     * @Description 当从气象站得到更新观测值时，我们通知观察者
     * @Date 20:26 2021/3/23 0023
     * @Param []
     * @return void
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * @Author Ryan
     * @Description 气象站设置气象数据
     * @Date 20:31 2021/3/23 0023
     * @Param [temperature, humidity, pressure]
     * @return void
     */
    public void setMeasurements(float temperature,float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
