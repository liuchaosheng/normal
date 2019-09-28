package club.zylearn.maindemo;

import club.zylearn.demo.IDemo;
import club.zylearn.demo.impl.DemoImpl;

/**
 * jdk1.8 的接口定义增强。
 * @author chaos
 *
 */
public class MainDemo {

	public static void main(String[] args) {
		IDemo demo = new DemoImpl();
		demo.print();
		demo.fun();    // 接口实例调用default定义的方法
		IDemo.demo();  // 铜鼓接口名调用static定义的方法
	}

}
