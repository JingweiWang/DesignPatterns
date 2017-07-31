package io.github.jingweiwang.DesignPatterns.proxy.common;

public class Client {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.request();
    }
}
