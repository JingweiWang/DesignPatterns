package io.github.jingweiwang.DesignPatterns.singleton;

/**
 * 懒汉式(关注线程同步)
 */
public class ConcurrentSlackerSingleton {
    private static ConcurrentSlackerSingleton instance = null;

    private ConcurrentSlackerSingleton() {
    }

    public static synchronized ConcurrentSlackerSingleton getInstance() {
        if (instance == null) {
            instance = new ConcurrentSlackerSingleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("SlackerMultiThreadSingleton doSomething()");
    }
}
