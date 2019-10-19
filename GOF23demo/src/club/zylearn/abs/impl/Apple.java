package club.zylearn.abs.impl;

import club.zylearn.abs.Fruit;

public class Apple implements Fruit {
	private String defaultFeature ;
	private double price ;
	private String info ;
	{
		// 构造块默认值赋值
		this.defaultFeature = "红色，圆形，甜，补充各种元素";
		this.price = 12.0;
		this.info = "苹果【特色：" + this.defaultFeature + "，价格：" + this.price + "】";
	}
	public Apple() {}
	public Apple(String defaultFeature,double price) {
		this.defaultFeature = defaultFeature;
		this.price = price;
		this.info = "苹果【特色：" + this.defaultFeature + "，价格：" + this.price + "】";
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
