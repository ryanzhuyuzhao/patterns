package org.mine.patterns.singleton;

/**
 * @ClassName SingletonTest
 * @Description
 * @Author Administrator
 * @Date 2021/3/27 0027 13:59
 * @Version 1.0
 */
public class SingletonTest {

    public static void main(String[] args) {
//        System.out.println("单例模式=============");
//        for (int j=0;j < 20;j++) {
//            Thread t =new  Thread(new Runnable() {
//                @Override
//                public void run() {
//                    Singleton t = Singleton.getInstance();
//                    System.out.println("正确单例实例：" + t);
//                }
//            });
//            t.start();
//        }
        System.out.println("有缺陷的单列模式=============");
        for (int i=0;i < 100;i++) {
            Thread t =new  Thread(new Runnable() {
                @Override
                public void run() {
                    SingletonWithProblem t = SingletonWithProblem.getInstance();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("有缺陷单例实例：" + t);
                }
            });
            t.start();
        }
    }
}
