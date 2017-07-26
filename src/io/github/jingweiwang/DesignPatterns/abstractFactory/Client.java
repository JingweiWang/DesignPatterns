package io.github.jingweiwang.DesignPatterns.abstractFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory1 = new Factory1();
        AbstractFactory factory2 = new Factory2();
        AbstractProductA a1 = factory1.createProductA();
        AbstractProductA a2 = factory2.createProductA();
        AbstractProductB b1 = factory1.createProductB();
        AbstractProductB b2 = factory2.createProductB();

        a1.shardMethod();
        a1.doSomething();
        a2.shardMethod();
        a2.doSomething();
        b1.shardMethod();
        b1.doSomething();
        b2.shardMethod();
        b2.doSomething();
    }
}
