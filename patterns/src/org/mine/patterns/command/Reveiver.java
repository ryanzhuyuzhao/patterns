package org.mine.patterns.command;

/**
 * @filename Reveiver
 * @description 定义Receiver，知道如何实现与执行一个请求相关的操作
 * @author朱愈曌
 * @date 2019/5/17 14:01
 */
public class Reveiver {
	public void action() {
		System.out.println("执行一个命令");
	}

	public void unAction() {
		System.out.println("撤销一个命令");
	}
}
