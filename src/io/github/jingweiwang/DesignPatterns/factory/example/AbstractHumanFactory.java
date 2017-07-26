package io.github.jingweiwang.DesignPatterns.factory.example;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
