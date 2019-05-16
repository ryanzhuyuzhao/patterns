package org.mine.patterns.proxy;

/**
 * @filename BeforeAdvice
 * @description
 * @author朱愈曌
 * @date 2019/5/16 13:49
 */
public class BeforeAdvice implements IAdvice{
	/**
	 * 功能描述 在被代理的方法前执行，从而达到扩展功能
	 * @param
	 * @return void
	 * @author朱愈曌
	 * @date 2019/5/16 13:50
	 */
	@Override
	public void exec() {
		System.out.println("前置通知被执行！");
	}
}
