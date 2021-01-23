package io.github.jingweiwang.DesignPatterns.factory;

public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product1 = creator.createProduct(ConcreteProduct1.class);
        Product product2 = creator.createProduct(ConcreteProduct2.class);

        product1.shareMethod();
        product1.doSomething();
        product2.shareMethod();
        product2.doSomething();
    }
}
