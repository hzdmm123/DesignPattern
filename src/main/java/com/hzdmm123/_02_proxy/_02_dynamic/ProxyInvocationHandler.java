package com.hzdmm123._02_proxy._02_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author
 */
public class ProxyInvocationHandler implements InvocationHandler {
    private Object realSubject;

    public ProxyInvocationHandler(Object realSubject) {
        this.realSubject = realSubject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object returnObject = method.invoke(realSubject, args);
        System.out.println("after");
        return returnObject;
    }
}
