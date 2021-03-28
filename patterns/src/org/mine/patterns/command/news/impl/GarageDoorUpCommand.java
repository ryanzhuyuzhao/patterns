package org.mine.patterns.command.news.impl;

import org.mine.patterns.command.news.Command;
import org.mine.patterns.command.news.GarageDoor;

/**
 * @ClassName GarageDoorUpCommand
 * @Description
 * @Author Administrator
 * @Date 2021/3/28 0028 16:10
 * @Version 1.0
 */
public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
