package io.github.jingweiwang.DesignPatterns.chain;

public class TaskThree implements IBaseTask {
    @Override
    public void doAction(String isTask, IBaseTask iBaseTask) {
        if ("ok".equals(isTask)) {
            System.out.println("拦截器3处理了");
        } else {
            iBaseTask.doAction(isTask, iBaseTask);
        }
    }
}
