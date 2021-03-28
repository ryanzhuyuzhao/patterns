package org.mine.patterns.command.news;

/**
 * @ClassName Stereo
 * @Description
 * @Author Administrator
 * @Date 2021/3/28 0028 16:00
 * @Version 1.0
 */
public class Stereo {

    public Stereo(String desc) {
        System.out.println(desc);
    }

    public void on() {
        System.out.println("stereo is on");
    }

    public void off() {
        System.out.println("stereo is off");
    }

    public void setCd() {
        System.out.println("stereo is set for CD input");
    }

    public void setDvd() {
        System.out.println("stereo is set for Dvd input");
    }

    public void setRadio() {
        System.out.println("stereo is set for radio inout");
    }

    public void setVolume(int volume) {
        System.out.println("stereo volume set to " + volume);
    }
}
