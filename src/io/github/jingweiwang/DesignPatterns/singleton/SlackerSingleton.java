package io.github.jingweiwang.DesignPatterns.singleton;

public class SlackerSingleton {
    private static SlackerSingleton instance = null;

    private SlackerSingleton() {
    }

    public static SlackerSingleton getInstance() {
        if (instance == null) {
            instance = new SlackerSingleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("SlackerSingleton doSomething()");
    }
}
