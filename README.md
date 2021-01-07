# 6大设计原则

## 单一职责原则(SRP)

就一个类而言，应该仅有一个引起它变化的原因

## 里氏替换原则(LSP)

- 定义1：如果对每一个类型为S的对象O1，都有类型为T的对象O2，使得以T定义的所有程序P在所有的对象O1都代换成O2时，程序P的行为没有发生变化，那么类型S是类型T的子类型
- 定义2：所有引用基类的地方必须能透明地使用其子类的对象

## 依赖倒置原则(DIP)

- 高层模块不应该依赖低层模块，两者都应该依赖其抽象
- 抽象不应该依赖细节
- 细节应该依赖抽象

## 接口隔离原则(ISP)

- 定义1：客户端不应该依赖它不需要的接口
- 定义2：类间的依赖关系应该建立在最小的接口上

## 迪米特原则(LoD)

一个对象应该对其它对象有最少的了解

## 开闭原则(OCP)

软件中的对象（类、模块、函数等）应该对于扩展是开放的，对于修改是封闭的

# 设计模式

## 创建型

| No. | 设计模式 | Gof 通用名称 |
| ------- | ------- | :-------: |
| 1 | [单例模式](src/io/github/jingweiwang/DesignPatterns/singleton) | Singleton |
| 2 | [工厂方法模式](src/io/github/jingweiwang/DesignPatterns/factory) | Factory Method |
| 3 | [抽象工厂模式](src/io/github/jingweiwang/DesignPatterns/abstractFactory) | Abstract Factory |
| 4 | 建造者模式 | Builder |
| 5 | [原型模式](src/io/github/jingweiwang/DesignPatterns/prototype) | Prototype |

## 行为型

| No. | 设计模式 | Gof 通用名称 |
| ------- | ------- | :-------: |
| 6 | 迭代器模式 | Iterator |
| 7 | 命令模式 | Command |
| 8 | 解释器模式 | Interpreter |
| 9 | [责任链模式](src/io/github/jingweiwang/DesignPatterns/chain) | Chain of Responsibility |
| 10 | 观察者模式 | Observer |
| 11 | 中介者模式 | Mediator |
| 12 | 备忘录模式 | Memento |
| 13 | 状态模式 | State |
| 14 | 策略模式 | Strategy |
| 15 | [模版方法模式](src/io/github/jingweiwang/DesignPatterns/template) | Template Method |
| 16 | 访问者模式 | Visitor |

## 结构型

| No. | 设计模式 | Gof 通用名称 |
| ------- | ------- | :-------: |
| 17 | 适配器模式 | Adapter |
| 18 | 组合模式 | Composite |
| 19 | [代理模式](src/io/github/jingweiwang/DesignPatterns/proxy) | Proxy |
| 20 | 桥梁模式 | Bridge |
| 21 | 装饰模式 | Decorator |
| 22 | 门面模式 | Facade |
| 23 | 享元模式 | Flyweight |

## 参考资料

- 设计模式：可复用面向对象软件的基础, GoF.
- 设计模式之禅 (第二版), 秦小波 著.
- Android源码设计模式解析与实战, 何红辉 关爱民 著.

