package club.zylearn.abs.impl;

import club.zylearn.abs.Engine;

public class GreateEngine implements Engine {

	@Override
	public void start() {
		System.out.println("牛逼引擎开始工作了。");
	}

	@Override
	public void stop() {
		System.out.println("牛逼引擎熄火了。");
	}

}
