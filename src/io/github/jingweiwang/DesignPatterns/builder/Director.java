package io.github.jingweiwang.DesignPatterns.builder;

public class Director {
    private Builder builderA = new ConcreteProductA();
    private Builder builderB = new ConcreteProductB();


    public ProductA getProductA() {
        builderA.setPart();
        return (ProductA) builderA.buildProduct();
    }

    public ProductB getProductB() {
        builderB.setPart();
        return (ProductB) builderB.buildProduct();
    }
}
