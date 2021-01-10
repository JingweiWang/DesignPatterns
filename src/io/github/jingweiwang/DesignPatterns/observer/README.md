# Observer 观察者模式(发布/订阅模式)

## 定义

- Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
- 定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖它的对象都会得到通知并被自动更新。

## 优点

- 观察者和被观察者之间是抽象耦合
- 建立了一套触发机制

## 缺点

- 要关注多观察者的效率问题
- 多级触发效率令人担忧