# Strategy 策略模式

## 定义

- Define a family of algorithms, encapsulate each one, and make them interchangeable.
- 定义一组算法，将每个算法都封装起来，并且使它们之间可以互换。

## 应用

### 优点

- 算法可以自由切换
- 避免使用多重条件判断
- 扩展性良好

### 缺点

- 策略类数量增多
- 所有的策略类都需要对外暴露

### 场景

- 多个类只有在算法或者行为上稍有不同的场景
- 算法需要自由切换的场景
- 需要屏蔽算法规则的场景

### 注意事项

- 如果系统中的一个策略家族的具体策略数量超过4个，则需要考虑混合模式，解决策略类膨胀和对外暴露的问题，否则日后的系统维护就会成为一个烫手山芋，谁都不想接。
