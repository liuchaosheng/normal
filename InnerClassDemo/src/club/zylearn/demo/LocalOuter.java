/*
 * copyright ....
 */

package club.zylearn.demo;

/**
 * 演示局部内部类
 * @author chaos
 * @since [2019-09-24]
 * @version [1.0]
 */
public class LocalOuter {
	private String msg = "normal field msg";
	private static String staticMsg = "static field msg";
	public static void staticFun() {
		int data = 100;
		// 定义局部内部类
		class Inner{
			public void print() {
				// 访问方法局部变量
				System.out.println("local data = " + data);
				// 访问静态域属性
				System.out.println("staticMsg = " + staticMsg);
			}
		}
		Inner inner = new Inner();
		inner.print();
	}
	public void fun() {
		int data = 100;
		// 定义局部内部类
		class Inner{
			public void print() {
				// 访问方法局部变量
				System.out.println("local data = " + data);
				// 访问静态域属性
				System.out.println("staticMsg = " + staticMsg);
				// 访问外部类的普通属性
				System.out.println("msg = " + msg);
				// 访问外部对象
				System.out.println(LocalOuter.this.msg);
			}
		}
		Inner inner = new Inner();
		inner.print();
	}
}
