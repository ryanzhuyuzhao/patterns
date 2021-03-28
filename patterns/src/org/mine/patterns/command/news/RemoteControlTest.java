package org.mine.patterns.command.news;

import org.mine.patterns.command.news.impl.GarageDoorOpenCommand;
import org.mine.patterns.command.news.impl.LightOnCommand;

/**
 * @ClassName RemoteControlTest
 * @Description
 * @Author Administrator
 * @Date 2021/3/27 0027 15:13
 * @Version 1.0
 */
public class RemoteControlTest {
    /**
     * 命令模式将请求封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。
     * 命令模式也支持可撤销的操作。
     */
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Command lightOn = new LightOnCommand(light);
        Command garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
