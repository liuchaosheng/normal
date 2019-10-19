package club.zylearn.design.factorymethod;

import club.zylearn.abs.Fruit;

// 工厂方法模式，将创建实现类对象的方法抽象到接口中。
public interface IFruitFactory {
	public Fruit create();
}
