package org.mine.patterns.observer.StarWar;

import java.util.ArrayList;

/**
 * @ClassName StarWarsTest
 * @Description
 * @Author Administrator
 * @Date 2021/4/12 0012 20:17
 * @Version 1.0
 */
public class StarWarsTest {

    public static void main(String[] args) {
        Subject solarSentinel = new SolarSentinel(new ArrayList<>());
        Observer eartnBase = new EarthBase();
        solarSentinel.registerObserver(eartnBase);
        Observer marsBase = new MarsBase();
        solarSentinel.registerObserver(marsBase);
        //通知所有的观察者
        solarSentinel.notifyObservers();
    }
}
