package club.zylearn.maindemo;

import club.zylearn.demo.Outer;

public class MemberInnerDemo {

	public static void main(String[] args) {
		// 演示了成员内部类的内部实例化方式，就是说再外部类的方法体中实例化成员内部类对象
		Outer outer = new Outer();
		outer.fun();
	}

}
/*
 * 关于成员内部类的总结：
 * 1、作为成员存在，所以其使用必须在外部对象实例化后使用。
 * 2、可以被任意的权限修饰符修饰。
 * 3、如果想在外部进行实例化，则语法为：Outer.Inner inner = new Outer().new Inner();
 * 4、可以轻松访问外部类私有属性。
 * 5、但是其内部不能定义静态域。
 * */
