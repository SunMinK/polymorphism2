package edu.kh.inter.model.service;

import edu.kh.abs.model.vo.Cat;
import edu.kh.abs.model.vo.Chicken;
import edu.kh.abs.model.vo.Dog;
import edu.kh.abs.model.vo.Eagle;
import edu.kh.abs.model.vo.Penguin;
import edu.kh.abs.model.vo.Shark;
import edu.kh.abs.model.vo.Whale;
import edu.kh.inter.model.vo.WaterLife;

public class InterfaceService {
	public void ex1() {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Whale whale = new Whale();
		
		// 조류
		Chicken chiken = new Chicken();
		Eagle eagle = new Eagle();
		Penguin penguin = new Penguin();
		
		// 어류
		Shark shark = new Shark();
		
		WaterLife[] waterLife = new WaterLife[] {
				(WaterLife) whale,(WaterLife)penguin,(WaterLife)shark };
		
		for(int i = 0; i < waterLife.length; i++) {
			waterLife[i].water();
			// 관계가 전혀 없는 것들의 관계를 만들어 주는게 인터페이스!
			// 고래, 펭귄, 상어를 묶어줄 수 있는 이유가
			// waterLife라는 인터페이스가 있기 때문이다.
		}
 	}
	
}
