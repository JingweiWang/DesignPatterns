package io.github.jingweiwang.DesignPatterns.factory;

public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种皮肤是黄色的！");
    }

    @Override
    public void getTalk() {
        System.out.println("黄色人种说话听不懂，双字节！");
    }
}
