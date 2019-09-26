package club.zylearn.main;

import club.zylearn.demo.ConExtends;

/*
 * 构造对象的过程：
 * 1、分配空间
 * 2、进行默认赋值
 * 3、调用构造块，定义属性时候的赋值会在构造块执行前
 * 4、调用构造方法
 */
public class Demo1 {
	public static void main(String[] args) {
		//ConProcess con = new ConProcess("con - msg");
		ConExtends con = new ConExtends("con - msg");
	}

}
