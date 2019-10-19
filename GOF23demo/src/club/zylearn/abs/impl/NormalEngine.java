package club.zylearn.abs.impl;

import club.zylearn.abs.Engine;

public class NormalEngine implements Engine {

	@Override
	public void start() {
		System.out.println("普通引擎开始工作了。");
	}

	@Override
	public void stop() {
		System.out.println("普通引擎熄火了。");
	}

}
