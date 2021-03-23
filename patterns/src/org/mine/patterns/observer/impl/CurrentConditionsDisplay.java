package org.mine.patterns.observer.impl;

import org.mine.patterns.observer.DisplayElement;
import org.mine.patterns.observer.Observer;
import org.mine.patterns.observer.Subject;

/**
 * @ClassName CurrentConditionsDispllay
 * @Description
 * @Author Administrator
 * @Date 2021/3/23 0023 20:33
 * @Version 1.0
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity and " + pressure + " pressure");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
