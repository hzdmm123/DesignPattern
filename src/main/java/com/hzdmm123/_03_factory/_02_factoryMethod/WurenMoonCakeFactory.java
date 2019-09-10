package com.hzdmm123._03_factory._02_factoryMethod;

public class WurenMoonCakeFactory extends MoonFactory {

    @Override
    MoonCake getMoonCake() {
        return new WurenMoonCake();
    }
}
