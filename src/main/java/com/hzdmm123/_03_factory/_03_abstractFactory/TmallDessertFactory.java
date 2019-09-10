package com.hzdmm123._03_factory._03_abstractFactory;

public class TmallDessertFactory implements DessertFactory {
    public MoonCake getMoonCake() {
        return new EggMoonCake();
    }

    public HairyCrab getHairyCrab() {
        return new HongZeHuHairyCrab();
    }
}
