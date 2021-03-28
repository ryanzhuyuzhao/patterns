package org.mine.patterns.command.old;

/**
 * @filename Client
 * @description 定义Client，我们来测试一下我们的命令模式
 * @author朱愈曌
 * @date 2019/5/17 15:02
 */
public class Client {

	public static void main(String[] args) {
		//创建命令的接收者
		Reveiver reveiver = new Reveiver();
		//创建命令对象，并设定它的接收者
		Command command = new ConcreteCommand(reveiver);
		//创建命令执行者，并将相应的命令作为参数传递给Invoker
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		//Client端测试一下
		invoker.executeCommand();
		invoker.undoCommand();
	}
}
