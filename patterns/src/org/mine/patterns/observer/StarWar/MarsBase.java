package org.mine.patterns.observer.StarWar;

/**
 * @ClassName MarsBase
 * @Description
 * @Author Administrator
 * @Date 2021/4/12 0012 20:16
 * @Version 1.0
 */
public class MarsBase implements Observer{
    @Override
    public void update() {
        System.out.println("Mars receive the information");
    }
}
