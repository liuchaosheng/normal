package club.zylearn.abs.impl;

import club.zylearn.abs.Tyre;

public class NormalTyre implements Tyre {

	@Override
	public void work() {
		System.out.println("普通轮胎，有磨损！");
	}

}
