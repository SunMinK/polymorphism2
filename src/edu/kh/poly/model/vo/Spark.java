package edu.kh.poly.model.vo;

public class Spark extends Car { // 경차
	
	private double discountOffer; // 할인해택
	
	// 기본생성자
	public Spark() {} // super() 생략 시 컴파일러가 자동 추가

	public Spark(String engine, String fuel, int wheel, double discountoffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}

	public double getDiscountoffer() {
		return discountOffer;
	}

	public void setDiscountoffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	@Override
	public String toString() {
		return super.toString() + " / " + discountOffer;
	}
	
}
