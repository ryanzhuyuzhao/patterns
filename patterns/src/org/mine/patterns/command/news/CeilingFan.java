package org.mine.patterns.command.news;

/**
 * @ClassName CeilingFan
 * @Description
 * @Author Administrator
 * @Date 2021/3/28 0028 16:06
 * @Version 1.0
 */
public class CeilingFan {

    public CeilingFan(String desc) {
        System.out.println(desc);
    }

    public void on() {
        System.out.println("ceiling fan is on high");
    }

    public void off() {
        System.out.println("ceiling fan is off");
    }
}
