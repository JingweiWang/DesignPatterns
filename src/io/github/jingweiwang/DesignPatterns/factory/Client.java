package io.github.jingweiwang.DesignPatterns.factory;

public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product1 = creator.createProduct(ConcreteProduct1.class);
        Product product2 = creator.createProduct(ConcreteProduct2.class);

        product1.ShareMethod();
        product1.doSomething();
        product2.ShareMethod();
        product2.doSomething();
    }
}
