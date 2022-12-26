package edu.kh.inter.model.vo;

public class Cat extends TypeMammalia{

	@Override
	public void eat() {
		System.out.println("냐미냐미~ ");	// 추상클래스를 상속받은 Cat은 
										// 재정의 해줘야 함(추상클래스는 미완성)
		
	}

	@Override
	public void cry() {
		System.out.println("미유~~");
		
	}

	@Override
	public void move() {
		System.out.println("살금살금");
		
	}

	@Override
	public void breastfeed() {
		System.out.println("고양이가 수유를 한다.");
		
	}
	
	
}
