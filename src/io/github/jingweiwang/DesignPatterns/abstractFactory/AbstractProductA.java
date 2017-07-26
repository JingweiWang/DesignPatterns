package io.github.jingweiwang.DesignPatterns.abstractFactory;

public abstract class AbstractProductA {
    public void shardMethod() {
        System.out.println("ProductA 共有方法");
    }

    public abstract void doSomething();

}
