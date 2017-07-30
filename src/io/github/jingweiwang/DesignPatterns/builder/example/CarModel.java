package io.github.jingweiwang.DesignPatterns.builder.example;

import java.util.ArrayList;

public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public final void run() {
        for (String actionName : this.sequence) {
            switch (actionName) {
                case "start":
                    this.start();
                    break;
                case "stop":
                    this.stop();
                    break;
                case "alarm":
                    this.alarm();
                    break;
                case "engineBoom":
                    this.engineBoom();
                    break;
                default:
                    break;
            }
        }
    }

    public final void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
