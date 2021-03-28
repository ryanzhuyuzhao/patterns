package org.mine.patterns.command.news;

/**
 * @ClassName Light
 * @Description 电灯
 * @Author Administrator
 * @Date 2021/3/27 0027 15:09
 * @Version 1.0
 */
public class Light {

    public Light(String desc) {
        System.out.println(desc);
    }

    public void on() {
        System.out.println("Light is On");
    }

    public void off() {
        System.out.println("Light is Off");
    }
}
