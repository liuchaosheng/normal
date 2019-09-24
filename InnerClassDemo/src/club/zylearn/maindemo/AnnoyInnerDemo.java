package club.zylearn.maindemo;

import club.zylearn.demo.AnnoyOuter;

public class AnnoyInnerDemo {

	public static void main(String[] args) {
		AnnoyOuter.staticFun();
		AnnoyOuter outer = new AnnoyOuter();
		outer.fun();
	}

}
/*
 * 特殊的局部内部类，这种类只能使用一次。
 * 同样不能定义静态属性或者方法
 * */
