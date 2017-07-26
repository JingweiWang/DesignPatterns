package io.github.jingweiwang.DesignPatterns.singleton.factory;

import java.lang.reflect.Constructor;

public class FactorySingletion {
    private static Singleton instance;

    static {
        try {
            Class cl = Class.forName(Singleton.class.getName());
            Constructor constructor = cl.getDeclaredConstructor();
            constructor.setAccessible(true);
            instance = (Singleton) constructor.newInstance();
        } catch (Exception ignored) {
        }
    }

    public static Singleton getInstance() {
        return instance;
    }
}