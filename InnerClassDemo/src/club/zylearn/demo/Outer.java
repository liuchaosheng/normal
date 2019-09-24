/*
 * copyright ... 
 */

package club.zylearn.demo;

/**
 * 用于测试成员内部类的使用
 * @author chaos
 * @since [2019-09-24]
 * @version [1.0]
 */
public class Outer {
	/*
	 * 外部类定义的msg属性
	 */
	private String msg = "Hello World!";
	
	// 定义成员内部类，成员内部类可以使用任意的权限修饰符修饰。
	// private 表示其只能在类内部使用
	// default 表示其可以被同一包中类使用
	// protected 表示其可以被不同包中的子类访问
	// public 表示其可以在任意位置使用 但是必须按照成员内部类的实例化语法来实例化
	class Inner{
		private String innerMsg  = "inner msg hello world!!!";
		public void print() {
			// 访问本类属性
			System.out.println("innerMsg = " + innerMsg);
			
			// 访问外部类属性
			System.out.println("msg = " + msg);
		}
	}
	/**
	 * 定义fun方法来实例化内部类对象
	 */
	public void fun() {
		Inner inner = new Inner();
		inner.print();
		System.out.println(inner.innerMsg);
	}
}
