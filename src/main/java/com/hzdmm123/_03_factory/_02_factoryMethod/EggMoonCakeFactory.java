package com.hzdmm123._03_factory._02_factoryMethod;

public class EggMoonCakeFactory extends MoonFactory {

    @Override
    MoonCake getMoonCake() {
        return new EggMoonCake();
    }
}
