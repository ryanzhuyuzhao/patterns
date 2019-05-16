package org.mine.patterns.proxy;

import java.lang.reflect.InvocationHandler;

/**
 * @filename AOPClient
 * @description
 * @author朱愈曌
 * @date 2019/5/16 14:10
 */
public class AOPClient {
	public static void main(String[] args) {
		Subject realSubject = new RealSubject();
		InvocationHandler handler = new MyInvocationHandler(realSubject);
		ClassLoader classLoader = realSubject.getClass().getClassLoader();
		Class<?>[] interfaces = realSubject.getClass().getInterfaces();
		Subject proxySubject = DynamicProxy.newProxyInstance(classLoader, interfaces, handler);
		proxySubject.doSomething("这是一个Dynamic AOP示例！！！");
	}
}
