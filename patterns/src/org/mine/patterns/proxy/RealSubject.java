package org.mine.patterns.proxy;

/**
 * @filename RealSubject
 * @description
 * @author朱愈曌
 * @date 2019/5/16 13:47
 */
public class RealSubject implements Subject {
	@Override
	public void doSomething(String str) {
		System.out.println("do something..." + str);
	}
}
