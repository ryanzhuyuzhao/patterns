package org.mine.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @filename DynamicProxy
 * @description
 * @author朱愈曌
 * @date 2019/5/16 14:02
 */
public class DynamicProxy {
	/**
	 * 功能描述
	 * @param classLoader	一个ClassLoader对象，定义了由哪个ClassLoader对象，来对生产的代理进行加载
	 * @param interfaces	一个interfaces数组，表示我将要给我所代理的对象提供一组什么样的接口，如果提供一组接口给它，
	 *                         那么该代理对象就宣称实现了该接口，从而可以调用接口中的方法。即查找出真实主题类的所实现的所有的接口
	 * @param handler		一个InvocationHandler对象，表示当我这个动态代理对象在调用方法时，会关联到该InvocationHandler对象。
	 *                      该InvocationHandler与主题类有着关联
	 * @return T
	 * @author朱愈曌
	 * @date 2019/5/16 14:04
	 */
	public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler handler) {
		T t = (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
		return t;
	}
}
