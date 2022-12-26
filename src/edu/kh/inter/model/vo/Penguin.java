package edu.kh.inter.model.vo;

public class Penguin extends TypeBirds implements WaterLife {

	@Override
	public void eat() {
		System.out.println("팽귄이 먹는다.");
		
	}

	@Override
	public void cry() {
		System.out.println("팽귄이 운다.");
		
	}

	@Override
	public void move() {
		System.out.println("팽귄이 움직인다.");
		
	}

	@Override
	public void water() {
		System.out.println("물에서 수영을 하면서 사냥을 합니다.");
		
	}

}
