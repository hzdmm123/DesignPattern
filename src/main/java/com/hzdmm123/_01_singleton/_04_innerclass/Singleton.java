package com.hzdmm123._01_singleton._04_innerclass;

/**
 * @author 单例模式--------> 静态内部类的方式
 */
public class Singleton {

    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}

//------------------------>
//静态内部类的方式

//优点：调用getInstance的时候才会初始化。
//静态内部类在使用的时候才会被加载

//------------------------>