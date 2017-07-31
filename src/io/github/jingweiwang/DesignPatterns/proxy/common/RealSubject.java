package io.github.jingweiwang.DesignPatterns.proxy.common;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject request()");
    }
}
