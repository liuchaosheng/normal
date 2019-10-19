package club.zylearn.maindemo;

import club.zylearn.abs.Engine;
import club.zylearn.abs.Seat;
import club.zylearn.abs.Tyre;
import club.zylearn.design.absfactory.GreateCarFactory;
import club.zylearn.design.absfactory.ICarFactory;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		// 抽象工厂能让产品族创建跟调用处无关联。
		// 但是其无法增加新的产品，只能增加新的产品族。
		ICarFactory factory = new GreateCarFactory();
		Engine engine = factory.createEngine();
		engine.start();
		engine.stop();
		Seat seat = factory.createSeat();
		seat.massage();
		Tyre tyre = factory.createTyre();
		tyre.work();
	}
	public static Engine createEngine(ICarFactory factory) {
		return factory.createEngine();
	}
	public static Seat createSeat(ICarFactory factory) {
		return factory.createSeat();
	}
	public static Tyre createTyre(ICarFactory factory) {
		return factory.createTyre();
	}
}
