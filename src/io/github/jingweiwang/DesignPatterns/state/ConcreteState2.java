package io.github.jingweiwang.DesignPatterns.state;

/**
 * 具体状态角色 2
 */
public class ConcreteState2 extends State {
    @Override
    public void handle1() {
        System.out.println("ConcreteState2.handle1");
        context.setCurrentState(Context.STATE1);
        context.handle1();
    }

    @Override
    public void handle2() {
        // 本状态下必须处理的逻辑
        System.out.println("ConcreteState2.handle2");
    }
}
