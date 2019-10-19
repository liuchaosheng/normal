package club.zylearn.abs.impl;

import club.zylearn.abs.Seat;

public class NormalSeat implements Seat {

	@Override
	public void massage() {
		System.out.println("无按摩功能！");
	}

}
