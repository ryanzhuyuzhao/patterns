package org.mine.patterns.command.news;

/**
 * @ClassName RemoteControlWithUndo
 * @Description
 * @Author Administrator
 * @Date 2021/3/28 0028 18:37
 * @Version 1.0
 */
public class RemoteControlWithUndo {
    private Command[] offCommands;
    private Command[] onCommands;
    private Command undoCommand;

    public RemoteControlWithUndo(int length) {
        offCommands = new Command[length];
        onCommands = new Command[length];
        Command noCommand = new Command() {
            @Override
            public void execute() {
                System.out.println("no command");
            }

            @Override
            public void undo() {
                System.out.println("no command");
            }
        };
        for (int i = 0; i < length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot,Command onCommand,Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("\n------ Remote Control ------\n");
        for (int i=0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + " " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
