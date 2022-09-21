package ch01.ex03.case01;

public class Falcon extends Animal{
	
	@Override
	public void move() {
		System.out.println("새가 날아다닙니덩 ");
	}
	
	public void peckAt() {
		System.out.println("매가 모이를 쫍니다");
	}
}
