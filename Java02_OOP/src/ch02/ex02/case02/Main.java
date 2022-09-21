package ch02.ex02.case02;

public class Main {

	public static void main(String[] args) {

//		Apple apple = new Apple();
//		
//		Farmer farmer = new Farmer();
//		farmer.setApple(apple);
//		
//		farmer.getApple().setPrice(2000);
//		
//		int farmerPrice = (farmer.getApple().getPrice())*2;
//		
//		Retailer retailer = new Retailer();
//		retailer.setFarmer(farmer);
//		retailer.getFarmer().getApple().setPrice(farmerPrice);
//		System.out.println(retailer.getFarmer().getApple().getPrice());
		
		Farmer farmer = new Farmer();
		Retailer retailer = new Retailer();
		
		Apple apple = retailer.sell(farmer.sell(1000)); //farmer 안에서 new Apple 해주고 set으로 가격을 설정해준다 .
		System.out.println(apple.getPrice()); 
		
		
		
	}

}
