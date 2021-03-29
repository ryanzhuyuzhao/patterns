package org.mine.patterns.adapter.news.impl;

import org.mine.patterns.adapter.news.Duck;

/**
 * @ClassName MallardDuck
 * @Description
 * @Author Administrator
 * @Date 2021/3/29 0029 19:53
 * @Version 1.0
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
