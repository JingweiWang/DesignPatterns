# State 状态模式

## 定义

- Allow an object to alter its behavior when its internal state changes. The object will appear to change its class. 
- 当一个对象内在状态改变时允许其改变行为，这个对象看起来想改变了其类。

## 应用

### 优点

- 结构清晰
- 遵循设计原则
- 封装性非常好

### 缺点

- 子类太多（类膨胀）不易管理

### 场景

- 行为随状态改变而改变的场景
- 条件、分支判断语句的替代者

### 注意事项

- 行为在受状态约束的情况下可以使用
- 状态最好不超过5个
