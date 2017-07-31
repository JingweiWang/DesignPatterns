package io.github.jingweiwang.DesignPatterns.mediator;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod2() {
        System.out.println("ConcreteColleague2 selfMethod2()");
    }

    public void dep_Method2() {
        super.mediator.doSomething2();
    }
}
