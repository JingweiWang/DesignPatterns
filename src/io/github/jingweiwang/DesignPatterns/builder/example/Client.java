package io.github.jingweiwang.DesignPatterns.builder.example;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        director.getBenzModelA().run();

        director.getBenzModelB().run();

        director.getBMWModelA().run();

        director.getBMWModelB().run();
    }
}
