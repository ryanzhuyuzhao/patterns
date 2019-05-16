package org.mine.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @filename MyInvocationHandler 更新
 * @description
 * @author朱愈曌
 * @date 2019/5/16 13:55
 */
public class MyInvocationHandler implements InvocationHandler {
	//被代理的对象
	private Subject realSubject;
	//通过MyInvocationHandler的构造方法将被代理对象传递过来
	public MyInvocationHandler(Subject realSubject) {
		this.realSubject = realSubject;
	}
	//执行被代理的方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//执行方法前，执行前置通知
		IAdvice beforeAdvice = new BeforeAdvice();
		beforeAdvice.exec();
		Object result = method.invoke(this.realSubject, args);
		//在执行方法后，执行后置通知
		IAdvice afterAdvice = new AfterAdvice();
		afterAdvice.exec();
		//前置通知和后置通知都是要看具体实际的业务需求来进行添加
		return result;
	}
}
