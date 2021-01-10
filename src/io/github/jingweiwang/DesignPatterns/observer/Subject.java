package io.github.jingweiwang.DesignPatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 */
public abstract class Subject {
    private List<IObserver> observerList = new ArrayList<>();

    /**
     * Attach
     */
    public void addObserver(IObserver observer) {
        observerList.add(observer);
    }

    /**
     * Detach
     */
    public void removeObserver(IObserver observer) {
        observerList.remove(observer);
    }

    /**
     * notify
     */
    public void notifyObservers() {
        for (IObserver observer : observerList) {
            observer.update();
        }
    }
}
