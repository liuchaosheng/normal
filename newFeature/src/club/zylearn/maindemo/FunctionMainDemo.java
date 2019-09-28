package club.zylearn.maindemo;

import club.zylearn.demo.function.IDemo1;
import club.zylearn.demo.function.IDemo2;
import club.zylearn.demo.function.IDemo3;
import club.zylearn.demo.function.IDemo4;
import club.zylearn.vo.Person;

interface ITest {
	public String test(Person p);
}

public class FunctionMainDemo {

	public static void main(String[] args) {
		// 使用静态方法的引用来实例化函数式接口
		IDemo1 demo1 = Person :: isPersonAge;
		System.out.println(demo1.fun1(90));
		
		// 使用普通方法的引用来实例化函数式接口
		IDemo2 demo2 = new Person("张三",30) :: getName;
		System.out.println(demo2.fun2());
		
		// 特殊情况
		IDemo3 demo3 = Person :: compareTo;
		Person p1 = new Person("Alice",30);
		Person p2 = new Person("Brone",29);
		System.out.println(demo3.fun3(p1, p2));
		
		IDemo4 demo4 = Person :: new;
		Person person = demo4.fun4("zhaoyang", 29);
		System.out.println(person);
		
		ITest test = Person :: getName;
		System.out.println(test.test(person));
	}

}
