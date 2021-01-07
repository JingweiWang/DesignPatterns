package io.github.jingweiwang.DesignPatterns.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 双重检查锁定
 */
public class DoubleCheckLockSingleton implements Serializable {
    private static volatile DoubleCheckLockSingleton instance = null;

    private static volatile boolean initFlag = false;

    // 防止反射攻击
    private DoubleCheckLockSingleton() {
        if (!initFlag) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (!initFlag) {
                    initFlag = true;
                } else {
                    throw new RuntimeException("禁止非法调用构造器");
                }
            }
        } else {
            throw new RuntimeException("禁止非法调用构造器");
        }
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

    // 防止反序列化攻击
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
