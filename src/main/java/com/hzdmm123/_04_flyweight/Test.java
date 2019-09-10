package com.hzdmm123._04_flyweight;

public class Test {
    public static void main(String[] args) {
        CharsFactory charsFactory = new CharsFactory();
        Chars charA = charsFactory.factory("1");
        Chars charB = charsFactory.factory("2");
        Chars charC = charsFactory.factory("1");
        System.out.println(charA == charB);
        System.out.println(charA == charC);
    }
}
