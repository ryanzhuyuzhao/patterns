package org.mine.patterns.command.news.impl;


import org.mine.patterns.command.news.Command;
import org.mine.patterns.command.news.Light;

/**
 * @ClassName LightOnCommand
 * @Description 实现一个打开电灯的命令
 * @Author Administrator
 * @Date 2021/3/27 0027 15:07
 * @Version 1.0
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
