# Singleton 单例模式

## 定义

- Ensure a class has only one instance, and provide a global point of access it.
- 确保某一个类只有一个实例, 而且自行实例化并向整个系统提供这个实例。

## 类图

![](./Singleton.png)

## 实现

1. [饿汉式](./HungrySingleton.java)
2. [懒汉式](./SlackerSingleton.java)
3. [懒汉式(关注线程同步)](./ConcurrentSlackerSingleton.java)
4. [双重检查锁定](./DoubleCheckLockSingleton.java) [最佳方案]
5. [工厂方法](./factory/FactorySingleton.java)
6. [静态内部类](./StaticInnerClzSingleton.java) [最佳方案]

## 应用

### 优点

- 减少内存开支
- 减少系统性能开支
- 避免对资源的多重占用
- 可在系统设置全局访问点

### 缺点

- 可扩展性低
- 对测试不利
- 与单一职责原则有冲突

### 场景

- 要求生成唯一序列号的环境
- 整个项目需要一个共享访问点或共享数据
- 创建一个对象需要消耗的资源过多, 如要访问 I/O 和数据库等资源
- 需要定义大量的静态常量和静态方法(工具类)的环境

### 注意事项

- 高并发下, 需考虑线程同步
- 考虑对象复制情况, 不要实现 Cloneable 接口

## 拓展

### 有上限的多例模式

#### 做法

使用两个 `ArrayList` 分别存储实例和实例变量, 考虑到线程安全可以使用 `CopyOnWriteArrayList` 来替代

#### 场景

- 读取文件 系统启动时完成初始化工作, 在内存中启动固定数量的 reader 实例, 然后在需要读取文件时就可以快速响应

#### 优点

- 方便系统进行扩展
- 修正单例可能存在的性能问题
- 提供系统的响应速度

### 对单例模式的攻击的解决方案

#### 反射攻击

在构造器上做DCL，检查初始化标志位

#### 反序列化攻击

写readResolve()方法，返回已经创建好的单例