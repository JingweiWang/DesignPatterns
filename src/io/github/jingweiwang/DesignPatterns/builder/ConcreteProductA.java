package io.github.jingweiwang.DesignPatterns.builder;

public class ConcreteProductA extends Builder {
    private ProductA productA = new ProductA();

    @Override
    public void setPart() {
        System.out.println("ConcreteProductA setPart()");
    }

    @Override
    public ProductA buildProduct() {
        return productA;
    }
}
