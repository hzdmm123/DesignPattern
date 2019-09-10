package com.hzdmm123._03_factory._03_abstractFactory;

public class JDDessertFactory implements DessertFactory{
    public MoonCake getMoonCake() {
        return new MeatMoonCake();
    }

    public HairyCrab getHairyCrab() {
        return new YangChengHuHairyCrab();
    }
}
