package org.mine.patterns.command.news;

/**
 * @ClassName Command
 * @Description 命令类
 * @Author Administrator
 * @Date 2021/3/27 0027 15:00
 * @Version 1.0
 */
public interface Command {

    void execute();

    void undo();
}
