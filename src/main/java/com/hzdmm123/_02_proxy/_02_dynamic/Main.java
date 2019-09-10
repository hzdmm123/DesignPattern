package com.hzdmm123._02_proxy._02_dynamic;

import java.lang.reflect.Proxy;

/**
 * @author
 */
public class Main {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject proxySubject = (Subject) Proxy.newProxyInstance
                (Subject.class.getClassLoader(),
                        new Class[]{Subject.class},
                        new ProxyInvocationHandler(realSubject));
        proxySubject.request();
    }
}
