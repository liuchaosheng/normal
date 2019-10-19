package club.zylearn.maindemo;

import club.zylearn.design.builder.Computer;
import club.zylearn.design.builder.ComputerBuilderImpl;
import club.zylearn.design.builder.Director;

public class BuilderDemo {

	public static void main(String[] args) {
		// client端只是看见了导演者和建造者，并没有看见具体怎么创建子对象
		Computer computer = new Director().builderComputer(new ComputerBuilderImpl());
		System.out.println(computer);
	}

}

/*
 * 建造者模式是为了构建负责的对象。
 * 可以将负责的对象分成一个一个子对象创建。
 * 然后通过Director来进行组装。
 * （让客户端看不见创建的过程）
 */