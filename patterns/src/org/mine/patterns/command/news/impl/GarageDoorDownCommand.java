package org.mine.patterns.command.news.impl;

import org.mine.patterns.command.news.Command;
import org.mine.patterns.command.news.GarageDoor;

/**
 * @ClassName GarageDoorDownCommand
 * @Description
 * @Author Administrator
 * @Date 2021/3/28 0028 16:11
 * @Version 1.0
 */
public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
