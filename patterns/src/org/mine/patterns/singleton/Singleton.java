package org.mine.patterns.singleton;

/**
 * @ClassName Singleton
 * @Description 单例模式 利用双重检查加锁，首先检查是否实例已经创建了，如果尚未创建，才进行同步。这样
 *                      一来，只有第一次会同步，这正是我们想要的。
 * @Author Administrator
 * @Date 2021/3/27 0027 12:20
 * @Version 1.0
 */
public class Singleton {

    //volatile关键词确保：当uniqueInstance变量被初始化成Singleton实例时，多个线程正确地处理uniqueInstance
    private volatile static Singleton uniqueInstance;

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
