package org.mine.patterns.command.news.impl;

import org.mine.patterns.command.news.Command;
import org.mine.patterns.command.news.Stereo;

/**
 * @ClassName StereoOffCommand
 * @Description
 * @Author Administrator
 * @Date 2021/3/28 0028 16:13
 * @Version 1.0
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
