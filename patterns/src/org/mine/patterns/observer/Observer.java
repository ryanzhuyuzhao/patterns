package org.mine.patterns.observer;

/**
 * @ClassName Observer
 * @Description 观察者
 * @Author Administrator
 * @Date 2021/3/23 0023 20:11
 * @Version 1.0
 */
public interface Observer {

    /**
     * @Author Ryan
     * @Description 更新方法主题推送消息时会调用
     * @Date 20:12 2021/3/23 0023
     * @Param [temp, humidity, pressure]
     * @return void
     */
    void update(float temp,float humidity,float pressure);
}
