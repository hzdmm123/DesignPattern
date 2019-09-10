package com.hzdmm123._02_proxy._01_static;

/**
 * 代理的对象
 */
public class Proxy implements Subject {
    public void request() {
        System.out.println("proxy doing.......");
        RealSubject realSubject = new RealSubject();
        realSubject.request();
        Smuggling();
        System.out.println("proxy done........");
    }

    public void Smuggling() {
        System.out.println("从香港运输到北京");
    }
}
