package io.github.jingweiwang.DesignPatterns.singleton;

import io.github.jingweiwang.DesignPatterns.singleton.factory.FactorySingleton;

public class Client {
    public static void main(String[] args) {
        SlackerSingleton.getInstance().doSomething();
        ConcurrentSlackerSingleton.getInstance().doSomething();
        HungrySingleton.getInstance().doSomething();
        DoubleCheckLockSingleton.getInstance().doSomething();
        FactorySingleton.getInstance().doSomething();
        StaticInnerClzSingleton.getInstance().doSomething();
    }
}
