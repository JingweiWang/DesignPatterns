package io.github.jingweiwang.DesignPatterns.factory;

public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception ignored) {
        }
        return (T) product;
    }
}
