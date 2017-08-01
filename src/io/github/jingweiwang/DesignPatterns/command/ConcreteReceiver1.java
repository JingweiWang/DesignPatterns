package io.github.jingweiwang.DesignPatterns.command;

public class ConcreteReceiver1 extends Receiver {
    @Override
    protected void doSomething() {
        System.out.println("ConcreteReceiver1 doSomething()");
    }
}
