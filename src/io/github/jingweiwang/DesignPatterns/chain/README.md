# Chain of Responsibility 责任链模式

## 定义

- Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it. 
- 使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止。

## 应用

### 优点

- 将请求和处理分开，两者解耦，提高系统灵活性

### 缺点

- 性能问题：每个请求都是从链头遍历到链尾，特别是在链比较长的时候，性能是一个非常大的问题
- 调试不方便

### 场景

- okhttp请求
- ViewGroup事件投递

### 注意事项

- 需要控制链中节点，避免出现超长链