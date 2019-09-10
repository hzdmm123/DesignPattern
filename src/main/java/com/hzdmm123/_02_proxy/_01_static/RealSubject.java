package com.hzdmm123._02_proxy._01_static;

/**
 * @author
 */
public class RealSubject implements Subject {
    public void request() {
        System.out.println("RealSubject: 厂家供货");
    }
}
