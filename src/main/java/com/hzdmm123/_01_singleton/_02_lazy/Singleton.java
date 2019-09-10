package com.hzdmm123._01_singleton._02_lazy;

/**
 * @author
 * 单例模式--------> 懒汉模式
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

//------------------------>
//单例对象在第一次被使用的时候被创建，延迟初始化。

//优点：如果不需要用到instance，单例对象instance就不会被创建。避免了资源可能的不必要浪费


//缺点：该模式在单线程情况没有问题，但是在多线程的情况下。
//有可能有两个线程进入 {line:16}，创建两个单例对象。存在线程安全问题。

//解决办法：
//方法加锁：{synchonized}关键字描述

//带来的影响：同步开销

//------------------------>
