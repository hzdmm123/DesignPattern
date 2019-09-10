package com.hzdmm123._04_flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharsFactory {

    private Map<String, Chars> charsMap = new HashMap<String, Chars>();

    public Chars factory(String state) {
        Chars chars = charsMap.get(state);
        if (chars == null) {
            chars = new ConcreteChar(state);

            charsMap.put(state, chars);
        }
        return chars;
    }
}
