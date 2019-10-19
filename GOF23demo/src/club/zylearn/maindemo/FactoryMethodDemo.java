package club.zylearn.maindemo;

import club.zylearn.design.factorymethod.AppleFactory;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		SimpleFactoryDemo.print(new AppleFactory().create());
	}

}
// 遵循了开闭原则，但是会产生或多类。