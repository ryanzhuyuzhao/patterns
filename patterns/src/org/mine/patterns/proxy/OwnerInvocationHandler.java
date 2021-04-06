package org.mine.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName OwnerInvocationHandler
 * @Description
 * @Author Administrator
 * @Date 2021/4/6 0006 21:33
 * @Version 1.0
 */
public class OwnerInvocationHandler implements InvocationHandler {
    private PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person,args);
            }else if (method.getName().equals("setHotOrNotRating")) {
                throw new IllegalAccessException();
            }else if (method.getName().startsWith("set")) {
                return method.invoke(person,args);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return null;
    }
}
