package io.github.jingweiwang.DesignPatterns.command.perfect;

public class ConcreteCommand2 extends Command {
    public ConcreteCommand2() {
        super(new ConcreteReceiver2());
    }

    public ConcreteCommand2(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
