package com.hzdmm123._01_singleton._01_hungry;

/**
 * @author 单例模式--------> 饿汉模式
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}
//------------------------>
//类加载时候就进行初始化，属于预加载的方式。
//优点：线程安全，对象的获取速度很快。
//
//缺点：类加载的时候就创建了静态对象，如果没有被用到，浪费资源。
//------------------------>
