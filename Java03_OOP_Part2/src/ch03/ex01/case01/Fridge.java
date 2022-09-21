package ch03.ex01.case01;

public class Fridge implements Appliance{ //상속과 구현은 다른 거시다 !!!

	@Override
	public void PowerOn() {
		System.out.println("냉장고를 켜다 ");
	}

	@Override
	public void PowerOff() {
		System.out.println("냉장고를 끄다 ");
	}

	
}
