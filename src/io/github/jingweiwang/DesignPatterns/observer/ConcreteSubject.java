package io.github.jingweiwang.DesignPatterns.observer;

/**
 * 具体被观察者
 */
public class ConcreteSubject extends Subject {
    public void doSomething() {
        super.notifyObservers();
    }
}
