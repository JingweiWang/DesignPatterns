package io.github.jingweiwang.DesignPatterns.proxy.dynamic;


public class RealSubject implements Subject {

    @Override
    public void doSomething(String str) {
        System.out.println("RealSubject doSomething( " + str + " );");
    }
}
