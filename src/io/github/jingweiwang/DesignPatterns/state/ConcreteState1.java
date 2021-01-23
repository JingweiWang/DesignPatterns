package io.github.jingweiwang.DesignPatterns.state;

/**
 * 具体状态角色 1
 */
public class ConcreteState1 extends State {
    @Override
    public void handle1() {
        // 本状态下必须处理的逻辑
        System.out.println("ConcreteState1.handle1");
    }

    @Override
    public void handle2() {
        System.out.println("ConcreteState1.handle2");
        context.setCurrentState(Context.STATE2);
        context.handle2();
    }
}
