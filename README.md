# 1 引言

设计模式，即Design Patterns，是指在软件设计中，被反复使用的一种代码设计经验。 使用设计模式的目的是为了降低代码的耦合性，提高代码的内聚性，提高代码的可扩展性和可维护性。

本项目的目的在于，理解设计模式的思想，寻找设计模式思想的应用，并完成满足设计模式思想的最简单实现。

# 2 有哪些设计模式

设计模式可以分为三大类：创建型模式（Creational Patterns）、结构型模式（Structural Patterns）、行为型模式（Behavioral Patterns）。

## 2.1 创建型模式（Creational Patterns）

创建型模式关注点是如何创建对象，其核心思想是要把对象的创建和使用相分离，这样使得两者能相对独立地变换。

创建型模式包括：

- [X] 工厂方法模式：Factory Method
- [X] 抽象工厂模式：Abstract Factory
- [X] 建造者模式：Builder
- [X] 原型模式：Prototype
- [X] 单例模式：Singleton

## 2.2 结构型模式（Structural Patterns）

结构型模式主要涉及如何组合各种对象以便获得更好、更灵活的结构。虽然面向对象的继承机制提供了最基本的子类扩展父类的功能，但结构型模式不仅仅简单地使用继承，而更多地通过组合与运行期的动态组合来实现更灵活的功能。

结构型模式有：

- [X] 适配器模式（Adapter Pattern） 
- [X] 桥接模式（Bridge Pattern）
- [X] 组合模式（Composite Pattern）
- [X] 装饰器模式（Decorator Pattern）
- [X] 外观模式（Facade Pattern）
- [X] 享元模式（Flyweight Pattern）
- [X] 代理模式（Proxy Pattern）

## 2.3 行为型模式（Behavioral Patterns）

行为型模式主要涉及算法和对象间的职责分配。通过使用对象组合，行为型模式可以描述一组对象应该如何协作来完成一个整体任务。

- [X] 责任链模式（Chain of Responsibility Pattern）
- [X] 命令模式（Command Pattern）
- [X] 解释器模式（Interpreter Pattern）
- [X] 迭代器模式（Iterator Pattern）
- [ ] 中介模式（Mediator Pattern）
- [ ] 备忘录模式（Memento Pattern）
- [ ] 观察者模式（Observer Pattern）
- [ ] 状态模式（State Pattern）
- [ ] 策略模式（Strategy Pattern）
- [X] 模板方法模式（Template Method Pattern）
- [ ] 访问者模式（Visitor Pattern）

# 3 后续计划

| 版本  | 状态  | 描述                 |
|-----|-----|--------------------|
| 0.9 | 开发中 | 完成所有23种设计模式的最简实现   |
| 1.0 | 未开始 | 统一风格，增强可读性         |
| 1.1 | 未开始 | 增加UML类图的介绍         |
| 2.0 | 未开始 | 变更结构，增加设计模式应用场景的解析 |

