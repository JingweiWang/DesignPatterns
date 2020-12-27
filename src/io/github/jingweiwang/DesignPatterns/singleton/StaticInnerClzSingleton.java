package io.github.jingweiwang.DesignPatterns.singleton;

/**
 * 静态内部类
 */
public class StaticInnerClzSingleton {
    private StaticInnerClzSingleton() {
    }

    public static StaticInnerClzSingleton getInstance() {
        return SingletonHolder.sInstance;
    }

    public void doSomething() {
        System.out.println("StaticInnerClzSingleton doSomething()");
    }

    private static class SingletonHolder {
        private static final StaticInnerClzSingleton sInstance = new StaticInnerClzSingleton();

        private SingletonHolder() {
        }
    }
}
