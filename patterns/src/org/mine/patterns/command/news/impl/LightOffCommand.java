package org.mine.patterns.command.news.impl;

import org.mine.patterns.command.news.Command;
import org.mine.patterns.command.news.Light;

/**
 * @ClassName LightOffCommand
 * @Description
 * @Author Administrator
 * @Date 2021/3/28 0028 15:57
 * @Version 1.0
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
