package io.github.jingweiwang.DesignPatterns.command;

public class ConcreteReceiver2 extends Receiver {
    @Override
    protected void doSomething() {
        System.out.println("ConcreteReceiver2 doSomething()");
    }
}
