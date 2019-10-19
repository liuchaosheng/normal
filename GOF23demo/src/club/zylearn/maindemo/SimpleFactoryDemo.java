package club.zylearn.maindemo;

import club.zylearn.abs.Fruit;
import club.zylearn.design.simplefactory.SimpleFactory;

public class SimpleFactoryDemo {

	public static void main(String[] args) {
		print(SimpleFactory.getInstance("apple"));
	}
	public static void print(Fruit fruit) {
		if(fruit != null) {
			System.out.println(fruit.getInfo());
		}else {
			System.out.println("null");
		}
	}
}
// 调用者不需要知道子类，减少了调用者跟具体实现子类的耦合度。
// 但是违反了开闭原则，因为如果要产生新的对象，则需要修改代码。
