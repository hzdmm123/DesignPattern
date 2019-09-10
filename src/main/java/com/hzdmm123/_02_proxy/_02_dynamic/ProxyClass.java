package com.hzdmm123._02_proxy._02_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyClass {

    private Class<?> proxy;
    private ProxyInvocationHandler handler;
    private Object realSubject;

    public ProxyClass(ProxyInvocationHandler handler, Object realSubject) {
        this.handler = handler;
        this.realSubject = realSubject;
        this.proxy = productProxyClass();
    }

    private Class<?> productProxyClass() {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class<?>[] interfaces = realSubject.getClass().getInterfaces();

        return Proxy.getProxyClass(loader, interfaces);
    }

    public Class<?> getProxy() {
        return proxy;
    }
}
