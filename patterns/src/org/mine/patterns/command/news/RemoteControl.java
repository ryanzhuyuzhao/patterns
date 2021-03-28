package org.mine.patterns.command.news;

/**
 * @ClassName RemoteControl
 * @Description 实现遥控器
 * @Author Administrator
 * @Date 2021/3/28 0028 15:48
 * @Version 1.0
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl(int i) {
        onCommands = new Command[i];
        offCommands = new Command[i];
    }

    public void setCommand(int slot,Command onCommand,Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote Control ------\n");
        for (int i=0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName()
            + " " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
