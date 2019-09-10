package com.hzdmm123._02_proxy._01_static;

public class Main {
    public static void main(String[] args) {
        System.out.println("准备买个电脑");

        System.out.println("代理干活了.........");
        Proxy proxy = new Proxy();
        proxy.request();
        System.out.println("done");
    }
    /**
     * 优点:
     * 1.代理模式能够协调调用者和被调用者，在一定程度上降低了耦合度。
     * 2.保护真正目标对象
     *
     *
     * 缺点：
     * 1.  可能造成处理速度变慢
     *
     */
}
