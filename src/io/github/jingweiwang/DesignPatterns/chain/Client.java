package io.github.jingweiwang.DesignPatterns.chain;

public class Client {
    public static void main(String[] args) {
        ChainManager chainManager = new ChainManager();
        chainManager.addTask(new TaskOne());
        chainManager.addTask(new TaskTwo());
        chainManager.addTask(new TaskThree());

//        chainManager.doAction("ok", chainManager);
//        chainManager.doAction("no", chainManager);
        chainManager.doAction("yes", chainManager);

    }
}
