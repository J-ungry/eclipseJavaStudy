package ch02.ex02.case02;

public class Farmer {

//	private Apple apple;
//
//	public Apple getApple() {
//		return apple;
//	}
//
//	public void setApple(Apple apple) {
//		this.apple = apple;
//	}
	
	public Apple sell(int price) {
		Apple apple = new Apple(); //사과를 수확 
		apple.setPrice(price); 		//수확한 사과에 가격을 붙임 
		
		return apple;
	}
	
	
}
