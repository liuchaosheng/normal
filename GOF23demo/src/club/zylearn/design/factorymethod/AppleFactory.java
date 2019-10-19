package club.zylearn.design.factorymethod;

import club.zylearn.abs.Fruit;
import club.zylearn.abs.impl.Apple;

public class AppleFactory implements IFruitFactory {

	@Override
	public Fruit create() {
		return new Apple();
	}

}
