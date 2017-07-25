package io.github.jingweiwang.DesignPatterns.factory;

public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种皮肤是黑色的！");
    }

    @Override
    public void getTalk() {
        System.out.println("黑色人种说话听不懂！");
    }
}
