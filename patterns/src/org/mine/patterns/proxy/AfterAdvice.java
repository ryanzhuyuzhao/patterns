package org.mine.patterns.proxy;

/**
 * @filename AfterAdvice
 * @description
 * @author朱愈曌
 * @date 2019/5/16 13:51
 */
public class AfterAdvice implements IAdvice {

	/**
	 * 功能描述 在被代理的方法后执行，从而达到扩展功能
	 * @param
	 * @return void
	 * @author朱愈曌
	 * @date 2019/5/16 13:52
	 */
	@Override
	public void exec() {
		System.out.println("后置通知被执行！");
	}
}
