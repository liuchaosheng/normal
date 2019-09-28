package club.zylearn.demo;

public interface IDemo {
	public abstract void print();
	public static void demo() {
		System.out.println("接口中static定义的方法。。。。");
	}
	public default void fun() {
		System.out.println("接口中default定义的方法。。。。");
	}
}
