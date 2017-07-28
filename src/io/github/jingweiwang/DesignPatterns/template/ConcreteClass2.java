package io.github.jingweiwang.DesignPatterns.template;

public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void doSomething() {
        System.out.println("ConcreteClass2 的 doSomething()");
    }

    @Override
    protected void doAnything() {
        System.out.println("ConcreteClass2 的 doAnything()");
    }
}
