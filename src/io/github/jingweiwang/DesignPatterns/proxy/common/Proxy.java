package io.github.jingweiwang.DesignPatterns.proxy.common;

public class Proxy implements Subject {
    private Subject subject = null;

    public Proxy() {
        this.subject = new RealSubject();
    }

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    private void before() {
        System.out.println("Proxy before()");
    }

    private void after() {
        System.out.println("Proxy after()");
    }
}
