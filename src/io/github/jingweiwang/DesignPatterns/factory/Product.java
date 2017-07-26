package io.github.jingweiwang.DesignPatterns.factory;

public abstract class Product {
    public void ShareMethod() {
        System.out.println("Product 共有方法");
    }

    public abstract void doSomething();
}
