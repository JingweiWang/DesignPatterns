package io.github.jingweiwang.DesignPatterns.command;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        Receiver receiver1 = new ConcreteReceiver1();
        Command command1 = new ConcreteCommand1(receiver1);

        Receiver receiver2 = new ConcreteReceiver2();
        Command command2 = new ConcreteCommand2(receiver2);

        invoker.setCommand(command1);
        invoker.action();

        invoker.setCommand(command2);
        invoker.action();
    }
}
