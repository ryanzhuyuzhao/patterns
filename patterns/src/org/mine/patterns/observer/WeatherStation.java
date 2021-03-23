package org.mine.patterns.observer;

import org.mine.patterns.observer.impl.CurrentConditionsDisplay;
import org.mine.patterns.observer.impl.WeatherData;

/**
 * @ClassName WeatherStation
 * @Description 气象站测试类
 * @Author Administrator
 * @Date 2021/3/23 0023 20:39
 * @Version 1.0
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,34.4f);
    }
}
