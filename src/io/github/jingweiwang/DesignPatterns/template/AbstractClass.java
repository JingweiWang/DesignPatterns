package io.github.jingweiwang.DesignPatterns.template;

public abstract class AbstractClass {
    protected abstract void doSomething();

    protected abstract void doAnything();

    public final void templateMethod() {
        this.doSomething();
        this.doAnything();
    }
}
