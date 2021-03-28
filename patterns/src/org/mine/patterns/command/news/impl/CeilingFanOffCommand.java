package org.mine.patterns.command.news.impl;

import org.mine.patterns.command.news.CeilingFan;
import org.mine.patterns.command.news.Command;

/**
 * @ClassName CeilingFanOffCommand
 * @Description
 * @Author Administrator
 * @Date 2021/3/28 0028 16:09
 * @Version 1.0
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.on();
    }
}
