package club.zylearn.design.factorymethod;

import club.zylearn.abs.Fruit;
import club.zylearn.abs.impl.Orange;

public class OrangeFactory implements IFruitFactory {

	@Override
	public Fruit create() {
		return new Orange();
	}

}
