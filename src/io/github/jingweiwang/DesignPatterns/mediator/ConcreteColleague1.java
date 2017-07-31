package io.github.jingweiwang.DesignPatterns.mediator;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod1() {
        System.out.println("ConcreteColleague1 selfMethod1()");
    }

    public void dep_Method1() {
        super.mediator.doSomething1();
    }
}
