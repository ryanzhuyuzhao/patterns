package org.mine.patterns.observer.impl.java;

import org.mine.patterns.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName CurrentCinditionsDisplay
 * @Description
 * @Author Administrator
 * @Date 2021/3/23 0023 20:54
 * @Version 1.0
 */
public class CurrentCinditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    Observable observable;

    public CurrentCinditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% ");
    }
}
