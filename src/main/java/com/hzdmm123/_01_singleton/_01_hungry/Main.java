package com.hzdmm123._01_singleton._01_hungry;

/**
 * @author test for hungry
 */
public class Main {
    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("instance1 == instance2 ? " + (instance1 == instance2));
    }
}
