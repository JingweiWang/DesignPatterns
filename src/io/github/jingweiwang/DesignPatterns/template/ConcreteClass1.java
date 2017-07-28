package io.github.jingweiwang.DesignPatterns.template;

public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void doSomething() {
        System.out.println("ConcreteClass1 的 doSomething()");
    }

    @Override
    protected void doAnything() {
        System.out.println("ConcreteClass1 的 doAnything()");
    }
}
