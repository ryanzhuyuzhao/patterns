package org.mine.patterns.wrapper.learn;

/**
 * @ClassName Decorator
 * @Description
 * @Author Administrator
 * @Date 2021/4/15 0015 22:48
 * @Version 1.0
 */
public abstract class Decorator extends Component{

    @Override
    public void methodA() {

    }

    //装饰者其他方法
    public final void methodB() {
        template();
    }

    public abstract void template();
}
