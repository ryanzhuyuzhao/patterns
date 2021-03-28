package org.mine.patterns.command.news.impl;

import org.mine.patterns.command.news.Command;
import org.mine.patterns.command.news.GarageDoor;

/**
 * @ClassName GarageDoorOpenCommand
 * @Description
 * @Author Administrator
 * @Date 2021/3/27 0027 15:31
 * @Version 1.0
 */
public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }

    @Override
    public void undo() {
        garageDoor.stop();
    }
}
