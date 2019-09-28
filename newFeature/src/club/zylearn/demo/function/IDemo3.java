package club.zylearn.demo.function;

import club.zylearn.vo.Person;

// 定义函数式接口
@FunctionalInterface
public interface IDemo3 {
	public int fun3(Person p1,Person p2);  // 该接口只有一个方法
}
