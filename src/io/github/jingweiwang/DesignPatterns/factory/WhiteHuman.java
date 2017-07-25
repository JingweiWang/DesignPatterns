package io.github.jingweiwang.DesignPatterns.factory;

public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种皮肤是白色的！");
    }

    @Override
    public void getTalk() {
        System.out.println("白色人种说话听不懂，单字节！");
    }
}
