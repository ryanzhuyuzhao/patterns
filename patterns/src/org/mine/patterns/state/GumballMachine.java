package org.mine.patterns.state;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName GumballMachine
 * @Description
 * @Author Administrator
 * @Date 2021/4/1 0001 7:39
 * @Version 1.0
 */
public class GumballMachine {
    /**糖果机无糖果状态*/
    private State soldOutState;

    /**糖果机无硬币状态*/
    private State noQuarterState;

    /**糖果机有硬币状态*/
    private State hasQuarterState;

    /**糖果机售卖糖果状态*/
    private State soldState;

    /**糖果机售当前状态*/
    private State state;

    /**记录糖果机内糖果数量*/
    private int count = 0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }


    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot");
        if (count > 0) {
            count--;
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "soldOutState=" + soldOutState +
                ", noQuarterState=" + noQuarterState +
                ", hasQuarterState=" + hasQuarterState +
                ", soldState=" + soldState +
                ", state=" + state +
                ", count=" + count +
                '}';
    }
}
