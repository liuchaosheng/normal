package club.zylearn.main;

import club.zylearn.demo.A;

/*
 * 如果是子类的实例化：
 * 1、为父类和子类都分配空间
 * 2、默认值赋值
 * 3、先初始化父类（构造块=》构造方法）
 * 4、后初始化子类（构造块=》构造方法）
 */
public class Demo2 {

	public static void main(String[] args) {
		A a = new A();
	}

}
