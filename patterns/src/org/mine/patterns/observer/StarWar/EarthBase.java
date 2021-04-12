package org.mine.patterns.observer.StarWar;

/**
 * @ClassName EarthBase
 * @Description
 * @Author Administrator
 * @Date 2021/4/12 0012 20:14
 * @Version 1.0
 */
public class EarthBase implements Observer{
    @Override
    public void update() {
        System.out.println("Earth receive the infomation");
    }
}
