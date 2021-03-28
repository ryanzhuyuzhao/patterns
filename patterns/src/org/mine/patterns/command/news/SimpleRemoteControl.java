package org.mine.patterns.command.news;

/**
 * @ClassName SimpleRemoteControl
 * @Description 实现一个简单的控制器
 * @Author Administrator
 * @Date 2021/3/27 0027 15:10
 * @Version 1.0
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
