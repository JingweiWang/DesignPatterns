package io.github.jingweiwang.DesignPatterns.chain;

public interface IBaseTask {
    /**
     * @param isTask    节点是否有能力执行
     * @param iBaseTask 下一个任务节点
     */
    void doAction(String isTask, IBaseTask iBaseTask);
}
