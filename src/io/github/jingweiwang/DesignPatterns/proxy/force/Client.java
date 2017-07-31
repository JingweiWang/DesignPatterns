package io.github.jingweiwang.DesignPatterns.proxy.force;

public class Client {
    public static void main(String[] args) {
        System.out.println("---第 1 次错误使用强制代理---");
        Subject proxyFalse1 = new Proxy();
        proxyFalse1.request();

        System.out.println("\n\n---第 2 次错误使用强制代理---");
        Subject subject2 = new RealSubject();
        Subject proxyFalse2 = new Proxy(subject2);
        proxyFalse2.request();

        System.out.println("\n\n---正确使用强制代理---");
        Subject subject = new RealSubject();
        Subject proxy = subject.getProxy();
        proxy.request();
    }
}
