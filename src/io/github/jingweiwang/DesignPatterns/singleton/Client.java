package io.github.jingweiwang.DesignPatterns.singleton;

import io.github.jingweiwang.DesignPatterns.singleton.factory.FactorySingleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class Client {
    public static void main(String[] args) {
        SlackerSingleton.getInstance().doSomething();
        ConcurrentSlackerSingleton.getInstance().doSomething();
        HungrySingleton.getInstance().doSomething();
        DoubleCheckLockSingleton.getInstance().doSomething();
        FactorySingleton.getInstance().doSomething();
        StaticInnerClzSingleton.getInstance().doSomething();

        try {
            reflectAttack();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            serializationAttack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 反射攻击
     *
     * @throws Exception
     */
    private static void reflectAttack() throws Exception {
        DoubleCheckLockSingleton singleton1 = DoubleCheckLockSingleton.getInstance();

        Constructor<DoubleCheckLockSingleton> constructor = DoubleCheckLockSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        DoubleCheckLockSingleton singleton2 = constructor.newInstance();

        System.out.println(singleton1 == singleton2);
    }

    /**
     * 反序列化攻击
     *
     * @throws Exception
     */
    private static void serializationAttack() throws Exception {
        DoubleCheckLockSingleton singleton1 = DoubleCheckLockSingleton.getInstance();

        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("serializationAttack"));
        os.writeObject(singleton1);
        os.close();

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("serializationAttack"));
        DoubleCheckLockSingleton singleton2 = (DoubleCheckLockSingleton) is.readObject();
        is.close();

        System.out.println(singleton1 == singleton2);
    }
}
