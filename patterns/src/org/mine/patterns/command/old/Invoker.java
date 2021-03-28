package org.mine.patterns.command.old;

/**
 * @filename Invoker
 * @description 定义Invoker，要求改命令执行这个请求
 * @author朱愈曌
 * @date 2019/5/17 14:57
 */
public class Invoker {

	//调用者持有一个命令对象
	Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	//执行命令
	public void executeCommand() {
		command.execute();
	}

	//撤销命令
	public void undoCommand() {
		command.unDo();
	}
}
