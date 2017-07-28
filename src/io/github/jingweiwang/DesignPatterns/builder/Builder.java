package io.github.jingweiwang.DesignPatterns.builder;

public abstract class Builder {
    public abstract void setPart();

    public abstract Product buildProduct();
}
