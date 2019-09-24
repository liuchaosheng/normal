package club.zylearn.maindemo;

import club.zylearn.demo.LocalOuter;

public class LocalInnerDemo {

	public static void main(String[] args) {
		LocalOuter outer = new LocalOuter();
		outer.fun();
	}

}

/*
 * 局部内部类总结：
 * 1、局部内部类不能定义静态域。
 * 2、如果在外部类的static域中定义则只能访问static属性。
 * 3、如果在外部类的普通方法中定义，则可以访问外部类的任意属性。	
 * 4、仅在方法内能使用。
 * */
