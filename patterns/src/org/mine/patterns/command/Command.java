package org.mine.patterns.command;

/**
 * @filename Command
 * @description 命令接口
 * @author朱愈曌
 * @date 2019/5/17 13:44
 *
 * 命令模式的定义：将一个请求封装为一个对象，从而可用不同的请求对客户进行参数化；对请求排队或记录日志，以及支持科撤销的操作，
 * 将“发出请求的对象”和“接收与执行这些请求的对象”分隔开来
 *
 *命令模式的适用性：
 * 1、抽象出待执行的动作以参数化某对象。
 * 2、在不同的时刻指定、排列和执行请求。
 * 3、支持取消操作。
 * 4、支持修改日志，这样当系统崩溃时，修改可以被重做一遍。
 * 5、有构建在原语操作上的高层操作构造一个系统。
 *
 * 命令模式的应用效果：
 * 1、command模式将调用操作的对象和实现该操作的对象解耦
 * 2、可以将多个命令装配成一个复合命令。复合命令是Composite模式的一个实例
 * 3、增加新的command很容易，无需改变已有的类
 *
 * 命令模式的参与者：
 * 1.Command
 * 声明执行操作的接口
 * 2.ConcreteCommand
 * 将一个接收者对象绑定于一个动作。调用接收者相应的操作，以实现Execute
 * 3.Client
 * 创建一个具体命令对象并设定它的接收者
 * 4.Invoker
 * 要求该命令执行这个请求
 * 5.Receiver
 * 知道如何实现与执行一个请求相关的操作。任何类都可能作为一个接收者
 */
public interface Command {
	//执行操作
	void execute();

	//撤销操作
	void unDo();
}
