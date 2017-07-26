package io.github.jingweiwang.DesignPatterns.singleton;

public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("HungrySingleton doSomething()");
    }
}
