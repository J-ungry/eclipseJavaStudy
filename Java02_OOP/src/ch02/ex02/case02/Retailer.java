package ch02.ex02.case02;

public class Retailer {

//	private Farmer farmer;
//
//	public Farmer getFarmer() {
//		return farmer;
//	}
//
//	public void setFarmer(Farmer farmer) {
//		this.farmer = farmer;
//
//	}
	
	public Apple sell(Apple apple) {
		apple.setPrice(apple.getPrice() * 2); //사과에 납품가의 2배로 만듦
		
		return apple;
		
		
	}
	
	
}
