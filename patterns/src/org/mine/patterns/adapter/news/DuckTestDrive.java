package org.mine.patterns.adapter.news;

import org.mine.patterns.adapter.news.impl.MallardDuck;
import org.mine.patterns.adapter.news.impl.WildTurkey;

/**
 * @ClassName DuckTestDrive
 * @Description
 * @Author Administrator
 * @Date 2021/3/29 0029 20:00
 * @Version 1.0
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurketAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

    }

    public static void testDuck(Duck duck) {
        duck.quack();;
        duck.fly();
    }
}
