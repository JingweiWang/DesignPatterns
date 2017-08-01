package io.github.jingweiwang.DesignPatterns.command.perfect;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        Command command1 = new ConcreteCommand1();
        Command command2 = new ConcreteCommand2();

        invoker.setCommand(command1);
        invoker.action();

        invoker.setCommand(command2);
        invoker.action();
    }
}
