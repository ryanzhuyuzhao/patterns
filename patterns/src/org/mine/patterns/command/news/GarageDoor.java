package org.mine.patterns.command.news;

/**
 * @ClassName GarageDoor
 * @Description
 * @Author Administrator
 * @Date 2021/3/27 0027 15:29
 * @Version 1.0
 */
public class GarageDoor {

    public GarageDoor(String desc) {
        System.out.println(desc);
    }

    public void up() {
        System.out.println("Garage Door is Up");
    }

    public void down() {
        System.out.println("Garage Door is Down");
    }

    public void stop() {
        System.out.println("Garage Door is Stop");
    }

    public void open() {
        System.out.println("Garage Door is Open");
    }
}
