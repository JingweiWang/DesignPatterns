package io.github.jingweiwang.DesignPatterns.chain;

public class TaskOne implements IBaseTask {
    @Override
    public void doAction(String isTask, IBaseTask iBaseTask) {
        if ("no".equals(isTask)) {
            System.out.println("拦截器1处理了");
        } else {
            iBaseTask.doAction(isTask, iBaseTask);
        }
    }
}
