package com.hzdmm123._04_flyweight;

public class ConcreteChar implements Chars {

    private String innerState = null;

    public ConcreteChar(String state) {
        this.innerState = state;
    }
}
