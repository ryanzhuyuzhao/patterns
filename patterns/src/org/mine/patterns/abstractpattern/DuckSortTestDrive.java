package org.mine.patterns.abstractpattern;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName DuckSortTestDrive
 * @Description
 * @Author Administrator
 * @Date 2021/3/29 0029 21:37
 * @Version 1.0
 */
public class DuckSortTestDrive {

    public static void main(String[] args) {
        Duck[] ducks = {new Duck("Daffy",8),
                new Duck("Dewey",2),
                new Duck("Howard",7),
                new Duck("Louie",2),
                new Duck("Donald",10),
                new Duck("Huey",2)
        };
        System.out.println("Before sorting:");
        display(ducks);
        Arrays.sort(ducks);
        System.out.println("\nAfter sorting:");
        display(ducks);
    }

    public static void display(Duck[] ducks) {
        List<Duck> duckList = Arrays.asList(ducks);
        duckList.stream().forEach(duck -> {
            System.out.println(duck);
        });
    }
}
