package org.mine.patterns.command.news.impl;

import org.mine.patterns.command.news.CeilingFan;
import org.mine.patterns.command.news.Command;

/**
 * @ClassName CeilingFanOnCommand
 * @Description
 * @Author Administrator
 * @Date 2021/3/28 0028 16:08
 * @Version 1.0
 */
public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
