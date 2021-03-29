package org.mine.patterns.abstractpattern;

/**
 * @ClassName Duck
 * @Description
 * @Author Administrator
 * @Date 2021/3/29 0029 21:31
 * @Version 1.0
 */
public class Duck implements Comparable{
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Duck otherDuck = (Duck) o;
        if (this.weight < otherDuck.weight) {
            return -1;
        }else if (this.weight == otherDuck.weight) {
            return 0;
        }else {
            return 1;
        }
    }
}
