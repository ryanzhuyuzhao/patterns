package org.mine.patterns.combine;

/**
 * @ClassName Quackologist
 * @Description
 * @Author Administrator
 * @Date 2021/4/8 0008 7:16
 * @Version 1.0
 */
public class Quackologist implements Observer{
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked");
    }
}
