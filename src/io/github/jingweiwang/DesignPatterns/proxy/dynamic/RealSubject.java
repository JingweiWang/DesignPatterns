package io.github.jingweiwang.DesignPatterns.proxy.dynamic;

/**
 * 真实主题
 */
public class RealSubject implements ISubject {
    @Override
    public void doSomething(String str) {
        System.out.println("realSubject.doSomething(\"" + str + "\");");
    }
}
