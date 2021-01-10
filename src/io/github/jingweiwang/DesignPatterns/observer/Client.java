package io.github.jingweiwang.DesignPatterns.observer;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        IObserver observer1 = new ConcreteObserver(1);
        IObserver observer2 = new ConcreteObserver(2);
        IObserver observer3 = new ConcreteObserver(3);
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);
        subject.doSomething();
    }
}
