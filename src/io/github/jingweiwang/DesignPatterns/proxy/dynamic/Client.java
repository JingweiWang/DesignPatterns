package io.github.jingweiwang.DesignPatterns.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        ISubject subject = new RealSubject();

        ISubject proxy1 = (ISubject) Proxy.newProxyInstance(
                subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),
                new MyInvocationHandler(subject)
        );

        ISubject proxy2 = DynamicProxy.newProxyInstance(
                subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),
                new MyInvocationHandler(subject)
        );

        ISubject proxy3 = SubjectDynamicProxy.newProxyInstance(subject);

        proxy1.doSomething("Finish 1");
        proxy2.doSomething("Finish 2");
        proxy3.doSomething("Finish 3");
    }
}
