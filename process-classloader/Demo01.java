class A{
	public static final String sss = "final sss";
	public static String msg = "static - msg";
	static{
		System.out.println("静态块执行 类初始化");
		msg = "静态块赋值 - msg";
	}
	public A(){
		System.out.println("构造方法被调用");
	}
}
public class Demo01{
	public static void main(String args[]) throws Exception{
		// 被动引用
		//System.out.println(A.sss);
		//System.out.println(A.class);
		//A[] array = new A[10];
		//访问静态域的时候只有真正所属类才被初始化


		// 主动引用
		//Class<?> clazz = Class.forName("A");
		//A a = new A();
		//System.out.println(A.msg);
		//java Demo01 虚拟机会初始化主类
		//子类初始化会触发父类初始化
	}
}

// 类的初始化时机
/*
	类的加载过程：
	1、二进制加载进内存，全局数据区保存类的字节码数据，包括常量池和方法代码。
	在堆区形成Class对象，该对象指向了全局数据区中的字节码数据结构。
	2、链接，关键是将符号对应实际环境的地址。
	3、初始化，执行<cinit>方法，该方法是编译的时候编译器收集的静态代码定义初始化和静态块。

*/