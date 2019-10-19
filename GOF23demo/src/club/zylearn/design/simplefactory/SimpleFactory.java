package club.zylearn.design.simplefactory;

import club.zylearn.abs.Fruit;
import club.zylearn.abs.impl.Apple;
import club.zylearn.abs.impl.Orange;

// 简单工厂模式的实现
public class SimpleFactory {
	private static final String ORANGE = "orange";
	private static final String APPLE = "apple";
	public static Fruit getInstance(String value) {
		switch(value) {
		case ORANGE:
			return new Orange();
		case APPLE:
			return new Apple();
		default:
			return null;
		}
	}
}
