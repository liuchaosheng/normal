package club.zylearn.design.absfactory;

import club.zylearn.abs.Engine;
import club.zylearn.abs.Seat;
import club.zylearn.abs.Tyre;

// 抽象工厂接口，提供了常见产品族的接口。
public interface ICarFactory {
	public Engine createEngine();
	public Seat createSeat();
	public Tyre createTyre();
}
