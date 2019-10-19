package club.zylearn.design.absfactory;

import club.zylearn.abs.Engine;
import club.zylearn.abs.Seat;
import club.zylearn.abs.Tyre;
import club.zylearn.abs.impl.GreateEngine;
import club.zylearn.abs.impl.GreateSeat;
import club.zylearn.abs.impl.GreateTyre;

public class GreateCarFactory implements ICarFactory {

	@Override
	public Engine createEngine() {
		return new GreateEngine();
	}

	@Override
	public Seat createSeat() {
		return new GreateSeat();
	}

	@Override
	public Tyre createTyre() {
		return new GreateTyre();
	}

}
