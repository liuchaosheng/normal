package club.zylearn.maindemo;

import club.zylearn.demo.StaticOuter;

public class StaticInnerDemo {

	public static void main(String[] args) {
		StaticOuter.Inner inner = new StaticOuter.Inner();
		inner.print();
		
		StaticOuter outer = new StaticOuter();
		outer.fun();
	}

}
