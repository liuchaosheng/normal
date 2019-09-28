package club.zylearn.demo.annoy;

import club.zylearn.demo.IDemo;

interface IAnnoy{
	public void fun1();
	public void fun2();
}

public class AnnoyDemo {
	// 定义属性的时候使用匿名内部类直接进行初始化
	private IAnnoy annoy = new IAnnoy() {
		@Override
		public void fun1() {
			System.out.println("fun1 annoy method !!!");
		}

		@Override
		public void fun2() {
			System.out.println("fun2 annoy method !!!");
		}
	};
	public void doFun() {
		this.annoy.fun1();
		this.annoy.fun2();
	}
}
