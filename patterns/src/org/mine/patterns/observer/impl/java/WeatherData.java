package org.mine.patterns.observer.impl.java;

import java.util.Observable;

/**
 * @ClassName WeatherData
 * @Description 实现java自带的Observable
 * @Author Administrator
 * @Date 2021/3/23 0023 20:49
 * @Version 1.0
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    /**
     * @Author Ryan
     * @Description 气象站测量值改变调用方法
     * @Date 20:51 2021/3/23 0023
     * @Param []
     * @return void
     */
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    /**
     * @Author Ryan
     * @Description 设置气象站数据
     * @Date 20:53 2021/3/23 0023
     * @Param [temperature, humidity, pressure]
     * @return void
     */
    public void setMeasurements(float temperature,float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
