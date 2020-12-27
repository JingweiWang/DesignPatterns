package io.github.jingweiwang.DesignPatterns.chain;

public class TaskTwo implements IBaseTask {
    @Override
    public void doAction(String isTask, IBaseTask iBaseTask) {
        if ("yes".equals(isTask)) {
            System.out.println("拦截器2处理了");
        } else {
            iBaseTask.doAction(isTask, iBaseTask);
        }
    }
}
