package io.github.jingweiwang.DesignPatterns.builder;

public class ConcreteProductB extends Builder {
    private ProductB productB = new ProductB();

    @Override
    public void setPart() {
        System.out.println("ConcreteProductB setPart()");
    }

    @Override
    public ProductB buildProduct() {
        return productB;
    }
}
