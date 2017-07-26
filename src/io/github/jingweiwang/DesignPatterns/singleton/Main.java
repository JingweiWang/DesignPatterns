package io.github.jingweiwang.DesignPatterns.singleton;

import io.github.jingweiwang.DesignPatterns.singleton.factory.FactorySingletion;

public class Main {
    public static void main(String[] args) {
        SlackerSingleton.getInstance().doSomething();
        SlackerMultiThreadSingleton.getInstance().doSomething();
        HungrySingleton.getInstance().doSomething();
        DoubleCheckLockingSingleton.getInstance().doSomething();
        FactorySingletion.getInstance().doSomething();
        GoodSingleton.getInstance().doSomething();
    }
}
