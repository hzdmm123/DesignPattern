package com.hzdmm123._03_factory._02_factoryMethod;

public class Test {

    public static void main(String[] args) {

        MoonFactory moonFactory = new EggMoonCakeFactory();
        MoonCake cake = moonFactory.getMoonCake();
        cake.produce();
    }
}
/**
 * 如果需要增加类型，就需要更改factory
 */
