package io.github.jingweiwang.DesignPatterns.observer;

/**
 * 具体观察者
 */
public class ConcreteObserver implements IObserver {

    private int id = 0;

    public ConcreteObserver(int id) {
        this.id = id;
    }

    @Override
    public void update() {
        System.out.println("id: " + id + " 收到消息并进行处理");
    }
}
