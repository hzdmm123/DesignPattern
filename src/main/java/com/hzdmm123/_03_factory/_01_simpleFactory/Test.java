package com.hzdmm123._03_factory._01_simpleFactory;

public class Test {
    public static void main(String[] args) {
        MoonFactory moonFactory = new MoonFactory();

        MoonCake moonCake = moonFactory.getMoonCake("egg");
        moonCake.produce();

        MoonCake met = moonFactory.getMoonCakeByReflect(MeatMoonCake.class);
        met.produce();
    }
}
/**
 * 如果需要增加类型，就需要更改factory
 */
