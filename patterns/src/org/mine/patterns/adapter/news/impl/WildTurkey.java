package org.mine.patterns.adapter.news.impl;

import org.mine.patterns.adapter.news.Turkey;

/**
 * @ClassName WildTurkey
 * @Description
 * @Author Administrator
 * @Date 2021/3/29 0029 19:56
 * @Version 1.0
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
