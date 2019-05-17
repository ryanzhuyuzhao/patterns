package org.mine.patterns.command;

/**
 * @filename ConcreteCommand
 * @description 定义ConcreteCommand，将一个接收者对象绑定于一个动作
 * @author朱愈曌
 * @date 2019/5/17 14:13
 */
public class ConcreteCommand implements Command {
	//持有一个接收者Receiver的引用，绑定一个特定的操作
	Reveiver reveiver;

	public ConcreteCommand(Reveiver reveiver) {
		this.reveiver = reveiver;
	}

	@Override
	public void execute() {
		//接收者绑定执行动作
		reveiver.action();
	}

	@Override
	public void unDo() {
		//接收者绑定的撤销动作
		reveiver.unAction();
	}
}
