package club.zylearn.demo;

public class A {
	private int num = 100;
	{
		System.out.println(num);
	}
	public A() {
		// 分配空间
		// 执行生成的init方法  num =100; System.out.println(num);
		// 执行 构造方法中定义的逻辑
	}
}
