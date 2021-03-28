package org.mine.patterns.command.news.impl;

import org.mine.patterns.command.news.Command;
import org.mine.patterns.command.news.Stereo;

/**
 * @ClassName StereoOnWithCDCommand
 * @Description
 * @Author Administrator
 * @Date 2021/3/28 0028 16:11
 * @Version 1.0
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
