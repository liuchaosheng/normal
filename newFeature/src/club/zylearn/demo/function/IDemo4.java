package club.zylearn.demo.function;

import club.zylearn.vo.Person;

// 定义函数式接口
@FunctionalInterface
public interface IDemo4 {
	public Person fun4(String name,Integer age);  // 该接口只有一个方法
}
