package io.github.jingweiwang.DesignPatterns.proxy.force;

public class RealSubject implements Subject {
    private Subject proxy = null;

    @Override
    public void request() {
        if (this.isProxy()) {
            System.out.println("RealSubject request()");
        } else {
            System.out.println("请使用指定代理访问");
        }
    }

    @Override
    public Subject getProxy() {
        this.proxy = new Proxy(this);
        return this.proxy;
    }

    private boolean isProxy() {
        return this.proxy != null;
    }
}
