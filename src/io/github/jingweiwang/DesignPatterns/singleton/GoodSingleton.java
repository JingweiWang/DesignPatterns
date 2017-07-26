package io.github.jingweiwang.DesignPatterns.singleton;

public class GoodSingleton {
    private GoodSingleton() {
    }

    public static GoodSingleton getInstance() {
        return GoodSingletonHolder.INSTANCE;
    }

    public void doSomething() {
        System.out.println("GoodSingleton doSomething()");
    }

    public static class GoodSingletonHolder {
        private static GoodSingleton INSTANCE = new GoodSingleton();

        private GoodSingletonHolder() {
        }
    }
}
