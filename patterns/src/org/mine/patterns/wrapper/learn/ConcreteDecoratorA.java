package org.mine.patterns.wrapper.learn;

/**
 * @ClassName ConcreteDecoratorA
 * @Description
 * @Author Administrator
 * @Date 2021/4/15 0015 22:53
 * @Version 1.0
 */
public class ConcreteDecoratorA extends Decorator{
    private Component component;

    public ConcreteDecoratorA(Component component) {
        this.component = component;
    }

    @Override
    public void methodA() {
        component.methodA();
        System.out.println("装饰者装饰");
    }

    @Override
    public void template() {
        System.out.println("子类实现");
    }
}
