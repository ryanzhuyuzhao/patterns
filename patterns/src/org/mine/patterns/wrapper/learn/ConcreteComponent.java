package org.mine.patterns.wrapper.learn;

/**
 * @ClassName ConcreteComponent
 * @Description
 * @Author Administrator
 * @Date 2021/4/15 0015 22:46
 * @Version 1.0
 */
public class ConcreteComponent extends Component{

    @Override
    public void methodA() {
        System.out.println("被装饰者");
    }
}
