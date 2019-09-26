package club.zylearn.demo;

public class Son extends Parent {
	{
		System.out.println("Son的构造块执行了。。。。。");
	}
	public Son() {
		super();
		// 执行生成的init方法  num =100; System.out.println(num);
		// 执行 构造方法中定义的逻辑
		System.out.println("Son的构造方法执行了。。。。。");
	}
}
