package com.hzdmm123._02_proxy._02_dynamic;

public class RealSubject implements Subject {
    public void request() {
        System.out.println("real subject request");
    }
}
