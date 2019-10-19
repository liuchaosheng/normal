package club.zylearn.design.absfactory;

import club.zylearn.abs.Engine;
import club.zylearn.abs.Seat;
import club.zylearn.abs.Tyre;
import club.zylearn.abs.impl.NormalEngine;
import club.zylearn.abs.impl.NormalSeat;
import club.zylearn.abs.impl.NormalTyre;

public class NormalCarFactory implements ICarFactory {

	@Override
	public Engine createEngine() {
		return new NormalEngine();
	}

	@Override
	public Seat createSeat() {
		return new NormalSeat();
	}

	@Override
	public Tyre createTyre() {
		return new NormalTyre();
	}

}
