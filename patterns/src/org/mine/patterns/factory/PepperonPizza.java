package org.mine.patterns.factory;

public class PepperonPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare PepperonPizza");
    }

    @Override
    public void bake() {
        System.out.println("bake PepperonPizza");
    }

    @Override
    public void cut() {
        System.out.println("cut PepperonPizza");
    }

    @Override
    public void box() {
        System.out.println("box PepperonPizza");
    }
}
