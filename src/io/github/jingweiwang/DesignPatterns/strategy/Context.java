package io.github.jingweiwang.DesignPatterns.strategy;

/**
 * 封装角色（上下文角色）
 */
public class Context {

    // 抽象策略
    private Strategy strategy;

    // 构造器设置具体策略
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // 封装后的策略方法
    public void doAnything() {
        strategy.doSomething();
    }
}
