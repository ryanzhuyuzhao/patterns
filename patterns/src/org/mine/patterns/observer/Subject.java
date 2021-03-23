package org.mine.patterns.observer;


public interface Subject {
    
    /**
     * @Author Ryan
     * @Description 注册观察者
     * @Date 20:13 2021/3/23 0023
     * @Param [o]
     * @return void
     */
    void registerObserver(Observer o);
    
    /**
     * @Author Ryan
     * @Description 删除观察者 
     * @Date 20:13 2021/3/23 0023
     * @Param [o]
     * @return void
     */
    void removeObserver(Observer o);
    
    /**
     * @Author Ryan
     * @Description 通知所有的观察者
     * @Date 20:48 2021/3/23 0023
     * @Param []
     * @return void
     */
    void notifyObservers();
}
