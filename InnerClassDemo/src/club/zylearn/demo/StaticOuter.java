/*
 * copyright -- liuchaosheng
 */
package club.zylearn.demo;

/**
 * 演示静态内部类的使用
 * @author chaos
 * @since [2019-09-24]
 * @version [1.0]
 */
public class StaticOuter {
	private String msg = "中国人 - outer";
	public static class Inner{
		static {
			System.out.println("静态内部类--类被加载了");
		}
		private String innerMsg = "内部消息字符串";
		private static String staticMsg = "内部消息-static";
		public void print() {
			System.out.println("innerMsg = " + innerMsg);
			System.out.println("staticMsg = " + staticMsg);
		}
	}
	
	/**
	 * 测试在外部类中实例化静态内部类的实例
	 */
	public void fun() {
		Inner inner = new Inner();
		inner.print();
	}
}
/*
 * 静态内部类的总结：
 * 1、作为静态域存在，所以只能访问外部类的静态域的属性或者方法。
 * 2、可以被所有权限修饰符修饰。
 * 3、外部实例化的语法形式：StaticOuter.Inner inner = new StaticOuter.Inner();
 * 4、所以静态内部类存在的意义就是访问外部类的静态域，其也可以作为一个独立的类存在。
 * 5、没有使用到内部类，则内部类是不会被加载到内存的。
 * */
