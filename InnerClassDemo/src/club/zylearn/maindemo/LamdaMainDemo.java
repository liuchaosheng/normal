package club.zylearn.maindemo;

import club.zylearn.demo.LamdaDemo;

public class LamdaMainDemo {
	public static void main(String[] args) {
		// 实例化 其中对象构造的时候会使用Lamda来实例化接口
		LamdaDemo lamdaDemo = new LamdaDemo();
		
		// 调用接口的方法
		lamdaDemo.doDemo();
	}
}
