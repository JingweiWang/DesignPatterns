package io.github.jingweiwang.DesignPatterns.chain;

import java.util.ArrayList;
import java.util.List;

public class ChainManager implements IBaseTask {

    private List<IBaseTask> iBaseTaskList = new ArrayList<>();

    public void addTask(IBaseTask iBaseTask) {
        iBaseTaskList.add(iBaseTask);
    }

    private int index = 0;

    @Override
    public void doAction(String isTask, IBaseTask iBaseTask) {
        if (iBaseTaskList.isEmpty()) {
            return;
        }
        if (index >= iBaseTaskList.size()) {
            return;
        }

        IBaseTask bt = iBaseTaskList.get(index);
        index++;
        bt.doAction(isTask, iBaseTask);
    }
}
