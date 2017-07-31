package io.github.jingweiwang.DesignPatterns.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleague1 c1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 c2 = new ConcreteColleague2(mediator);
        mediator.setC1(c1);
        mediator.setC2(c2);

        c1.selfMethod1();
        c1.dep_Method1();

        c2.selfMethod2();
        c2.dep_Method2();
    }
}
