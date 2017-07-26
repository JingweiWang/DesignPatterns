package io.github.jingweiwang.DesignPatterns.singleton;

public class SlackerMultiThreadSingleton {
    private static SlackerMultiThreadSingleton instance = null;

    private SlackerMultiThreadSingleton() {
    }

    public static synchronized SlackerMultiThreadSingleton getInstance() {
        if (instance == null) {
            instance = new SlackerMultiThreadSingleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("SlackerMultiThreadSingleton doSomething()");
    }
}
