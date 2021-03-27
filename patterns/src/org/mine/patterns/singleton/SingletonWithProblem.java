package org.mine.patterns.singleton;

/**
 * @ClassName SingletonWithProblem
 * @Description 有缺陷的单例模式
 * @Author Administrator
 * @Date 2021/3/27 0027 14:03
 * @Version 1.0
 */
public class SingletonWithProblem {

    private static SingletonWithProblem uniqueInstance;

    private SingletonWithProblem() {

    }

    public static SingletonWithProblem getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonWithProblem();
        }
        return uniqueInstance;
    }
}
