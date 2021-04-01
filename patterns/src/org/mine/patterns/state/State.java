package org.mine.patterns.state;

/**
 * @ClassName State
 * @Description 状态接口
 * @Author Administrator
 * @Date 2021/4/1 0001 7:37
 * @Version 1.0
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
