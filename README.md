# javascript runtime
[![Build Status](https://travis-ci.com/raylax/java-js.svg?branch=master)](https://travis-ci.com/raylax/java-js)
[![codecov](https://codecov.io/gh/raylax/java-js/branch/master/graph/badge.svg?token=jeohIpN2RI)](https://codecov.io/gh/raylax/java-js)
![license](https://img.shields.io/github/license/raylax/java-js)

## 运行效果
```java
String code = "let a; for (a = 0; a < 5;) { console.error(++a) }";
new Runtime().run(CharStreams.fromString(code));
// 1
// 2
// 3
// 4
// 5
```

## 功能实现
### 基础
- [x] 基础类型
- [x] 数组类型
- [x] 对象类型
- [x] 变量定义
- [x] 内置console
- [x] 块级作用域
- [x] 方法
- [x] 方法默认值
- [x] 自增减
- [x] 逻辑运算`&&`、`||`、`a ? b : c`、`!`
### 流程控制
- [x] if-else
- [x] switch-case
- [x] for-i/while/do-while

