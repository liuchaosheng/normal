package club.zylearn.abs.impl;

import club.zylearn.abs.Fruit;

public class Orange implements Fruit {
	private String defaultFeature ;
	private double price ;
	private String info ;
	{
		// 构造块默认值赋值
		this.defaultFeature = "橘黄色，圆形，甜或者酸";
		this.price = 3.0;
		this.info = "橘子【特色：" + this.defaultFeature + "，价格：" + this.price + "】";
	}
	public Orange() {}
	public Orange(String defaultFeature,double price) {
		this.defaultFeature = defaultFeature;
		this.price = price;
		this.info = "橘子【特色：" + this.defaultFeature + "，价格：" + this.price + "】";
	}
	@Override
	public String feature() {
		return this.defaultFeature;
	}

	@Override
	public double price() {
		return this.price;
	}

	@Override
	public String getInfo() {
		return this.info;
	}

}
