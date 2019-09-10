package com.hzdmm123._01_singleton._03_doublecheck;

/**
 * @author 单例模式--------> DoubleCheck模式
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

//------------------------>
//

//优点：资源利用率高


//缺点：多线程情况下，可以存在并发问题
//

//解决办法：
//{line:8} volatile 描述 作用：禁止指令重拍和保证可见性

// https://juejin.im/post/5c92e5b45188252d64582700
//------------------------>


