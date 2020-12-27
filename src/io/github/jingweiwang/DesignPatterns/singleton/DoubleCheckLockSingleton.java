package io.github.jingweiwang.DesignPatterns.singleton;

/**
 * 双重检查锁定
 */
public class DoubleCheckLockSingleton {
    private static volatile DoubleCheckLockSingleton instance = null;

    private DoubleCheckLockSingleton() {
    }

    public static DoubleCheckLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("DoubleCheckLockingSingleton doSomething()");
    }
}
