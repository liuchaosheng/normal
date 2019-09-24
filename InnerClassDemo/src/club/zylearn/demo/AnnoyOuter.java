/*
 * copyright .....
 */

package club.zylearn.demo;

/**
 * 用于测试匿名内部类的使用，特殊的局部内部类
 * @author 朝阳
 *
 */
public class AnnoyOuter {
	private String msg = "外部类的普通属性-message";
	private static String staticMsg = "外部类的静态属性-message";
	public static void staticFun() {
		IDemo demo = new IDemo() {
//			private static String ss = "";  不能定义静态属性或者方法
//			public static void ss() {}   不能定义静态方法
			@Override
			public void demo() {
				System.out.println("匿名内部类的方法执行");
				// 访问外部类的静态属性
				System.out.println("staticMsg = " + staticMsg);
			}
		};
		demo.demo();
	}
	public void fun() {
		IDemo demo = new IDemo() {
			@Override
			public void demo() {
				System.out.println("匿名内部类的方法执行");
				// 访问外部类的静态属性
				System.out.println("staticMsg = " + staticMsg);
				// 访问外部类的普通属性
				System.out.println("msg = " + msg);
			}
		};
		demo.demo();
	}
}
