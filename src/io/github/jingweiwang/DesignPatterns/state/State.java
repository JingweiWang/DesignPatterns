package io.github.jingweiwang.DesignPatterns.state;

/**
 * 抽象状态角色
 */
public abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void handle1();

    public abstract void handle2();
}
