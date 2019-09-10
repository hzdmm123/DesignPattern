package com.hzdmm123._03_factory._01_simpleFactory;

/**
 * @author
 */
public class MoonFactory {

    public MoonCake getMoonCake(String type) {
        if ("egg".equalsIgnoreCase(type)) {
            return new EggMoonCake();
        } else if ("meat".equalsIgnoreCase(type)) {
            return new EggMoonCake();
        } else if ("wuren".equalsIgnoreCase(type)) {
            return new WurenMoonCake();
        }
        return null;
    }









    public MoonCake getMoonCakeByReflect(Class clazz) {
        MoonCake moonCake = null;
        try {
            moonCake = (MoonCake) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return moonCake;
    }
}
